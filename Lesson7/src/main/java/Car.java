import java.util.Scanner;

class Car {

    private static String model;
    private static int year;
    private static Engine engine = new Engine("бензин");
    private Petrol petrol = new Petrol(50);


    public Car(String model, int year, String typeEngine, int levelPetrol) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(typeEngine);
        this.petrol = new Petrol(levelPetrol);
    }

    public static void displayInfo() {
        Car car = new Car(model, year, engine.type, levelPetrol);
        System.out.println(car);

    }


    static int levelPetrol;
    private static int distance = 0;


    static void start() {

        Engine.start();
    }


    static void movement() {
        String answer;
        distance += 85;
        levelPetrol -= 5;
        System.out.println("Вжж___ ___ ___ Приехали.\nЗакончить поездку? да/нет");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        switch (answer) {
            case "да":
                Main.stop();
            case "нет":
                movement();

        }
    }

    static void stop() {
        System.out.println("Хотите выключить машину? да/нет");
        Scanner scanner = new Scanner(System.in);
        String answer3 = scanner.next();
        switch (answer3) {
            case "нет" -> Car.start();
            case "да" -> System.out.println("Машина выключена");
        }

    }

    static void distance() {
        System.out.printf("На машине проехали всего %dкм.\n", distance);

    }

    public static int getLevelPetrol() {
        return levelPetrol;
    }

    public static void setLevelPetrol(int levelPetrol) {
        Car.levelPetrol = levelPetrol;
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public Petrol getPetrol() {
        return petrol;
    }
}