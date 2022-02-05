package by.tms.model;

public class Main {

    public static void main(String[] args) {
        Computer comp = new Computer("cpu", "ram", "hdd", 3);
        System.out.println(comp);
        comp.on();
    }
}


