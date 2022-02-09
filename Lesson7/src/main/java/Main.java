public class Main {

    public static void main(String[] args) {
        Car car = new Car("бмв", 2015, "бензин", 50);
        Car.displayInfo();
        Car.start();
    }

    public static void stop() {
        Car.stop();
        Car.distance();
        System.out.println("Топлива осталось " + Car.levelPetrol + "л.");
    }
}

