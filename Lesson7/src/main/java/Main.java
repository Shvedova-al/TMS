public class Main {

    public static void main(String[] args) {
        System.out.println("Ваша машина: " + new Car("Toyota", 2015));

        start();
        stop();
        checkDistance();
        checkPetrol();

    }


    public static void start() {
        Car.start();

    }

    private static void stop() {
        Car.distance();
        Car.stop();
    }

    private static void checkDistance() {
    }

    private static void checkPetrol() {
    }


}
