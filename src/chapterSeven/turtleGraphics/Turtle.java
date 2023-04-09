package chapterSeven.turtleGraphics;

import static chapterSeven.turtleGraphics.Direction.*;

public class Turtle {
    private boolean penIsUp = true;
    private Direction direction = EAST;
    Position currentPosition = new Position(0,0);

    public boolean penIsUp() {
        return penIsUp;
    }

    public void penDown() {
        penIsUp = false;
    }

    public void penUp() {
        penIsUp = true;
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction == EAST) face(SOUTH);
        else if (direction == SOUTH) {
            face(WEST);
        } else if (direction == WEST) {
            face(NORTH);
        } else direction = EAST;
    }

    private void face(Direction direction) {
        this.direction = direction;
    }

    public void turnLeft() {
        if (direction == EAST) face(NORTH);
        else if (direction == NORTH) {
            face(WEST);
        } else if (direction == WEST) {
            face(SOUTH);
        } else direction = EAST;
    }

    public void moveForward(int numberOfSteps, SketchPad sketchPad) {
        if (!penIsUp()) {
            if (direction.equals(EAST)) {writeOnColumnBy(numberOfSteps, sketchPad);}
            if (direction.equals(SOUTH)) {writeOnRowBy(numberOfSteps, sketchPad);}
            if (direction.equals(WEST)) {backWriteOnColumnBy(numberOfSteps, sketchPad);}
            if (direction.equals(NORTH)) {backWriteOnRowBy(numberOfSteps,sketchPad);}
        }
        if (direction.equals(EAST)){increaseColumnBy(numberOfSteps, sketchPad);}
        if (direction.equals(SOUTH)){increaseRowBy(numberOfSteps, sketchPad);}
        if (direction.equals(WEST)){decreaseColumnBy(numberOfSteps);}
        if (direction.equals(NORTH)){decreaseRowBy(numberOfSteps);}
    }

    private void decreaseRowBy(int numberOfSteps) {
        int row = currentPosition.getRow() - (numberOfSteps - 1);
        if (row < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            currentPosition.setRow(row);
        }
    }

    private void decreaseColumnBy(int numberOfSteps) {
        int column = currentPosition.getColumn() - (numberOfSteps - 1);
        if (column < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            currentPosition.setColumn(column);
        }
    }

    private void increaseRowBy(int numberOfSteps, SketchPad sketchPad) {
        int row = currentPosition.getRow() + (numberOfSteps - 1);
        if (row + 1 > sketchPad.getRowSize()) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            currentPosition.setRow(row);
        }
    }

    private void increaseColumnBy(int numberOfSteps, SketchPad sketchPad) {
        int column = currentPosition.getColumn() + (numberOfSteps - 1);
        if (column + 1 > sketchPad.getColumnSize()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            currentPosition.setColumn(column);
        }
    }

    private void backWriteOnRowBy(int numberOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        numberOfSteps = numberOfSteps - row;
        if (numberOfSteps < 1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = numberOfSteps-1; i <= row; i++) {
                floor[i][column] = 1;
            }
        }
    }

    private void backWriteOnColumnBy(int numberOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        numberOfSteps = numberOfSteps - column;
        if (numberOfSteps < 1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = numberOfSteps-1; i <= column; i++) {
                floor[row][i] = 1;
            }
        }
    }

    private void writeOnRowBy(int numberOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        numberOfSteps = numberOfSteps + row;
        if (numberOfSteps > sketchPad.getRowSize()) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = row; i < numberOfSteps; i++) {
                floor[i][column] = 1;
            }
        }
    }

    private void writeOnColumnBy(int numberOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        numberOfSteps = numberOfSteps + column;
        if (numberOfSteps > sketchPad.getColumnSize()) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = column; i < numberOfSteps; i++) {
                floor[row][i] = 1;
            }
        }
    }

    public Position getPosition() {
        return currentPosition;
    }
}