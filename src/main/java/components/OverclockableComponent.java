package components;

public abstract class OverclockableComponent extends Component {

    private int maxWorkTemperature, overclockHeatFactor, currentTemperature;
    private double clockFrequencyInHundMhz;

    public OverclockableComponent() {
    }

    public double getClockFrequencyInMhz() {
        return clockFrequencyInHundMhz;
    }

    public void setClockFrequencyInMhz(double clockFrequencyInMhz) {
        this.clockFrequencyInHundMhz = clockFrequencyInMhz;
    }

    public OverclockableComponent(String model, String producer, String serialNo, int maxWorkTemperature, int overclockHeatFactor) {
        super(model, producer, serialNo);
        this.maxWorkTemperature = maxWorkTemperature;
        this.overclockHeatFactor = overclockHeatFactor;
        this.currentTemperature = 30;
        this.clockFrequencyInHundMhz = 10;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getMaxWorkTemperature() {
        return maxWorkTemperature;
    }

    public void setMaxWorkTemperature(int maxWorkTemperature) {
        this.maxWorkTemperature = maxWorkTemperature;
    }

    public int getOverclockHeatFactor() {
        return overclockHeatFactor;
    }

    public void setOverclockHeatFactor(int overclockHeatFactor) {
        this.overclockHeatFactor = overclockHeatFactor;
    }

    public boolean overclock(int hundredMhz) {
        var tempIncrease = hundredMhz * getOverclockHeatFactor();
        if (getCurrentTemperature() + tempIncrease > getMaxWorkTemperature()) {
            throw new ComponentOverheatedException();
        } else {
            setCurrentTemperature(getCurrentTemperature() + tempIncrease);
        }

        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "OverclockableComponent{" +
                "maxWorkTemperature=" + maxWorkTemperature + " C " +
                ", overclockHeatFactor=" + overclockHeatFactor + " C " +
                ", currentTemperature=" + currentTemperature + " C " +
                ", clockFrequencyInMhz=" + clockFrequencyInHundMhz + " Mhz " +
                '}';
    }
}
