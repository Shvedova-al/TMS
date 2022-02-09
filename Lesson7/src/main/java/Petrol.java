import java.util.Scanner;

class Petrol {
    public int level;


    Petrol(int level) {
        this.level = level;
    }


    static void checkPetrol() {
        if (Car.levelPetrol > 0) {
            Engine.start();
        } else {
            System.out.println("Закончилось топливо. На сколько литров заправить?");
            Scanner scanner = new Scanner(System.in);
            int answer4 = scanner.nextInt();
            Car.levelPetrol += answer4;

        }

    }
}



