package by.tms.model;

import java.util.Random;
import java.util.Scanner;


public class Computer {
    private static String cpu;
    private static String ram;
    private static String hdd;
    private static int cycle;

    public Computer(String cpu, String ram, String hdd, int cycle) {
        Computer.cpu = cpu;
        Computer.ram = ram;
        Computer.hdd = hdd;
        Computer.cycle = cycle;
    }

    public static void main(String[] args) {
        new Computer(cpu, ram, hdd, 3);
        on();
    }

    @Override
    public String toString() {
        return "Computer" +
                "cpu: " + cpu + '\n' +
                "ram: " + ram + '\n' +
                "hdd: " + hdd + '\n' +
                "cycle: " + cycle;
    }


    static void on() {
        do {
            System.out.println("Внимание! Введите 0 или 1");
            Scanner scanner = new Scanner(System.in);
            int scan = scanner.nextInt();
            Random random = new Random();
            int ran = random.nextInt(2);
            System.out.println(ran);
            if (scan != ran) {
                System.out.println("Компьютер сгорел!");
            } else off();
        } while (cycle < 0);

    }

    static void off() {
        if (cycle != 0) {
            cycle--;
        } else {
            System.out.println("Компьютер сгорел!");
        }

    }
}




