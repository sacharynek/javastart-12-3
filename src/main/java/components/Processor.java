package components;

public class Processor extends OverclockableComponent {

    public Processor(){}


    public Processor(String model, String producer, String serialNo, int maxWorkTemperature, int overclockHeatFactor) {
        super(model, producer, serialNo, maxWorkTemperature, overclockHeatFactor);
    }

    public static final class Builder{
        private String model, producer, serialNo;
        private int maxWorkTemperature, overclockHeatFactor;

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

        public Processor build(){
            if(producer.isEmpty() || serialNo.isEmpty() || model.isEmpty()){
                throw new IllegalStateException("Model, producer and serial number cannot be empty!");
            }

            if(maxWorkTemperature <=0 || overclockHeatFactor <=0 ){
                throw new IllegalStateException("Maximal work temperature and overclock Heat Factor cannot be empty");
            }

            Processor processor = new Processor();
            processor.setModel(this.model);
            processor.setProducer(this.producer);
            processor.setSerialNo(this.serialNo);
            processor.setMaxWorkTemperature(this.maxWorkTemperature);
            processor.setOverclockHeatFactor(this.overclockHeatFactor);

            return processor;

        }
    }

}
