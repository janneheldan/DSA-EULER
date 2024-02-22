package DataStructures.StacksandQueues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    
    @Test
    public void testPush() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.get());
    }
    
    @Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.pop();
        assertEquals("Hello", stack.get());
    }
    
    @Test
    public void testPopEmpty() {
        Stack<Character> stack = new Stack<>();
		try {
			stack.pop();
		} catch (Exception e) {
			fail("Should not throw exception when popping empty stack.");
		}
		assertNull(stack.get());
    }

	@Test
	public void testGetEmpty() {
		Stack<Integer> stack = new Stack<>();
		try {
			stack.get();
		} catch (Exception e) {
			fail("Should not throw exception when getting from empty stack.");
		}
		assertNull(stack.get());
	}

	@Test
	public void testResize() {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		assertEquals(99, stack.get());
	}
}