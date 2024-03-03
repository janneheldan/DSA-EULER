package DataStructures.StacksandQueues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircularQueueTest {

    private CircularQueue<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new CircularQueue<>(5);
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.front());
        assertEquals(3, queue.rear());
    }

    @Test
    public void testDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        assertEquals(2, queue.front());
        assertEquals(3, queue.rear());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(queue.isFull());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        assertTrue(queue.isFull());
    }

    @Test
    public void testFront() {
        assertNull(queue.front());
        queue.enqueue(1);
        assertEquals(1, queue.front());
    }

    @Test
    public void testRear() {
        assertNull(queue.rear());
        queue.enqueue(1);
        assertEquals(1, queue.rear());
    }
}