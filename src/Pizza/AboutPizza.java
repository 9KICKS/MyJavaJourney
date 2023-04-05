package Pizza;

public class AboutPizza {
    private final int numberOfBoxes;
    private final int eatenSlices;
    private final int leftOvers;

    public AboutPizza(int numBoxes, int eatenSlices, int leftOvers) {
        this.numberOfBoxes = numBoxes;
        this.eatenSlices = eatenSlices;
        this.leftOvers = leftOvers;
    }

    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }

    public int getEatenSlices() {
        return eatenSlices;
    }

    public int getLeftOvers() {
        return leftOvers;
    }
}