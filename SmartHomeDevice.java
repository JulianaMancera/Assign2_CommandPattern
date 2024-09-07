public class SmartHomeDevice{
    public static void main(String[] args) {

          // Create devices using the factory (now called Device)
          SmartDevice light = Device.createDevice("light");
          SmartDevice thermostat = Device.createDevice("thermostat");
          SmartDevice lockDoor = Device.createDevice("lockdoor");
  
          // Create commands for light
          Command turnOnLight = new TurnOnCommand(light);
          Command turnOffLight = new TurnOffCommand(light);
          Command increaseLight = new IncreaseSettingCommand(light);
          Command decreaseLight = new DecreaseSettingCommand(light);
  
          // Create commands for thermostat
          Command turnOnThermostat = new TurnOnCommand(thermostat);
          Command turnOffThermostat = new TurnOffCommand(thermostat);
          Command increaseThermostat = new IncreaseSettingCommand(thermostat);
          Command decreaseThermostat = new DecreaseSettingCommand(thermostat);
  
          // Create commands for door lock
          Command lockDoorCommand = new TurnOnCommand(lockDoor);
          Command unlockDoorCommand = new TurnOffCommand(lockDoor);
  
          // Create the central hub (remote control)
          RemoteControl remote = new RemoteControl();
  
          // Control the light
          System.out.println("Controlling the Light:");
          remote.setCommand(turnOnLight);
          remote.pressButton();
  
          remote.setCommand(increaseLight);
          remote.pressButton();
  
          remote.setCommand(decreaseLight);
          remote.pressButton();
  
          remote.setCommand(turnOffLight);
          remote.pressButton();
  
          // Control the thermostat
          System.out.println("\nControlling the Thermostat:");
          remote.setCommand(turnOnThermostat);
          remote.pressButton();
  
          remote.setCommand(increaseThermostat);
          remote.pressButton();
  
          remote.setCommand(decreaseThermostat);
          remote.pressButton();
  
          remote.setCommand(turnOffThermostat);
          remote.pressButton();
  
          // Control the door lock
          System.out.println("\nControlling the Door Lock:");
          remote.setCommand(lockDoorCommand);
          remote.pressButton();
  
          remote.setCommand(unlockDoorCommand);
          remote.pressButton();
      }
  }