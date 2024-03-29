
package repo;

import entity.BaseEmployee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class EmployeeRepository implements EmployeeRepositoryInterface {
    private BaseEmployee[] employees = new BaseEmployee[10]; // Массив для хранения работников
    private int size = 0; // количесвто работников
    private static int counterId = 46985;

    // employees {1, 2 ,3, null, null, ...  } // size = 3
    // employees {1, 2 ,3 }

    public boolean addEmployee(BaseEmployee employee) {
        if (size < employees.length) {
            employees[size] = employee; // employees[3] = employees {1, 2 ,3, 4, null, ...  }
            // size = 2
            // {1, 2, null, 4, null, ...  }
            // employees[2] = 5
            // {1, 2, 5, 4, null, ...  }

            // size = 3
            // {1, 2, null, 4, null, ...  }
            // employees[3] = 6
            // {1, 2, 5, 6, null, ...  }
            size++;
            employee.setId(++counterId);
            return true;
        } else {
            System.out.println("Репозиторий работников заполнен.");
            return false;
        }
    }

    public boolean removeEmployee(int id) { // employees[3] = employees {1, 2 ,3, 4, null, ...  } id = 3
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
//                // Если найден работник с заданным ID, удаляем его и сдвигаем остальных работников
                employees[i] = null;
                for (int j = i; j < size; j++) {
                    employees[j] = employees[j + 1];
                }
                // {1, 2 ,3, 4, null, ...  }
                // {1, 2 , null, 4, null, ...  }
                // {1, 2 , 4, null, ...    }
                // employees[2] = employees {1, 2 ,null, 4, null, ...  }
                size--;             // size = 3, -> size 2
                return true;
            }
        }
        System.out.println("Работник с ID " + id + " не найден.");
        return false;
    }

    public boolean removeEmployee2(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                System.out.println("Работник с ID " + id + " уволен");
                return true;
            }
        }
        System.out.println("Работник с ID " + id + " не найден.");
        return false;
    }

    public BaseEmployee findEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public BaseEmployee[] getAllEmployees() {
        BaseEmployee[] result = new BaseEmployee[size];
        for (int i = 0; i < size; i++) {
            result[i] = employees[i];
        }
        return result;
    }

    public int countEmployees() {
        return size;
    }

    @Override
    public BaseEmployee[] sortByComparator(Comparator<BaseEmployee> comparator) {
//        BaseEmployee[] sortedArray = new BaseEmployee[size];
//        for (int i = 0; i < size; i++) {
//            sortedArray[i] = employees[i];
//        }
        BaseEmployee[] sortedArray = Arrays.copyOf(employees, size);
        Arrays.sort(sortedArray, comparator);
        return sortedArray;
    }

//    @Override
//    public BaseEmployee[] filterByHireYear(int fromYear, int toYear) {
//        BaseEmployee[] copy = Arrays.copyOf(employees, size);
//
//        int filterCounter = 0;
//        for (int i = 0; i < copy.length; i++) {
//            if (copy[i].getHireYear() >= fromYear && copy[i].getHireYear() <= toYear) {
//                filterCounter++;
//            }
//        }
//
//        BaseEmployee[] result = new BaseEmployee[filterCounter];
//        for (int i = 0, j = 0; j < result.length; i++) {
//            if (copy[i].getHireYear() >= fromYear && copy[i].getHireYear() <= toYear) {
//                result[j] = copy[i];
//                j++;
//            }
//        }
//
//        return result;
//    }

    @Override
    public BaseEmployee[] filterBy(Predicate<BaseEmployee> predicate) {
        BaseEmployee[] copy = Arrays.copyOf(employees, size);

        int filterCounter = 0;
        for (int i = 0; i < copy.length; i++) {
            if (predicate.test(copy[i])) {
                filterCounter++;
            }
        }

        BaseEmployee[] result = new BaseEmployee[filterCounter];
        for (int i = 0, j = 0; j < result.length; i++) {
            if (predicate.test(copy[i])) {
                result[j] = copy[i];
                j++;
            }
        }

        return result;
    }

//    @Override
//    public BaseEmployee[] filterBySalary(double fromSalary, double toSalary) {
//        BaseEmployee[] copy = Arrays.copyOf(employees, size);
//
//        int filterCounter = 0;
//        for (int i = 0; i < copy.length; i++) {
//            if (copy[i].calculateSalary() >= fromSalary && copy[i].calculateSalary() <= toSalary) {
//                filterCounter++;
//            }
//        }
//
//        BaseEmployee[] result = new BaseEmployee[filterCounter];
//        for (int i = 0, j = 0; j < result.length; i++) {
//            if (copy[i].calculateSalary() >= fromSalary && copy[i].calculateSalary() <= toSalary) {
//                result[j] = copy[i];
//                j++;
//            }
//        }
//
//        return result;
//    }

    public BaseEmployee[] getAll() {
        return employees;
    }
}
