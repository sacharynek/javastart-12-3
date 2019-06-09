package main;

import Computer.Computer;
import components.Hdd;
import components.Processor;
import components.Ram;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("Pentium", "intel", "AAAA666", 100, 10);
        Ram ram = new Ram("Blade", "Goodram", "66666666", 90, 15);
        Hdd hdd = new Hdd("Barracuda", "Seagate", "7777777");
        Computer computer = new Computer(processor, ram, hdd);
        System.out.println(computer);

        computer.overclockProcessor(7);
        computer.overclockRam(4);

        System.out.println(computer);

        computer.overclockProcessor(3);

        System.out.println(computer);


    }

}
