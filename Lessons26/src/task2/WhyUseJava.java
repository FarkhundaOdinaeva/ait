package task2;
/** Дан текст:

Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.);It is one of the most popular programming
language in the world; It has a large demand in the current job market; It is easy to learn and simple to use; It is
open-source and free; It is secure, fast and powerful; It has a huge community support (tens of millions of developers);
Java is an object-oriented language which gives a clear structure to programs and allows code to be reused, lowering
development costs; As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa;
Необходимо вывести этот текст в консоль (примерно) в таком виде вместе с заголовком Why Use Java?:
*/

public class WhyUseJava {
    public static void main (String[] args) {
        System.out.println();
        // с заголовком Why Use Java?
        System.out.println("Why Use Java?\n");
        char pointChar = '\u2022';
        System.out.println(pointChar + " " + "Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.);");
        System.out.println(pointChar + " " + "It is one of the most popular programming language in the world");
        System.out.println(pointChar + " " + "It has a large demand in the current job market;");
        System.out.println(pointChar + " " + "It is easy to learn and simple to use;");
        System.out.println(pointChar + " " + "It is open-source and free;");
        System.out.println(pointChar + " " + "It is secure, fast and powerful;");
        System.out.println(pointChar + " " + "It has a huge community support (tens of millions of developers);");
        System.out.println(pointChar + " " + "Java is an object-oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs;");
        System.out.println(pointChar + " " + "As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa;");

    }

}
