package queue;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DequeueTest {

	private Dequeue dequeue1;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		dequeue1 = new Dequeue(5);
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Adding 1 element to left **/
	@Test
	public void addLeftTest1() {
		dequeue1.addLeft(10);
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 10 0 0 0 0 \r\n", Actualout.toString());
		
	}
	
	/** Adding elements to left **/
	@Test
	public void addLeftTest2() {
		
		dequeue1.addLeft(10);
		dequeue1.addLeft(20);
		dequeue1.addLeft(30);
		dequeue1.addLeft(40);
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 10 20 30 40 0 \r\n", Actualout.toString());
		
	}
	
	/** Adding elements to left more than array length **/
	@Test
	public void addLeftTest3() {
		
		dequeue1.addLeft(10);
		dequeue1.addLeft(20);
		dequeue1.addLeft(30);
		dequeue1.addLeft(40);
		dequeue1.addLeft(50);
		dequeue1.addLeft(60);
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 10 20 30 40 50 \r\n", Actualout.toString());
		
	}
	
	/** Adding 1 elements to right **/
	@Test
	public void addRightTest1() {
		dequeue1.addRight(10);
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 0 0 0 0 10 \r\n", Actualout.toString());
		
	}
	
	/** Adding elements to right **/
	@Test
	public void addRightTest2() {
		
		dequeue1.addRight(10);
		dequeue1.addRight(20);
		dequeue1.addRight(30);
		dequeue1.addRight(40);
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 0 40 30 20 10 \r\n", Actualout.toString());
		
	}
	
	/** Adding elements to right more than array length **/
	@Test
	public void addRightTest3() {
		
		dequeue1.addRight(10);
		dequeue1.addRight(20);
		dequeue1.addRight(30);
		dequeue1.addRight(40);
		dequeue1.addRight(50);
		dequeue1.addRight(60);
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 50 40 30 20 10 \r\n", Actualout.toString());
		
	}
	
	/** Adding elements to right and then left more than array length **/
	@Test
	public void addRightLeftTest1() {
		
		dequeue1.addRight(10);
	
		
		dequeue1.addRight(20);
		
		dequeue1.addRight(30);
		
		dequeue1.addLeft(40);
		
		dequeue1.addLeft(50);
		
		dequeue1.addLeft(60);	
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 40 50 30 20 10 \r\n", Actualout.toString());
		
	}
	
	/** Adding elements to left and then right more than array length **/
	@Test
	public void addLeftRightTest1() {
		
		dequeue1.addLeft(10);
	
		
		dequeue1.addLeft(20);
		
		dequeue1.addLeft(30);
		
		dequeue1.addRight(40);
		
		dequeue1.addRight(50);
		
		dequeue1.addRight(60);	
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 10 20 30 50 40 \r\n", Actualout.toString());
		
	}
	
	/** Adding elements to left and right more than array length **/
	@Test
	public void addMixedLeftRightTest1() {
		
		dequeue1.addLeft(10);
	
		dequeue1.addRight(20);
		
		dequeue1.addLeft(30);
		
		dequeue1.addRight(40);
		
		dequeue1.addLeft(50);
		
		dequeue1.addRight(60);	
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 10 30 50 40 20 \r\n", Actualout.toString());
		
	}
	
	
	/** Displaying Empty Queue **/
	@Test
	public void Display1() {
		
		
		
		System.setOut(new PrintStream(Actualout));
		
		dequeue1.display();
		
		assertEquals("DeQueue : 0 0 0 0 0 \r\n", Actualout.toString());
		
	}

}
