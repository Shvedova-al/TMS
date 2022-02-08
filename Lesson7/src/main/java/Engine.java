import java.util.Random;
import java.util.Scanner;

public class Engine {

    public void start() {
        System.out.println("Запуск двигателя");
        Random random = new Random();
        int start = random.nextInt(2);
        System.out.println(start);
        switch (start) {
            case 0 -> {
                System.out.println("Двигатель запущен.");
                Car.movement();
            }
            case 1 -> {
                System.out.println("Двигатель заглох");
                stop();
            }
        }

    }

    public void stop() {
        System.out.println("Хотите выключить машину? да/нет");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        switch (answer) {
            case "нет" -> start();
            case "да" -> System.out.println("Машина выключена");


        }

    }

}
