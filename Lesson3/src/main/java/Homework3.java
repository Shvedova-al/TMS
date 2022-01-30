
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        // Task1
        for (char alpha = 'a'; alpha <= 'z'; alpha++) {
            System.out.print(alpha);
        }
        System.out.println("\n");
        for (char alpha = 'A'; alpha <= 'Z'; alpha++) {
            System.out.print(alpha);
        }
        System.out.print("\n");

        //Task2

        System.out.println("Введите целое число");

        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int num = in.nextInt();
            if (num % 2 == 0) {
                System.out.println("Вы ввели четное число");
            } else {
                System.out.println("Вы ввели нечетное число");
            }
        } else {
            System.out.println("Введенное число не соответствует условию");
        }


        //Task3

        System.out.println("Введите 3 вещественных числа");
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        num3 = Math.abs(num3);

        double min = Math.min(num1, num2);
        System.out.println(Math.min(min, num3));


        //Task4.1 correct

        System.out.println("Введите число от 0 до 28800");

        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        System.out.printf("%d\n", num);
        for (
                int hour = 7, sec = 25200;
                hour >= 1; hour--, sec -= 3600) {
            if (num < 28800 && num >= sec) {
                System.out.printf("До конца рабочего дня %dч.\n", hour);
                break;
            } else if (num == 28800) {
                System.out.println("До конца рабочего дня 8ч.");
                break;
            } else if (num < 3600) {
                System.out.println("До конца рабочего дня менее часа");
                break;
            }

        }


        //Task 4.2
/*

            private static void display (int value) {
                Random random = new Random();
                value = random.nextInt(28800);
                display(value);

                int hour = value / 3600;
                String result;
                switch (hour) {
                    case 0:
                        result = "Осталось менее часа";
                        break;
                    case 1:
                        result = "Остался 1 час";
                        break;
                    case 2:
                        result = "Осталось 2 часа";
                        break;
                    case 3:
                        result = "Осталось 3 часа";
                        break;
                    case 4:
                        result = "Осталось 4 часа";
                        break;
                    case 5:
                        result = "Осталось 5 часов";
                        break;
                    case 6:
                        result = "Осталось 6 часов";
                        break;
                    case 7:
                        result = "Осталось 7 часов";
                        break;
                    case 8:
                        result = "Осталось 8 часов";
                        break;

                }
                System.out.println(result);
            }
        }
*/
        //Task 5

        System.out.println("       byte	 short  char   int   long  float  double   boolean");
        System.out.println("byte:    т    ня     я     ня     ня     ня     ня        х   ");
        System.out.println("short:   я     т     я     ня     ня     ня     ня        х   ");
        System.out.println("char:    я     я     т     ня     ня     ня     ня        х   ");
        System.out.println("int:     я     я     я      т     ня     ня     ня        х   ");
        System.out.println("long:    я     я     я      я      т     ня     ня        х   ");
        System.out.println("float:   я     я     я      я      я      т     ня        х   ");
        System.out.println("double:  я     я     я      я      я      я      т        х   ");
    }
}
/*
        //Task 6
        public static int average ( int[] array){
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            return (double) sum / array.length;


            public static int max ( int[] array){
                int maxvalue = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > maxvalue)
                        maxvalue = array[i];
                }
                return max;
            }
        }
    }
}





/*
    //Задачи:
    //1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

    //2)Проверка четности числа
    //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
    // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
    // Если пользователь введёт не целое число, то сообщать ему об ошибке.

    //3) Меньшее по модулю число
    //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
    // пользователем вещественных чисел с консоли.

    //4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
    // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
    // когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
    // (т.е. рабочий день закончился).
    //Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
    // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
    // сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
    //Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
    // далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
    // выводиться фраза о количестве полных часов, содержащихся в n секундах.

    //5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn


     * 6) Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0


    }


     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10

    public static int max(int[] array) {
        return 0;
        }
 */
