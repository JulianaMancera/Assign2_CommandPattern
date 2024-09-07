public class IncreaseSettingCommand implements Command {
    private SmartDevice device;

    public IncreaseSettingCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.increaseSetting();
    }
}