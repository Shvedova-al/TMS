
import java.util.Objects;
import java.util.Scanner;

public class Car {

    private int petrol = 0;
    private static int distance = 0;
    String model;
    int year;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void start() {
        final Engine engine = new Engine();
        engine.start();
    }

    public static void movement() {
        String answer2;
        String answer;
        do {
            System.out.println("Поехали? да/нет");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.next();
            switch (answer) {
                case "да":
                    distance += 85;
                    System.out.println("Вжж___ ___ ___ Приехали.\nЗакончить поездку? да/нет");
                    Scanner scaner = new Scanner(System.in);
                    answer2 = scaner.next();
                    switch (answer2) {
                        case "да":
                            break;
                        case "нет":
                            continue;
                    }
                case "нет":
                    break;

            }
        } while (Objects.equals(answer, "нет"));
    }

    public static void stop() {
        System.out.println("Хотите выключить машину? да/нет");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        switch (answer) {
            case "нет" -> start();
            case "да" -> System.out.println("Машина выключена");


        }

    }

    public static void distance() {
        System.out.printf("На машине проехали всего %dкм.\n", distance);
    }
}