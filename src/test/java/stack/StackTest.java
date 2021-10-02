package stack;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTest {

	private Stack stack1;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		stack1= new Stack();
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Push elements to stack **/
	@Test
	public void testPush1() {
		stack1.push(1);
		stack1.push(9);
		stack1.push(6);
		
		System.setOut(new PrintStream(Actualout));
		
		stack1.display();
		
		assertEquals("\r\nStack \r\n----------\r\n|   6   |\r\n----------\r\n|   9   |\r\n----------\r\n|   1   |\r\n----------\r\n\r\n", Actualout.toString());
	}
	
	/** popping element from stack **/
	@Test
	public void testPop1() {
		stack1.push(1);
		stack1.push(9);
		stack1.push(6);
		
		assertEquals(6,stack1.pop());
		
		System.setOut(new PrintStream(Actualout));
		
		stack1.display();
		
		assertEquals("\r\nStack \r\n----------\r\n|   9   |\r\n----------\r\n|   1   |\r\n----------\r\n\r\n", Actualout.toString());
	}
	
	/** popping element from stack having 1 element **/
	@Test
	public void testPop2() {
		stack1.push(1);
		
		
		assertEquals(1,stack1.pop());
		
		System.setOut(new PrintStream(Actualout));
		
		stack1.display();
		
		assertEquals("Stack is empty.\r\n", Actualout.toString());
	}
	
	/** popping element from empty stack **/
	@Test
	public void testPop3() {
		
		
		assertEquals(-1,stack1.pop());
		
		System.setOut(new PrintStream(Actualout));
		
		stack1.display();
		
		assertEquals("Stack is empty.\r\n", Actualout.toString());
	}
	
	/** Getting top element of stack **/
	@Test
	public void testTop1() {
		stack1.push(1);
		stack1.push(9);
		stack1.push(6);
		
		assertEquals(6,stack1.top());
		
	}
	
	/** Getting top element of stack having 1 element **/
	@Test
	public void testTop2() {
		stack1.push(1);
		
		
		assertEquals(1,stack1.top());
		
		System.setOut(new PrintStream(Actualout));
		
		stack1.display();
		
		assertEquals("\r\nStack \r\n----------\r\n|   1   |\r\n----------\r\n\r\n", Actualout.toString());
	}
	
	/** Getting top element of empty stack **/
	@Test
	public void testTop3() {

		assertEquals(-1,stack1.top());
		
		
	}
	
	/**Displaying Empty Stack **/
	@Test
	public void testDisplay1() {
		
		System.setOut(new PrintStream(Actualout));
		
		stack1.display();
		
		assertEquals("Stack is empty.\r\n", Actualout.toString());
	}

	/** Checking Size of empty stack **/
	@Test
	public void testSize1() {

		assertEquals(0,stack1.getSize());
		
		
	}
	
	
	/** Checking Size of stack having one element **/
	@Test
	public void testSize2() {

		stack1.push(8);
		
		
		assertEquals(1,stack1.getSize());
		
		
	}
	
	/** Checking Size of stack **/
	@Test
	public void testSize3() {

		stack1.push(8);
		stack1.push(9);
		stack1.push(5);
		stack1.push(3);
		
		
		assertEquals(4,stack1.getSize());
		
		
	}
}
