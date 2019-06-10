package components;

public class Hdd extends Component {

    private int memorySizeInGB;

    public Hdd() {
    }

    public Hdd(int memorySizeInGB) {
        this.memorySizeInGB = memorySizeInGB;
    }

    public Hdd(String model, String producer, String serialNo) {
        super(model, producer, serialNo);
    }

    public Hdd(String model, String producer, String serialNo, int memorySize) {
        super(model, producer, serialNo);
        this.memorySizeInGB = memorySize;
    }

    public int getMemorySizeInGB() {
        return memorySizeInGB;
    }

    public void setMemorySizeInGB(int memorySizeInGB) {
        this.memorySizeInGB = memorySizeInGB;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "memorySizeInGB=" + memorySizeInGB +
                '}';
    }

    public static final class Builder {

        private String model;
        private String producer;
        private String serialNo;
        private int memorySizeInGB;

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder producer(String producer) {
            this.producer = producer;
            return this;
        }

        public Builder serialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }

        public Builder memorySizeInGB(int memorySizeInGB) {
            this.memorySizeInGB = memorySizeInGB;
            return this;
        }

        public Hdd build() {
            if (model.isEmpty() || producer.isEmpty() || serialNo.isEmpty() || memorySizeInGB <= 0) {
                throw new IllegalStateException("Hdd should have model, producer, serialnumber and size in GB!");
            }
            Hdd hdd = new Hdd();
            hdd.setMemorySizeInGB(this.memorySizeInGB);
            hdd.setModel(this.model);
            hdd.setProducer(this.producer);
            hdd.setSerialNo(this.serialNo);
            return hdd;
        }
    }
}
