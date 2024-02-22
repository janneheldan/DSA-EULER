package DataStructures.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticArrayTest {
	@Test
	public void testCapacity() {
		StaticArray<Integer> array = new StaticArray<>(Integer.class, 5);
		Assertions.assertEquals(5, array.capacity());
	}
	
	@Test
	public void testAddAndGet() {
		StaticArray<String> array = new StaticArray<>(String.class, 3);
		array.add("Hello");
		array.add("World");
		array.add("Copilot");
		
		Assertions.assertEquals("Hello", array.get(0));
		Assertions.assertEquals("World", array.get(1));
		Assertions.assertEquals("Copilot", array.get(2));
	}
	
	@Test
	public void testSet() {
		StaticArray<Integer> array = new StaticArray<>(Integer.class, 3);
		array.add(10);
		array.add(20);
		array.add(30);
		
		array.set(1, 25);
		Assertions.assertEquals(25, array.get(1));
	}
	
	@Test
	public void testRemove() {
		StaticArray<Character> array = new StaticArray<>(Character.class, 4);
		array.add('A');
		array.add('B');
		array.add('C');
		array.add('D');
		
		array.remove(1);
		Assertions.assertEquals('A', array.get(0));
		Assertions.assertEquals('C', array.get(1));
		Assertions.assertEquals('D', array.get(2));
		Assertions.assertEquals(3, array.size());
	}
}