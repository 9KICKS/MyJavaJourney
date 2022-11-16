package tdd;

public class BikeAssignmentTwo {
    private boolean isOn;
    private int gear;
    private int speed;

    public void setPowerOn() {
        isOn = true;
    }

    public boolean getPower() {
        return isOn;
    }

    public void setPowerOff() {
        isOn = false;
    }

    public void acceleration(int gear) {
        if (gear == 1) {
            speed = speed + 1;
        }

        if (gear == 2) {
            speed = speed + 2;
        }

        if (gear == 3) {
            speed = speed + 3;
        }

        if (gear == 4) {
            speed = speed + 4;
        }
    }

    public void setGearSpeed(int speed) {
        if (speed >= 0 && speed <= 20) {
            this.speed = speed;
        }
        if (speed >= 21 && speed <= 30) {
            this.speed = speed;
        }
        if (speed >= 31 && speed <= 40) {
            this.speed = speed;

        }
        if (speed >= 41) {
            this.speed = speed;
        }
    }

    public int getGearSpeed() {
        return speed;
    }


}
