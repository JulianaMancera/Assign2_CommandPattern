public class Device{
    public static SmartDevice createDevice(String deviceType) {
        switch (deviceType.toLowerCase()) {
            case "light":
                return new Light();
            case "thermostat":
                return new Thermostat();
            case "lockdoor":
                return new LockDoor();
            default:
                throw new IllegalArgumentException("Unknown device type");
        }
    }
}
