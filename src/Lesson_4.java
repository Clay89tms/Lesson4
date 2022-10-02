import java.nio.file.CopyOption;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer dz4 = null;

        do {
            dz4 = 0;
            System.out.print("Для выхода введите точку.\nВедите номер ДЗ 4: ");
            if (sc.hasNextInt()) {
                dz4 = sc.nextInt();
                switch (dz4) {
                    case (0):
                        System.out.println("Домашнее задание №0");
                        dz04_00();
                        //окончание?
                        break;
                    case (1):
                        System.out.println("Домашнее задание №1");
                        dz04_01();
                        //Ввели не номер задания..
                        break;
                    case (2):
                        System.out.println("Домашнее задание №2");
                        dz04_02();
                        //Отлично!
                        break;
                    case (3):
                        System.out.println("Домашнее задание №3");
                        dz04_03();
                        //Отлично!
                        break;
                    case (4):
//                    Дополнительное задание
                        System.out.println("Дополниетльное Домашнее задание №4");
                        dz04_04();
                        //Отлично!
                        break;
                    case (5):
                        dz04_05();
                        //Отлично!
                        break;
                    case (6):
                        dz04_06();
                        break;
                    case (7):
                        dz04_07();
                        break;
                    default:
                        System.out.println("нет такого Домашнего Задания!");
                }
                System.out.println();

            } else {
                System.out.println("Вы ввели не номер задания...");
                break;
            }
//            что-то не так работает ТОЧКА, потом буду править.
        } while (dz4 != '.');
        sc.close();
    }

    private static void dz04_07() {
//        Реализуйте алгоритм сортировки пузырьком.
        int[] bubble = new int[10];
        System.out.print("Исходный массив : ");
        for (int i = 0; i < bubble.length; i++) {
            bubble[i] = (int) (Math.random() * 10);
            System.out.print(bubble[i] + " ");
        }
        boolean sort = false;
        int per;
        while (!sort) {
            sort = true;
            for (int i = 0; i < bubble.length - 1; i++) {
                if (bubble[i] > bubble[i + 1]) {
                    per = bubble[i];
                    bubble[i] = bubble[i + 1];
                    bubble[i + 1] = per;
                    sort = false;
                }
            }
        }
        System.out.print("\nпосле сортировки ПУЗЫРЬКОМ : ");
        for (int i =0; i<bubble.length; i++){
            System.out.print(bubble[i] + " ");
        }

    }

    private static void dz04_06() {
//        Создайте массив строк. Заполните его произвольными именами людей.
//        Отсортируйте массив.
//        Результат выведите на консоль.
        String[] name = {"Игорь", "Андрей", "Павел", "Сергей", "Александр", "Евгений", "Михаил", "Роман"};
        System.out.println("Длинна массива : " + name.length);
        System.out.print("Изначальный массив строк : ");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        Arrays.sort(name);
        System.out.print("\nОтсортированный массив строк : ");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }

    }


    private static void dz04_05() {
//        Создайте массив и заполните массив.
//        Выведите массив на экран в строку.
//        Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

        int[] a = new int[10];
        int[] b = new int[10];
        System.out.print("Произволный исходный массив : { ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + " ");
            if (!(a[i] % 2 == 0)) {
                b[i] = 0;
            } else {
                b[i] = (int) a[i];
            }
        }
        System.out.println("}");
        System.out.print("Измененный массив : { ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("}\n");
    }

    private static void dz04_04() {
//        Создайте массив из n случайных целых чисел и выведите его на экран.
//         Размер массива пусть задается с консоли и размер массива может быть
//         больше 5 и меньше или равно 10.
//        Если n не удовлетворяет условию - выведите сообщение об этом.
//        Если пользователь ввёл не подходящее число, то программа должна
//         просить пользователя повторить ввод.
//        Создайте второй массив только из чётных элементов первого массива,
//                если они там есть, и вывести его на экран.
        Scanner sc = new Scanner(System.in);
        Integer size = null;
        Integer size2 = null;
//        Random rnd = new Random();

        do {
            System.out.print("Задайте размер массива (только >5 и <=10) : ");
            size = 0;
            size2 = 0;
            if (sc.hasNextInt()) {
                size = sc.nextInt();
                if ((size <= 5) || (size > 10)) {
                    System.out.println("Недопустимый размер массива.");
                    continue;
                }

                int[] a = new int[size];
                System.out.print("Эллементы массива 1: ");
                for (int i = 0; i < a.length; i++) {
//                    Можно так, но неудобно смотреть.
//                    a[i] = rnd.nextInt();
                    a[i] = (int) (Math.random() * 10);
                    System.out.print(a[i] + " ");

//                    Вычисляем размер массива 2
                    if ((a[i] % 2 == 0) && (a[i] != 0)) {
                        size2++;
                    }
                }

                System.out.println("\nРазмер массива 2 : " + size2);
                int[] b = new int[size2];
                System.out.print("Эллементы массива 2: ");
                for (int i = 0, j = 0; i < a.length; i++) {
                    if ((a[i] != 0) && (a[i] % 2 == 0)) {
                        b[j] = (int) a[i];
                        System.out.print(b[j] + " ");
                        j++;
                    }
                }

            } else {
                System.out.println("Введено не число!");
                break;
            }
        } while ((size > 10) || (size <= 5));
        System.out.println();
    }

    private static void dz04_03() {
//        Создайте 2 массива из 5 чисел.
//        Выведите массивы на консоль в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//        сообщите, что их средние арифметические равны).

        int[] a = {9, 5, 3, 5, 7};
        int[] b = {7, 8, 4, 5, 5};
        double a_sr = 0, b_sr = 0;
        int ab = 0, bb = 0;

        System.out.print("Массив 1 : { ");
        for (int i = 0; i < a.length; i++) {
            a_sr += a[i];
            System.out.print(a[i] + " ");
        }
        a_sr = (a_sr / a.length);
        System.out.println("}\nСреднее Арифметическое массива 1 : " + a_sr);

        System.out.print("Массив 2 : { ");
        for (int i = 0; i < b.length; i++) {
            b_sr += b[i];
            System.out.print(b[i] + " ");
        }
        b_sr = (b_sr / b.length);
        System.out.println("}\nСреднее Арифметическое массива 2 : " + b_sr);

//        Приверка массива 1 и 2, какой больше или равны
        if (a_sr >= b_sr) {
            if (a_sr > b_sr) {
                System.out.println("Среднее арифметической Массива №1 больше №2");
            } else {
                System.out.println("Среднее арифметической Массива №1 равно №2");
            }
        } else {
            System.out.println("Среднее арифметической Массива №2 больше №1");
        }
//        Можно и так вывести массив на экран
//        System.out.println("Первый массив: {" + a[0] + ", " + a[1] + ", " + a[2]
//                + ", " + a[3] + ", " + a[4] + "}");
//        System.out.println("Второй массив: {" + b[0] + ", " + b[1] + ", " + b[2]
//                + ", " + b[3] + ", " + b[4] + "}");
//        Высчитать среднее арифметическое.
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
                System.out.println();
            } else System.out.println("Числа нет в массиве!");
        } else System.out.println("Ввели не число!");
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
    }
}