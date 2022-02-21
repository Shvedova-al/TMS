import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Transport {
    int power;
    int speed;
    int weight;
    String model;

    public static void main(String[] args) {
        Transport transport1 = new Passenger(200, 210, 1480, "Toyota", 4, 4, "седан", 5);
        Transport transport2 = new Freight(180, 85, 14950, "МАЗ", 12, 26, 8000);
        Transport transport3 = new Civil(110000, 800, 195000, "Boing", 75, 3300, 300, true);
        Transport transport4 = new Military(1200, 2645, 104000, "Ил", 51, 300, true, 12);


    }

    public Transport(int power, int speed, int weight, String model) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.model = model;

        powerCalculation();
    }

    double powerCalculation() {
        return (power * 0.74);
    }

}

class Ground extends Transport {
    int numOfWheels;
    int fuelConsumption;

    public Ground(int power, int speed, int weight, String model, int numOfWheels, int fuelConsumption) {
        super(power, speed, weight, model);
        this.numOfWheels = numOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}

class Air extends Transport {

    int wingspan;
    int minLength;

    public Air(int power, int speed, int weight, String model, int wingspan, int minLength) {
        super(power, speed, weight, model);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }
}

class Passenger extends Ground {
    String type;
    int numOfPassengers;


    public Passenger(int power, int speed, int weight, String model, int numOfWheels, int fuelConsumption, String type, int numOfPassengers) {
        super(power, speed, weight, model, numOfWheels, fuelConsumption);
        this.type = type;
        this.numOfPassengers = numOfPassengers;

        displayInfo();
    }

    private void displayInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время поездки");
        int time = scanner.nextInt();

        int checkDistance = getSpeed() * time;
        System.out.printf("За время %dч., автомобиль %s, двигаясь с максимальной скоростью %dкм/ч проедет %dкм. и израсходует %1fл. топлива\n", time, super.model, super.speed, checkDistance, checkFuel(checkDistance));
    }


    private double checkFuel(int checkDistance) {
        return (double) super.fuelConsumption / 100 * checkDistance;

    }

    @Override
    public String toString() {
        return "Passenger: " +
                "power " + power +
                "h.p. " + powerCalculation() +
                "kw., speed " + speed +
                "km/h., weight " + weight +
                "kg., model " + model + '\'' +
                "numOfWheels " + numOfWheels +
                ", fuelConsumption " + fuelConsumption +
                "l/100km., type " + type + '\'' +
                "numOfPassengers " + numOfPassengers;
    }
}

class Freight extends Ground {
    int loadCapacity;

    public Freight(int power, int speed, int weight, String model, int numOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, speed, weight, model, numOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
        checkLoadCapacity(loadCapacity);
    }

    private void checkLoadCapacity(int loadCapacity) {
        System.out.println("Сколько кг груза нужно разместить?");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextInt();

        if (num > (double) loadCapacity) {
            System.out.println("Вам нужен грузовик побольше\n");
        } else {
            System.out.println("Грузовик загружен\n");
        }
    }

    @Override
    public String toString() {
        return "Freight: " +
                "power " + power +
                "h.p. " + powerCalculation() +
                "kw., speed " + speed +
                "km/h., weight " + weight +
                "kg., model " + model + '\'' +
                "numOfWheels " + numOfWheels +
                "fuelConsumption " + fuelConsumption +
                "l/100km., loadCapacity=" + loadCapacity +
                "tons.";
    }
}

class Civil extends Air {
    int numOfPassengers;
    boolean business;

    public Civil(int power, int speed, int weight, String model, int wingspan, int minLength, int numOfPassengers, boolean business) {
        super(power, speed, weight, model, wingspan, minLength);
        this.numOfPassengers = numOfPassengers;
        this.business = business;

        checkNumOfPassengers(numOfPassengers);

    }

    private void checkNumOfPassengers(int numOfPassengers) {
        System.out.println("Сколько человек нужно разместить?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > numOfPassengers) {
            System.out.println("Вам нужен самолет побольше\n");
        } else {
            System.out.println("Самолет загружен\n");
        }
    }

    @Override
    public String toString() {
        return "Civil{" +
                "power " + power +
                "h.p. " + powerCalculation() +
                "kw., speed " + speed +
                "km/h., weight " + weight +
                "kg., model " + model + '\'' +
                "wingspan " + wingspan +
                "m., minLength " + minLength +
                "m., numOfPassengers " + numOfPassengers +
                "business " + business +
                '}';
    }
}

class Military extends Air {
    boolean ejection;
    int numOfMissilesOnBoard;

    public Military(int power, int speed, int weight, String model, int wingspan, int minLength, boolean ejection, int numOfMissilesOnBoard) {
        super(power, speed, weight, model, wingspan, minLength);
        this.ejection = ejection;
        this.numOfMissilesOnBoard = numOfMissilesOnBoard;

        shot(numOfMissilesOnBoard);
        checkEjection(ejection);

    }


    private void shot(int numOfMissilesOnBoard) {
        if (numOfMissilesOnBoard > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    private void checkEjection(boolean ejection) {
        if (ejection) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public String toString() {
        return "Military{" +
                "power " + power +
                "h.p. " + powerCalculation() +
                "kw., speed " + speed +
                "km/h., weight " + weight +
                "kg., model " + model + '\'' +
                "wingspan " + wingspan +
                "m, minLength " + minLength +
                "m., ejection " + ejection +
                "numOfMissilesOnBoard=" + numOfMissilesOnBoard;
    }
}


