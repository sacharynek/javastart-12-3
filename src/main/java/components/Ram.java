package components;

public class Ram extends OverclockableComponent{

    private int memorySizeInMB;

    public Ram(){

    }

    public Ram(String model, String producer, String serialNo, int maxWorkTemperature, int overclockHeatFactor, int memorySizeInMB) {
        super(model, producer, serialNo, maxWorkTemperature, overclockHeatFactor);
        this.memorySizeInMB = memorySizeInMB;
    }

    public int getMemorySizeInMB() {
        return memorySizeInMB;
    }

    public void setMemorySizeInMB(int memorySizeInMB) {
        this.memorySizeInMB = memorySizeInMB;
    }

    public static final class Builder{
        private String model, producer, serialNo;
        private int maxWorkTemperature, overclockHeatFactor, memorySizeInMB;

        public Builder model(String model){
            this.model = model;
            return this;
        }
        public Builder producer(String producer){
            this.producer = producer;
            return this;
        }
        public Builder serialNo(String serialNo){
            this.serialNo = serialNo;
            return this;
        }
        public Builder maxWorkTemperature(int maxWorkTemperature){
            this.maxWorkTemperature = maxWorkTemperature;
            return this;
        }
        public Builder overclockHeatFactor(int overclockHeatFactor){
            this.overclockHeatFactor = overclockHeatFactor;
            return this;
        }
        public Builder memorySizeInMB(int memorySizeInMB){
            this.memorySizeInMB = memorySizeInMB;
            return this;
        }

        public Ram build(){
            if(producer.isEmpty() || serialNo.isEmpty() || model.isEmpty()){
                throw new IllegalStateException("Model, producer and serial number cannot be empty!");
            }

            if(maxWorkTemperature <=0 || overclockHeatFactor <=0 || memorySizeInMB <= 0){
                throw new IllegalStateException("Maximal workd temperature, memory size of Ram and overclock Heat Factor cannot be empty");
            }

            Ram ram = new Ram();
            ram.setModel(this.model);
            ram.setSerialNo(this.serialNo);
            ram.setProducer(this.producer);
            ram.setMaxWorkTemperature(this.maxWorkTemperature);
            ram.setOverclockHeatFactor(this.overclockHeatFactor);
            ram.setMemorySizeInMB(this.memorySizeInMB);

            return ram;
        }

    }
}
