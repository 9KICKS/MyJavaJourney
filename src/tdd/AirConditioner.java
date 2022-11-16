package tdd;

import org.w3c.dom.ls.LSOutput;

public class AirConditioner {
    private boolean powerSwitch;
    private int temperature = 16;

    public int getTemperature() {
        return temperature;
    }


    public void setSwitch() {
        if (powerSwitch) {
            powerSwitch = false;
        } else {
            powerSwitch = true;
        }
    }

    public boolean isOn() {
        return powerSwitch;
    }

    public void setSwitchOff() {
        if (powerSwitch) {
            powerSwitch = true;
        } else {
            powerSwitch = false;
        }
    }

    public boolean isOff() {
        return powerSwitch;
    }


    public void increaseTemperature() {
        if (temperature < 30) {
            temperature += 1;
        }
        else {
            System.out.println("Temperature cannot exceed 30");
        }
    }

    public void decreaseTemperature() {
        if (temperature > 30) {
            temperature -= 1;
        }
        else {
            System.out.println("Temperature cannot go below 16");
        }
    }
}
