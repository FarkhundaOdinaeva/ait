package task2;

public class Text {
    public static void main(String[] args) {
        // Данный текст
        String text = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation\n" +
                "dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run\n" +
                "anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to\n" +
                "recompile. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM)\n" +
                "regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level\n" +
                "facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code\n" +
                "modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most\n" +
                "popular programming languages in use according to GitHub, particularly for client–server web\n" +
                "applications, with a reported 9 million developers.\n" +
                "\n" +
                "Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of\n" +
                "Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class\n" +
                "libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the\n" +
                "specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only\n" +
                "license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the\n" +
                "OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux\n" +
                "distributions.\n" +
                "\n" +
                "As of September 2023, Java 21 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS)\n" +
                "versions.\n" +
                "\n" +
                "Quelle: wikipedia";

    /**    // Вырезать из текста полное предложение, которое начинается с It (до .)
        String itSentence = extractSentenceStartingWith(text, "It");
        System.out.println("Предложение, начинающееся с 'It':\n" + itSentence);

        // Проверить, начинается ли текст с Java is a high-level - новый метод - startsWith().
        boolean startsWithJava = text.startsWith("Java is a high-level");
        System.out.println("Текст начинается с 'Java is a high-level': " + startsWithJava);

        // Проверить, заканчивается ли текст подстрокой wikipedia - новый метод - endsWith().
        boolean endsWithWikipedia = text.endsWith("wikipedia");
        System.out.println("Текст заканчивается на 'wikipedia': " + endsWithWikipedia);
    }

    private static String extractSentenceStartingWith(String text, String prefix) {
        int startIndex = text.indexOf(prefix);
        int endIndex = text.indexOf('.', startIndex);

        if (startIndex != -1 && endIndex != -1) {
            // Учтем точку в конце предложения
            endIndex++;
            return text.substring(startIndex, endIndex);
        } else {
            return "Предложение не найдено.";
        }
    }  */
    }
}