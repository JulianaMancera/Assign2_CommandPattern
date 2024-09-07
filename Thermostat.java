public class Thermostat implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is turned off");
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing temperature");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing temperature");
    }
}