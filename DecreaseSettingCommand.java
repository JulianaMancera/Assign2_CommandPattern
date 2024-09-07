public class DecreaseSettingCommand implements Command {
    private SmartDevice device;

    public DecreaseSettingCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.decreaseSetting();
    }
}