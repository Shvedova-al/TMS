package by.tms.model;

import java.util.Random;
import java.util.Scanner;


public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private int cycle;

    public Computer(String cpu, String ram, String hdd, int cycle) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cycle = cycle;
    }


    @Override
    public String toString() {
        return "Computer " +
                "cpu: " + cpu + '\n' +
                "ram: " + ram + '\n' +
                "hdd: " + hdd + '\n' +
                "cycle: " + cycle;
    }


    public void on() {
        do {
            System.out.println("Внимание! Введите 0 или 1");
            Scanner scanner = new Scanner(System.in);
            int scan = scanner.nextInt();
            Random random = new Random();
            int ran = random.nextInt(2);
            System.out.println(ran);
            if (scan != ran || cycle == 0) {
                System.out.println("Компьютер сгорел!");
                break;
            } else {
                off();
            }
        } while (cycle >= 0);

    }

    void off() {
        if (cycle != 0) {
            System.out.printf("Компьютер выключается. Осталось полных циклов %d\n", --cycle);

        }
    }
}





