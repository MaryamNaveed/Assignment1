package queue;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTest {

	private Queue queue1;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();
	

	@Before
	public void setUp() throws Exception {
		queue1 = new Queue(5);
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Enqueue 1 element in queue **/
	@Test
	public void enqueueTest1() throws Exception {
		queue1.enqueue(8);
		
		System.setOut(new PrintStream(Actualout));
		
		
		queue1.display();
		
		assertEquals("Queue : 8 \r\n", Actualout.toString());
		
	}
	
	/** Enqueue elements in queue **/
	@Test
	public void enqueueTest2() throws Exception {
		queue1.enqueue(8);
		queue1.enqueue(12);
		queue1.enqueue(89);
		
		System.setOut(new PrintStream(Actualout));
		
		
		queue1.display();
		
		assertEquals("Queue : 8 12 89 \r\n", Actualout.toString());
		
		
	}
	
	/** Enqueue elements in queue more than its length **/
	@Test(expected = Exception.class)
	public void enqueueTest3() throws Exception {
		queue1.enqueue(8);
		queue1.enqueue(12);
		queue1.enqueue(9);
		queue1.enqueue(58);
		queue1.enqueue(42);
		
	
		
		
		queue1.enqueue(89);
		
	
		
	}
	

	/** Enqueue elements in queue more than its length **/
	@Test(expected = Exception.class)
	public void enqueueTest4() throws Exception {
		queue1.enqueue(8);
		queue1.enqueue(12);
		queue1.dequeue();
		queue1.dequeue();
		queue1.enqueue(9);
		queue1.enqueue(58);
		queue1.enqueue(42);
		queue1.enqueue(64);
		queue1.enqueue(3);
		
	
		
		queue1.enqueue(8);
		
	
		
		
	}
	
	/** Display elements in queue **/
	@Test
	public void DisplayTest1() throws Exception {
		queue1.enqueue(8);
		queue1.enqueue(12);
		queue1.dequeue();
		queue1.dequeue();
		queue1.enqueue(9);
		queue1.enqueue(58);
		queue1.enqueue(42);
		queue1.enqueue(64);
		queue1.enqueue(3);
		
		
		
		
		
		
		System.setOut(new PrintStream(Actualout));
		
		queue1.display();
		
		assertEquals("Queue : 9 58 42 64 3 \r\n", Actualout.toString());
		
		
	}
	
	/** Dequeue 1 element from queue having 1 element **/
	@Test
	public void dequeueTest1() throws Exception {
		queue1.enqueue(8);
		
		assertEquals(8,queue1.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		
		queue1.display();
		
		assertEquals("Empty Queue.\r\n", Actualout.toString());
		
	}
	
	/** Dequeue element from queue **/
	@Test
	public void dequeueTest2() throws Exception {
		queue1.enqueue(98);
		queue1.enqueue(12);
		queue1.enqueue(89);
		
		assertEquals(98,queue1.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		
		queue1.display();
		
		assertEquals("Queue : 12 89 \r\n", Actualout.toString());
		
		
	}
	
	/** Dequeue 1 element from queue having full length **/
	@Test
	public void dequeueTest3() throws Exception {
		queue1.enqueue(5);
		queue1.enqueue(12);
		queue1.enqueue(89);
		queue1.enqueue(82);
		queue1.enqueue(49);
		
		assertEquals(5,queue1.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		
		queue1.display();
		
		assertEquals("Queue : 12 89 82 49 \r\n", Actualout.toString());
		
		
	}
	
	/** Dequeue elements from queue until empty and display it **/
	@Test
	public void dequeueTest4() throws Exception {
		queue1.enqueue(5);
		queue1.enqueue(12);
		queue1.enqueue(89);
		queue1.enqueue(82);
		queue1.enqueue(49);
		
		assertEquals(5,queue1.dequeue());
		
		queue1.enqueue(50);
		
		assertEquals(12,queue1.dequeue());
		assertEquals(89,queue1.dequeue());
		assertEquals(82,queue1.dequeue());
		assertEquals(49,queue1.dequeue());
		
		queue1.display();
		
		assertEquals(50,queue1.dequeue());
		

		queue1.display();
		
		System.setOut(new PrintStream(Actualout));
		
		
		queue1.display();
		
		assertEquals("Empty Queue.\r\n", Actualout.toString());
		
		
	}
	
	/** Dequeue 1 element from empty queue **/
	@Test(expected = Exception.class)
	public void dequeueTest5() throws Exception {
		
		queue1.dequeue();

		
	}
	
	/** Dequeue element from queue until empty **/
	@Test
	public void dequeueTest6() throws Exception {
		
		queue1.enqueue(5);
		queue1.enqueue(12);
		queue1.enqueue(89);
		queue1.enqueue(82);
		queue1.enqueue(49);
		
		assertEquals(5,queue1.dequeue());
		assertEquals(12,queue1.dequeue());
		assertEquals(89,queue1.dequeue());
		assertEquals(82,queue1.dequeue());
		assertEquals(49,queue1.dequeue());

		
	}
	
	/** Check queue is empty **/
	@Test
	public void emptyTest1() throws Exception {
		
		assertTrue(queue1.empty());

		
	}
	
	/** Check queue is not empty **/
	@Test
	public void emptyTest2() throws Exception {
		
		queue1.enqueue(9);
		
		assertFalse(queue1.empty());

		
	}
	
	/** Check queue size when it is empty **/
	@Test
	public void sizeTest1() throws Exception {
		
		assertEquals(0,queue1.size());

		
	}
	
	/** Check queue size when it is not empty **/
	@Test
	public void sizeTest2() throws Exception {
		
		queue1.enqueue(7);
		
		assertEquals(1,queue1.size());

		
	}
	
	
	
	/** Check queue size when it is empty after enqueue and dequeue **/
	
	@Test
	public void sizeTest3() throws Exception {
		
		queue1.enqueue(7);
		queue1.dequeue();
		
		
		assertEquals(0,queue1.size());

		
	}


}
