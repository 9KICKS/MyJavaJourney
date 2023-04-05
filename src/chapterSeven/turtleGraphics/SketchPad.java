package chapterSeven.turtleGraphics;

public class SketchPad {
    private final int[][] floor;
    private final int rowSize;
    private final int columnSize;

    public SketchPad(int row, int column) {
        rowSize = row;
        columnSize = column;
        floor = new int[row][column];
    }

    @Override
    public String toString() {
        String toBeReturned = "";
        for (var row : floor) {
            for (var column : row) {
                if (column == 0) {
                    toBeReturned += "  ";
                } else if (column == 1) {
                    toBeReturned += "* ";
                }
            }
            toBeReturned += "\n";
        }
        return toBeReturned;
    }

    public int[][] getFloor() {
        return floor;
    }

    public int getRowSize(){
        return rowSize;
    }

    public int getColumnSize(){
        return columnSize;
    }
}