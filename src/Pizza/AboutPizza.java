package Pizza;

public class AboutPizza {
    private final int numberOfBoxes;
    private final int eatenSlices;
    private final int leftOvers;

    public AboutPizza(int numberOfBoxes, int eatenSlices, int leftOvers) {
        this.numberOfBoxes = numberOfBoxes;
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