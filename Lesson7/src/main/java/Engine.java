import java.util.Scanner;

class Engine {
    public String type;

    Engine(String type) {
        this.type = type;
    }


    static void start() {
        Petrol.checkPetrol();
        System.out.println("Машина завелась.\nПоехали? да/нет");
        Scanner scanner = new Scanner(System.in);
        String answer2 = scanner.next();
        switch (answer2) {
            case "да":
                Car.movement();
            case "нет":
                stop();
        }

    }


    private static void stop() {

        Main.stop();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



