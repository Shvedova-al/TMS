public class Engine {

    public void start() {
        System.out.println("Запуск двигателя.");
        if (Petrol.checkPetrol()) {
            System.out.println("Двигатель запущен.");
            Car.movement();

        } else {
            System.out.println("Двигатель заглох.");
            Car.stop();
        }


    }
}



