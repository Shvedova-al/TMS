import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
        Random random = new Random();
        int a = 1;
        int b = 7;
        int value = a + random.nextInt(b - a + 1);
        switch (value) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходной");
                break;
        }

//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int num = 1;
        int hour = 0;
        do {
            num *= 2;
            hour += 3;
            System.out.printf("%d амёб за %dч.\n", num, hour);
        } while (hour < 24);

//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 = n;
        int nums = 0;
        String str;
        if (n != 0)
            str = n1 > 0 ? "положительное" : "отрицательное";
        else str = "ни положительное, и ни отрицательное";

        for (; ; ) {
            if (n1 < 10 && n1 > -10) {
                System.out.printf("%d - это %s число, количество цифр = %d\n", n, str, ++nums);
                break;
            }
            n1 /= 10;
            nums++;
        }

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

        System.out.println("Введите день вашего рождения");
        Scanner dd = new Scanner(System.in);
        int day = dd.nextInt();
        System.out.println("Введите месяц вашего рождения");
        Scanner mth = new Scanner(System.in);
        int month = mth.nextInt();
        String zodiak;
        switch (month) {
            case 1:
                zodiak = day < 21 ? "Козерог" : "Водолей";
                break;
            case 2:
                zodiak = day < 20 ? "Водолей" : "Рыбы";
                break;
            case 3:
                zodiak = day < 21 ? "Рыбы" : "Овен";
                break;
            case 4:
                zodiak = day < 21 ? "Овен" : "Телец";
                break;
            case 5:
                zodiak = day < 22 ? "Телец" : "Близнецы";
                break;
            case 6:
                zodiak = day < 22 ? "Близнецы" : "Рак";
                break;
            case 7:
                zodiak = day < 23 ? "Рак" : "Лев";
                break;
            case 8:
                zodiak = day < 22 ? "Лев" : "Дева";
                break;
            case 9:
                zodiak = day < 24 ? "Дева" : "Весы";
                break;
            case 10:
                zodiak = day < 24 ? "Весы" : "Скорпион";
                break;
            case 11:
                zodiak = day < 24 ? "Скорпион" : "Стрелец";
                break;
            case 12:
                zodiak = day < 23 ? "Стрелец" : "Козерог";
                break;
        }
            System.out.printf("Ваш знак зодиака %s\n", zodiak);


       //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        // тут пишем логику
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        // тут пишем логику
        return 0;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        // тут пишем логику
        return 0;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // тут пишем логику
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        // тут пишем логику
    }
}
