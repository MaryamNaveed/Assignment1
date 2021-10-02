package stack;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyStackTest {

	private MyStack myStack1;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		myStack1= new MyStack(5);
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Push elements to stack **/
	@Test
	public void testPush1() throws Exception {
		myStack1.push(1);
		myStack1.push(9);
		myStack1.push(6);
		
		System.setOut(new PrintStream(Actualout));
		
		myStack1.displayStack();
		
		assertEquals("Stack : [ 1 9 6 ]\r\n", Actualout.toString());
		
	}
	
	/** Push elements to stack more than its size **/
	@Test(expected = Exception.class)
	public void testPush2() throws Exception {
		myStack1.push(1);
		myStack1.push(9);
		myStack1.push(6);
		myStack1.push(78);
		myStack1.push(13);
		myStack1.push(78);
		
		
	}
	
	/** Getting top elements of stack **/
	@Test
	public void testTop1() throws Exception {
		myStack1.push(1);
		myStack1.push(9);
		myStack1.push(6);
		
		assertEquals(6, myStack1.top());
		
	}
	
	/** Getting top elements of empty stack **/
	@Test(expected = Exception.class)
	public void testTop2() throws Exception {
		myStack1.top();
		
	}
	
	/** popping element from stack **/
	@Test
	public void testPop1() throws Exception {
		myStack1.push(1);
		myStack1.push(9);
		myStack1.push(6);
		
		myStack1.pop();
		
		System.setOut(new PrintStream(Actualout));
		
		myStack1.displayStack();
		
		assertEquals("Stack : [ 1 9 ]\r\n", Actualout.toString());
		
	}
	
	/** popping element from empty stack **/
	@Test(expected = Exception.class)
	public void testPop2() throws Exception {
		myStack1.pop();
		
		
	}
	
	/** popping element from stack having 1 element **/
	@Test
	public void testPop3() throws Exception {
		myStack1.push(1);
		
		
		myStack1.pop();
		
		System.setOut(new PrintStream(Actualout));
		
		myStack1.displayStack();
		
		assertEquals("Stack : [ ]\r\n", Actualout.toString());
		
	}
	
	/** Getting size of stack having 1 element **/
	@Test
	public void testSize1() throws Exception {
		myStack1.push(1);
		
		assertEquals(1, myStack1.size());
		
	}
	
	/** Getting size of stack **/
	@Test
	public void testSize2() throws Exception {
		myStack1.push(1);
		myStack1.push(9);
		myStack1.push(6);
		myStack1.push(78);
		myStack1.push(13);
		
		assertEquals(5, myStack1.size());
		
	}
	
	/** Getting size of empty stack **/
	@Test
	public void testSize3() throws Exception {
		
		
		assertEquals(0, myStack1.size());
		
	}
	
	/** Displaying Empty Stack **/
	@Test
	public void testDisplay1() throws Exception {

		
		System.setOut(new PrintStream(Actualout));
		
		myStack1.displayStack();
		
		assertEquals("Stack : [ ]\r\n", Actualout.toString());
		
	}


}
