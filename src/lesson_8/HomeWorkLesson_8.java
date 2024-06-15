package lesson_8;

import java.util.Scanner;

public class HomeWorkLesson_8 {
    public static void main(String[] args) {

        // Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.

        String str = "Есть много вариантов Lorem Ipsum, но большинство из них имеет не всегда приемлемые модификации, " +
                "например, юмористические вставки или слова, которые даже отдалённо не напоминают латынь. " +
                "Если вам нужен Lorem Ipsum для серьёзного проекта, вы наверняка не хотите какой-нибудь шутки, " +
                "скрытой в середине абзаца. Также все другие известные генераторы Lorem Ipsum используют " +
                "один и тот же текст, который они просто повторяют, пока не достигнут нужный объём. " +
                "Это делает предлагаемый здесь генератор единственным настоящим Lorem Ipsum генератором. " +
                "Он использует словарь из более чем 200 латинских слов, а также набор моделей предложений. " +
                "В результате сгенерированный Lorem Ipsum выглядит правдоподобно, не имеет повторяющихся " +
                "абзацей или \"невозможных\" слов.";

//        int n = 0;
//        char symbol;
//
//        for (int i = 0; i < str.length(); i++) {
//            symbol = str.charAt(i);
//            if (symbol == ',') {
//                n++;
//            }
//        }
//        System.out.println("В тексте содержится " + n + " знаков препинания");

        /* Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут
        разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы,
        но могут и отсутствовать. */

        System.out.println("Введите слова одной строкой через пробел");
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        System.out.println(string);

//        String[] arr = string.split(" ");
//
//        System.out.println(arr.length);

        int quantity = 0;

        if (string.length() != 0) {
            quantity++;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    quantity++;
                }
            }

        }

        System.out.println("количество слов в строке " + quantity);

    }
}