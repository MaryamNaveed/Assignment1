package stack;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackArrayTest {

	private StackArray stackArray1;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream(); 
	
	@Before
	public void setUp() throws Exception {
		stackArray1 = new StackArray();
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}
	
	/** Push elements to stack **/
	@Test
	public void testPush1() {
		stackArray1.push(1);
		stackArray1.push(9);
		stackArray1.push(6);
		
		System.setOut(new PrintStream(Actualout));
		
		stackArray1.display();
		
		assertEquals("Stack : 1 9 6 \r\n", Actualout.toString());
	}
	
	/** Push elements to stack more than its size **/
	@Test
	public void testPush2(){
		for(int i=0; i<100; i++) {
			stackArray1.push(i*10);
		}
		
		System.setOut(new PrintStream(Actualout));
		
		stackArray1.push(1);
		
		assertEquals("Stack is Full!\r\n", Actualout.toString());
		
		
	}
	
	/** popping element from stack **/
	@Test
	public void testPop1() {
		stackArray1.push(1);
		stackArray1.push(9);
		stackArray1.push(6);
		
		assertEquals(6,stackArray1.pop());
		
		System.setOut(new PrintStream(Actualout));
		
		stackArray1.display();
		
		assertEquals("Stack : 1 9 \r\n", Actualout.toString());
	}
	
	/** popping element from stack having 1 element **/
	@Test
	public void testPop2() {
		stackArray1.push(1);
		
		
		assertEquals(1,stackArray1.pop());
		
		System.setOut(new PrintStream(Actualout));
		
		stackArray1.display();
		
		assertEquals("Empty Stack.\r\n", Actualout.toString());
	}
	
	/** popping element from empty stack **/
	@Test
	public void testPop3() {
		
		
		assertEquals(-1,stackArray1.pop());
		
		System.setOut(new PrintStream(Actualout));
		
		stackArray1.display();
		
		assertEquals("Empty Stack.\r\n", Actualout.toString());
	}
	
	/** Displaying Empty Stack **/
	@Test
	public void testDisplay1() {
		
		
		System.setOut(new PrintStream(Actualout));
		
		stackArray1.display();
		
		assertEquals("Empty Stack.\r\n", Actualout.toString());
	}

}
