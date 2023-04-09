package chapterSeven.turtleGraphics;

import org.junit.jupiter.api.Test;
import static chapterSeven.turtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle ijapa = new Turtle();
    private SketchPad sketchPad = new SketchPad(10, 10);

    @Test public void turtleCanMovePenDownTest() {
        assertTrue(ijapa.penIsUp());
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
    }

    @Test public void turtleCanMovePenUpTest() {
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
        ijapa.penUp();
        assertTrue(ijapa.penIsUp());
    }

    @Test public void turtleCanTurnRightWhileFacingEastTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnRightWhileFacingSouthTest() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnRightWhileFacingWestTest() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnRightWhileFacingNorthTest() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnLeftWhileFacingEastTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnLeftWhileFacingNorthTest() {
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnLeftWhileFacingWestTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnLeftWhileFacingSouthTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanMoveForwardWhileFacingEastTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new Position(0, 0), ijapa.getPosition());
        ijapa.moveForward(6, sketchPad);
        assertEquals(new Position(0,5), ijapa.getPosition());
    }

    @Test public void turtleCanMoveDownwardWhileFacingSouthTest() {
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(0, 2), ijapa.getPosition());
        ijapa.turnRight();
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(2,2), ijapa.getPosition());
    }

    @Test public void turtleCanMoveBackwardFacingWestTest() {
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(0, 2), ijapa.getPosition());
        ijapa.turnRight();
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(2, 2), ijapa.getPosition());
        ijapa.turnRight();
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(2, 0), ijapa.getPosition());
    }

    @Test
    public void turtleCanMoveUpwardFacingNorthTest(){
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(0, 2), ijapa.getPosition());
        ijapa.turnRight();
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(2, 2), ijapa.getPosition());
        ijapa.turnRight();
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(2, 0), ijapa.getPosition());
        ijapa.turnRight();
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(0, 0), ijapa.getPosition());
    }
}