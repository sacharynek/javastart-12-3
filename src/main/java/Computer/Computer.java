package Computer;

import components.Hdd;
import components.Processor;
import components.Ram;

public class Computer {

    Processor processor;
    Ram ram;
    Hdd hdd;

    public Computer(Processor processor, Ram ram, Hdd hdd) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
    }

    public boolean overclockProcessor(int hundMhz) {
        return this.processor.overclock(hundMhz);
    }

    public boolean overclockRam(int hundMhz) {
        return this.ram.overclock(hundMhz);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
