import java.util.Arrays;
import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер ДЗ 4: ");

        Integer dz4 = null;
        if (sc.hasNextInt()) {
            dz4 = sc.nextInt();
            switch (dz4) {
                case (0):
                    dz04_00();
                    break;
                case (1):
                    dz04_01();
                    break;
                case (2):
                    dz04_02();
                    break;
                case (3):
                    dz04_03();
            }
        }
        sc.close();
    }

    private static void dz04_03() {
//        Создайте 2 массива из 5 чисел.
//        Выведите массивы на консоль в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//        сообщите, что их средние арифметические равны).
    }

    private static void dz04_02() {
//        Создайте и заполните массив случайным числами и выведете
//        максимальное, минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random().
//        Пусть будет возможность создавать массив произвольного размера.
//        Пусть размер массива вводится с консоли.

        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите размер Массива: ");
//      Создание вводимого массива со случайными элементами
        Integer size = null;
        if (sc.hasNextInt()) {

            size = sc.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = (int) (Math.random() * 10);
            }
//          Вывод на экран полученного массива
            System.out.print("Полученный массив со случайными Элементами: ");
            for (int i = 0; i < size; i++) {
                System.out.print(a[i] + " ");
            }
//          вычисление мин, макс числа, среднего арифм. числа
            int max = 0, min = a[0];
            double sr_ar = 0;
            for (int i = 0; i < size; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                }
                sr_ar += a[i];
            }
            sr_ar = (sr_ar / size);
            System.out.println("\nМинимальное число в массиве: " + min
                    + "\nМаксимальное число в массиве: " + max
                    + "\nСреднее Арифметическое число всех элементов: " + sr_ar);
        }
        sc.close();
    }

    private static void dz04_01() {
//        Создайте массив целых чисел. Удалите все вхождения заданного
//        числа из массива.
//        Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//        выведите сообщения об этом.
//        В результате должен быть новый массив без указанного числа.

        int[] a = new int[10];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        a[3] = 7;
        a[4] = 9;
        a[5] = 2;
        a[6] = 4;
        a[7] = 6;
        a[8] = 8;
        a[9] = 0;
        int[] b = Arrays.copyOf(a, a.length);

        Scanner sc = new Scanner(System.in);
        System.out.print("Какое число ищем: ");

        Integer chis = null;
        if (sc.hasNextInt()) {
            chis = sc.nextInt();
            boolean bol = false;

            for (int i = 0; i < (a.length); i++) {
                if (a[i] == chis) {
                    a[i] = 0;
                    bol = true;
                }
            }
            if (bol) {
                System.out.print("Так выглядит массив после удаления: ");
                for (int i = 0; i < (a.length); i++) {
                    System.out.print(a[i] + " ");
                }
            } else System.out.println("Числа нет в массиве!");
        } else System.out.println("Ввели не число!");
        sc.close();
    }

    private static void dz04_00() {
//        Создайте массив целых чисел.Напишете программу, которая выводит
//        сообщение о том, входит ли заданное число в массив или нет.
//        Пусть число для поиска задается с консоли (класс Scanner).

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для проверки нахождения его в массиве: ");

        Integer chis = null;
        if (sc.hasNextInt()) {
            chis = sc.nextInt();

            int[] a = new int[10];
            a[0] = 1;
            a[1] = 3;
            a[2] = 5;
            a[3] = 7;
            a[4] = 9;
            a[5] = 2;
            a[6] = 4;
            a[7] = 6;
            a[8] = 8;
            a[9] = 0;
            System.out.println("длинна массива " + a.length);
            for (int i = 0; i < (a.length); i++) {
                if (a[i] == chis) {
                    System.out.println("Это число есть в массиве!");
                    break;
                }
                if (a[i] != chis) {
                    System.out.println("Числа нет в массиве!");
                    break;
                }
            }
        } else System.out.println("Ввели не число!");
        sc.close();
    }
}