
import java.util.Objects;
import java.util.Scanner;

public class Car {

    static int distance = 0;
    private final String model;
    private final String color;
    static Engine engine = new Engine();

    public Car(String model, String color) {
        this.model = model;
        this.color = color;


    }

    public static void main(String[] args) {

        start();
    }

    private static void start() {
        checkEngine();

    }

    private static void checkEngine() {

        engine.start();
    }


    static void movement() {


        String answer2 = null;
        do {
            System.out.println("Поехали? да/нет");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            switch (answer) {
                case "да":
                    distance += 85;
                    System.out.println("Вжж___ ___ ___ Приехали.\nЗакончить поездку? да/нет");
                    Scanner scaner = new Scanner(System.in);
                    answer2 = scaner.next();
                    switch (answer2) {
                        case "да":
                            System.out.printf("На машине проехали всего %dкм.\n", distance);
                            engine.stop();
                        case "нет":
                            continue;
                    }
                case "нет":
                    System.out.printf("На машине проехали всего %dкм.\n", distance);
                    engine.stop();
            }
        } while (Objects.equals(answer2, "нет"));


    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}