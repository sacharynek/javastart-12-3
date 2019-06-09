package components;

public abstract class Component {

    private String model, producer, serialNo;

    public Component(String model, String producer, String serialNo) {
        this.model = model;
        this.producer = producer;
        this.serialNo = serialNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return "Component{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNo='" + serialNo + '\'' +

                '}';
    }
}
