public class Homework {
        public static void main(String[] args) {
            summ(2, 3);
            Pyramid();
            calculateSumOfDiagonalElements();
            printMatrix();
        }
//        Задачи:

//        1) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static void summ (int a, int b) {
            int sum =0;
        for (int i = 0; i < b; i++) {
            sum = sum + a;
        } System.out.println(sum);
    } 

//        2) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

    public static void Pyramid() {
        int h = 4;
        // Enter the raw
        for (int r = 1; r <= h; r++) {
            //Enter the column
            for (int k = 0; k < h + 3 + r; k++) {
                int i = h - r; //empty blocks/how many symbols in a raw
                // Build the pyramid
                int n = h + 2 + r;
                if (k < i ^ k > n)
                    System.out.print("  ");
                else if (k == h || k == h + 1 || k == h + 2) // empty zone between columns
                    System.out.print(" ");
                else
                    System.out.print(" *");
            }

            System.out.print("\n");
        }
        System.out.print("\n");

            for (int r2 = 1; r2 <= h; r2++) {
                //Enter the column
                for (int k = 0; k < h + 3 + h; k++) {
                    int i = r2 - 1; //empty blocks/how many symbols in a raw
                    // Build the pyramid
                    int n = h + 2 + h - i;
                    if (k < i ^ k > n)
                        System.out.print("  ");
                    else if (k == h || k == h + 1 || k == h + 2) // empty zone between columns
                        System.out.print(" ");
                    else
                        System.out.print(" *");
                }

                System.out.print("\n");
            }
        }

    /*
//        3) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

//        4) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

//        5) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

//        6) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

//        7) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

//        8) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7


        /**
         * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
         */
        public static void calculateSumOfDiagonalElements() {
            //пишем логику и выводим результат используя System.out.println
        }

/*
        /**
         * Шаги по реализации:
         * - Прочитать два int из консоли
         * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
         * - Заполнить массив случайными значениями (до 100)
         * - Вывести в консоль матрицу заданного размера, но:
         * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
         * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
         * - В противном случае выведите "*"
         * <p>
         * Example:
         * - Значения с консоли - 2 и 3
         * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
         * 6 11 123
         * 1 14 21
         * - Для этого значения вывод в консоли должен быть:
         * <p>
         * + * *
         * * - +
         * <p>
         * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
         */
        public static void printMatrix() {
            // тут пишем логику
        }
    }

