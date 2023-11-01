package comparators;


import entity.BaseEmployee;

import java.util.Comparator;

public class EmployeeHireYearComparator implements Comparator<BaseEmployee> {

    @Override
    public int compare(BaseEmployee o1, BaseEmployee o2) {
        return o1.getHireYear() - o2.getHireYear();
    }
}
