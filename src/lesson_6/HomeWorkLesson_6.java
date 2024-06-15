package lesson_6;

import java.util.Arrays;
import java.util.Random;


public class HomeWorkLesson_6 {
    public static void main(String[] args) {
        // Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.

        /*
         @Pavlo FIXME: Нет решения.
                 Для определения суммы элементов одномерного массива, расположенных между минимальным и максимальным
                 значениями, вам сначала нужно найти индексы этих минимального и максимального элементов, а затем суммировать
                 элементы, расположенные между ними. Основная сложность состоит в том, чтобы правильно обработать случаи,
                 когда минимальный или максимальный элемент встречается в массиве несколько раз, а также когда минимальный
                 элемент находится после максимального..
         */
        int[] arr = new int[7];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(35);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int max1 = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("max number: " + max1);
        System.out.println("max Index: " + maxIndex);

        int min = arr[0];
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("min number: " + min);
        System.out.println("min Index: " + minIndex);

        int sum = 0;

        if (maxIndex < minIndex) {
            for (int i = ++maxIndex; i < minIndex; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = ++minIndex; i < maxIndex; i++) {
                sum += arr[i];
            }
        }

        System.out.println("sum of elements: " + sum);


        // Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.

        /*
        @Pavlo FIXME: решение верно. Но есть некоторые ограничения.
                1. Потеря индекска массива
                2. Сортировка - дорогостоящая операция.
                Попробуйте также найти минимальное и максимальное значение используя цикл.
        */
        int[] randomArr = new int[7];
        Random num = new Random();

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = num.nextInt(100);
            System.out.print(randomArr[i] + " ");
        }
        System.out.println();
        int maxNum = randomArr[0];
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i] > maxNum) {
                maxNum = randomArr[i];
            }
        }
        System.out.println("max number: " + maxNum);

        int minNum = randomArr[0];
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i] < minNum) {
                minNum = randomArr[i];
            }
        }
        System.out.println("min number: " + min);



    /*Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
     и снова распечатать (при переворачивании нежелательно создавать еще один массив). */

     /*
     @Pavlo FIXME: распечатано верно. При переворачивании массива имеется в виду его преобразование таким образом,
             чтобы элементы хранились в противоположном порядке.
             В данном случае массив не был изменен.
             Также не был использован класс Random для заполнения массива.
     */
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length / 2; i++) {
            int a = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = a;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


        // Создать последовательность случайных чисел, найти и вывести наибольшее из них.
        /*
     @Pavlo FIXME: решение верно
     */

        int[] array = {10, 17, 1, 4, 8, 33, 4, 54, 15};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max number: " + max);


        /* Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
        1 1 1 1 1
        0 1 1 1 0
        0 0 1 0 0
        0 1 1 1 0
        1 1 1 1 1   */

        int nums[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    nums[i][j] = 1;
                } else if (i == 1 && j >= 1 && j <= 3) {
                    nums[i][j] = 1;
                } else if (i == 2 && j == 2) {
                    nums[i][j] = 1;
                } else if (i == 3 && j >= 1 && j <= 3) {
                    nums[i][j] = 1;
                } else if (i == 4) {
                    nums[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
