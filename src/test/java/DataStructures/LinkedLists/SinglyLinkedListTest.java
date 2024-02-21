package DataStructures.LinkedLists;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    @Test
    public void testAddFirst() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertEquals(3, list.getFirst());
    }

    @Test
    public void testRemoveFirst() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addFirst("Hello");
        list.addFirst("World");
        assertEquals("World", list.removeFirst());
        assertEquals("Hello", list.removeFirst());
        assertNull(list.removeFirst());
    }

    @Test
    public void testGetFirst() {
        SinglyLinkedList<Character> list = new SinglyLinkedList<>();
        list.addFirst('A');
        list.addFirst('B');
        assertEquals('B', list.getFirst());
    }

    @Test
    public void testGetLast() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addFirst("Hello");
        list.addFirst("World");
        assertEquals("Hello", list.getLast());
    }

    @Test
    public void testAddLast() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        assertEquals(3, list.getLast());
    }

    @Test
    public void testIsEmpty() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
        list.addFirst("Hello");
        assertFalse(list.isEmpty());
    }
}