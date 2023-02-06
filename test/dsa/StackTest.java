package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

class StackTest {
    private Stack stack;

    @BeforeEach public void startWithThis() {
        stack = new Stack();
    }

    @Test public void stackCanBeCreated() {
        assertNotNull(stack);
    }

    @Test public void emptyStackTest() {
        assertTrue(stack.isEmpty());
    }

    @Test public void pushOneElement_stackIsNotEmptyTest() {
        stack.push(13);
        assertFalse(stack.isEmpty());
    }

    @Test public void pushX_popX_stackShouldBeEmptyTest() {
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test public void pushXandY_popY_stackShouldNotBeEmptyTest() {
        stack.push(13);
        stack.push(5);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test public void pushX_popX_elementShouldBeXTest() {
        stack.push(34);
        int element = stack.pop();
        assertEquals(34, element);
    }

    @Test public void pushXandY_popYandX_elementIsYThenXTest() {
        stack.push(34);
        stack.push(67);
        int element = stack.pop();
        assertEquals(67, element);
        element = stack.pop();
        assertEquals(34, element);
    }

    @Test public void pushXandY_peekReturnsYTest() {
        stack.push(35);
        stack.push(69);
        int element = stack.peek();
        assertEquals(69, element);
        element = stack.pop();
        assertEquals(69, element);
        element = stack.peek();
        assertEquals(35, element);
    }
}