package tdd;
public class BikeAssignment {
    private boolean powerButton = false;
    private int Speed;
    public int Gear;
    public void setSwitch() {
        powerButton = !powerButton;
    }
    public boolean isOn() {
        return powerButton;
    }

    public int accelerate() {
        if (powerButton) {
            if (Speed >= 40) {
                Speed = Speed + 4;
                Gear = 4;

            }
            if (Speed >= 30 && Speed < 40) {
                Speed = Speed + 3;
                Gear = 3;

            }
            if (Speed >= 20 && Speed < 30) {
                Speed = Speed + 2;
                Gear = 2;

            }
            if (Speed >= 0 && Speed < 20) {
                Speed = Speed + 1;
                Gear = 1;
            }return Speed;
        }
        return Speed;
    }
    public int getSpeed() {return Speed;
    }

    public int Gear() {
        if (powerButton) {
            if (Speed >= 40) {
                Speed = Speed + 4;
                Gear = 4;
            }
            if (Speed >= 30 && Speed < 40) {
                Speed = Speed + 3;
                Gear = 3;
            }
            if (Speed >= 20 && Speed < 30) {
                Speed = Speed + 2;
                Gear = 2;
            }
            if (Speed >= 0 && Speed < 20) {
                Speed = Speed + 1;
                Gear = 1;
            }return Speed;
        }
        return Speed;
    }
    public int getGear() { return Gear;
    }
}