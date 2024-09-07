public class LockDoor implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Door is locked");
    }

    @Override
    public void turnOff() {
        System.out.println("Door is unlocked");
    }

    @Override
    public void increaseSetting() {
        // Not applicable for a door, but we can leave it empty or provide a message.
        System.out.println("Lock tightening mechanism not supported");
    }

    @Override
    public void decreaseSetting() {
        // Not applicable for a door, but we can leave it empty or provide a message.
        System.out.println("Lock loosening mechanism not supported");
    }
}
