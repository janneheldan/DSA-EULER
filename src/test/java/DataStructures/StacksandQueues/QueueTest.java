package DataStructures.StacksandQueues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testEnqueue() {
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.front());
        assertEquals(3, queue.rear());
    }

    @Test
    public void testDequeue() {
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        assertEquals(2, queue.front());
        assertEquals(3, queue.rear());
    }

    @Test
    public void testIsEmpty() {
        Queue<Integer> queue = new Queue<>(5);
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsFull() {
        Queue<Integer> queue = new Queue<>(3);
        assertFalse(queue.isFull());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertTrue(queue.isFull());
    }

    @Test
    public void testFront() {
        Queue<Integer> queue = new Queue<>(5);
        assertNull(queue.front());
        queue.enqueue(1);
        assertEquals(1, queue.front());
    }

    @Test
    public void testRear() {
        Queue<Integer> queue = new Queue<>(5);
        assertNull(queue.rear());
        queue.enqueue(1);
        assertEquals(1, queue.rear());
    }
}