package queue;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueArrayTest {

	private QueueArray queuearray;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		queuearray = new QueueArray(5);
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Enqueue 1 element to queue **/
	@Test
	public void enqueueTest1() {
		queuearray.enqueue(8);
		
		System.setOut(new PrintStream(Actualout));
		
		
		queuearray.display();
		
		assertEquals("Queue : 8 \r\n", Actualout.toString());
		
	}
	
	/** Enqueue elements to queue **/
	@Test
	public void enqueueTest2() {
		queuearray.enqueue(8);
		queuearray.enqueue(12);
		queuearray.enqueue(89);
		
		System.setOut(new PrintStream(Actualout));
		
		
		queuearray.display();
		
		assertEquals("Queue : 8 12 89 \r\n", Actualout.toString());
		
		
	}
	
	/** Enqueue elements to queue more than its length **/
	@Test
	public void enqueueTest3() {
		queuearray.enqueue(8);
		queuearray.enqueue(12);
		queuearray.enqueue(9);
		queuearray.enqueue(58);
		queuearray.enqueue(42);
		
		System.setOut(new PrintStream(Actualout));
		
		
		queuearray.enqueue(89);
		
		assertEquals("Queue is Full.\r\n", Actualout.toString());
		
		
	}
	

	/** Enqueue and Dequeue elements in queue more than its length **/
	@Test
	public void enqueueTest4() {
		queuearray.enqueue(8);
		queuearray.enqueue(12);
		queuearray.dequeue();
		queuearray.dequeue();
		queuearray.enqueue(9);
		queuearray.enqueue(58);
		queuearray.enqueue(42);
		queuearray.enqueue(64);
		queuearray.enqueue(3);
	
		
		
		System.setOut(new PrintStream(Actualout));
		
		queuearray.enqueue(8);
		
		assertEquals("Queue is Full.\r\n", Actualout.toString());
		
		
	}
	
	
	/** Display after Enqueue and Dequeue elements in queue more than its length **/
	@Test
	public void DisplayTest1() {
		queuearray.enqueue(8);
		queuearray.enqueue(12);
		queuearray.dequeue();
		queuearray.dequeue();
		queuearray.enqueue(9);
		queuearray.enqueue(58);
		queuearray.enqueue(42);
		queuearray.enqueue(64);
		queuearray.enqueue(3);
	
		
		
		
		
		
		System.setOut(new PrintStream(Actualout));
		
		queuearray.display();
		
		assertEquals("Queue : 9 58 42 64 3 \r\n", Actualout.toString());
		
		
	}
	
	
	/** Dequeue element in queue having 1 element **/
	@Test
	public void dequeueTest1() {
		queuearray.enqueue(8);
		
		assertEquals(8,queuearray.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		
		queuearray.display();
		
		assertEquals("Empty Queue.\r\n", Actualout.toString());
		
	}
	
	/** Dequeue element from queue **/
	@Test
	public void dequeueTest2() {
		queuearray.enqueue(98);
		queuearray.enqueue(12);
		queuearray.enqueue(89);
		
		assertEquals(98,queuearray.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		
		queuearray.display();
		
		assertEquals("Queue : 12 89 \r\n", Actualout.toString());
		
		
	}
	
	/** Dequeue element from queue of full length **/
	@Test
	public void dequeueTest3() {
		queuearray.enqueue(5);
		queuearray.enqueue(12);
		queuearray.enqueue(89);
		queuearray.enqueue(82);
		queuearray.enqueue(49);
		
		assertEquals(5,queuearray.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		
		queuearray.display();
		
		assertEquals("Queue : 12 89 82 49 \r\n", Actualout.toString());
		
		
	}
	
	
	/** Dequeue element from queue again after all have dequeued and one element being enqueued **/
	
	@Test
	public void dequeueTest4() {
		queuearray.enqueue(5);
		queuearray.enqueue(12);
		queuearray.enqueue(89);
		queuearray.enqueue(82);
		queuearray.enqueue(49);
		
		assertEquals(5,queuearray.dequeue());
		
		queuearray.enqueue(15);
		
		assertEquals(12,queuearray.dequeue());
		assertEquals(89,queuearray.dequeue());
		assertEquals(82,queuearray.dequeue());
		assertEquals(49,queuearray.dequeue());
		assertEquals(15,queuearray.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		
		queuearray.display();
		
		assertEquals("Empty Queue.\r\n", Actualout.toString());
		
		
	}
	
	/** Dequeue element from empty queue **/
	@Test
	public void dequeueTest5() {
		
		assertEquals(-1, queuearray.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		queuearray.display();
		
		
		assertEquals("Empty Queue.\r\n", Actualout.toString());
		
		
	}
	

}
