import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        System.out.println("Введено число " + number);

        scanner.nextLine();

        System.out.println("Введите город в котором вы живете ?");
        String line = scanner.nextLine();
        System.out.println("Вы живете в городе " + line);
    }
}