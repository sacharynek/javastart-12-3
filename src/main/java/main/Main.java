package main;

import Computer.Computer;
import components.Hdd;
import components.Processor;
import components.Ram;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor.Builder()
                .model("Pentium")
                .producer("intel")
                .serialNo("AAAA666")
                .maxWorkTemperature(100)
                .overclockHeatFactor(10)
                .build();

        Ram ram = new Ram.Builder()
                .model("Blade")
                .producer("Goodram")
                .serialNo("66666666")
                .maxWorkTemperature(90)
                .overclockHeatFactor(15)
                .memorySizeInMB(4096)
                .build();

        Hdd hdd = new Hdd.Builder()
                .model("Barracuda")
                .producer("Seagate")
                .serialNo("7777777")
                .memorySizeInGB(512)
                .build();
        Computer computer = new Computer(processor, ram, hdd);
        System.out.println(computer);

        computer.overclockProcessor(7);
        computer.overclockRam(4);

        System.out.println(computer);

        computer.overclockProcessor(4);

        System.out.println(computer);


    }

}
