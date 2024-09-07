public class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off");
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing light brightness");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing light brightness");
    }
}