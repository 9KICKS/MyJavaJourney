package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue queue;

    @BeforeEach public void setUp() {
        queue = new Queue();
    }

    @Test public void queueExistTest() {
        assertNotNull(queue);
    }

    @Test public void emptyQueueTest() {
        assertTrue(queue.isEmpty());
    }

    @Test public void pushOneElementQueueIsNotEmptyTest() {
        queue.enqueue("Nike");
        assertFalse(queue.isEmpty());
    }

    @Test public void pushX_popX_elementShouldBeXTest() {
        queue.enqueue("Air Jordan");
        assertEquals("Air Jordan" , queue.dequeue());
    }

    @Test public void pushXandY_popXTest() {
        queue.enqueue("Adidas");
        queue.enqueue("Nike");
        assertEquals("Adidas" , queue.dequeue());
    }

    @Test public void pushXandY_popXandY_elementIsXThenYTest() {
        queue.enqueue("Puma");
        queue.enqueue("Adidas");
        assertEquals("Puma" , queue.dequeue());
        assertEquals("Adidas" , queue.dequeue());
    }

    @Test public void pushXandY_peekY_elementReturnYTest() {
        queue.enqueue("Bape");
        queue.enqueue("New Balance");
        assertEquals("Bape" , queue.peek());
    }

    @Test public void testThatElementsPushedCanNotBeBeyondArrayLength() {
        queue.enqueue("Nike");
        queue.enqueue("Bape");
        queue.enqueue("New Balance");
        queue.enqueue("Adidas");
        queue.enqueue("Puma");
        queue.enqueue("Converse");
        queue.enqueue("Dr. Martens");
        queue.enqueue("Off-White");
        queue.enqueue("Diesel");
        queue.enqueue("Amiri");
        assertEquals("Nike" , queue.peek());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> queue.enqueue("MSCHF"));
    }

    @Test public void testThatElementsCanShiftIfArrayIsFullAndNullElementsExist() {
        queue.enqueue("Ye");
        queue.enqueue("Yam");
        queue.enqueue("milk");
        queue.enqueue("Burna");
        queue.enqueue("jug");
        queue.enqueue("plates");
        queue.enqueue("car");
        queue.enqueue("ink");
        assertEquals("Ye" , queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        assertEquals("Burna" , queue.peek());
        queue.enqueue("The Weeknd");
        queue.enqueue("Frank Ocean");
        queue.enqueue("");
        queue.display();
        queue.enqueue("crayon");
        queue.enqueue("love");
        assertEquals("Burna" , queue.peek());
        queue.display();
    }
}