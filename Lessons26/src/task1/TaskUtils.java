package task1;


public class TaskUtils {
//
//    Задача 1.
//    Напишите программу, которая запрашивает строку от пользователя и затем:
//    сообщает сколько слов в строке
//    сообщает сколько символов в строке
//    печатает строку задом наперед.
//    Сообщает сколько букв верхнего регистра.
//    Сообщает сколько букв нижнего регистра.
//    Сообщает сколько цифр в строке.

    /**
     * Сообщает сколько слов в строке
     */
    public static int wordCount(final String line) {
        final String[] words = line.split(" ");
        return words.length;
    }

    public static int countChars(final String line) {
        return line.length();
    }

    public static String reverseString(final String line) {
        String result = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            result += line.charAt(i);
        }
        return result;
    }

    public static int countUpperCaseLetters(final String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                counter++;
            }
        }
        return counter;
    }

    public static int countLowerCaseLetters(final String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLowerCase(line.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int countDigits(final String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                counter++;
            }
//            if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
//                counter++;
//            }
        }
        return counter;
    }
}