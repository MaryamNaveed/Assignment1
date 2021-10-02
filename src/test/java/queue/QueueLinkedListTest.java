package queue;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueLinkedListTest {
	
	
	private QueueLinkedList queuelist;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();

	
	@Before
	public void setUp() throws Exception {
		queuelist = new QueueLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	
	/** Enqueue elements in queue**/
	@Test
	public void enqueueTest1() {
		queuelist.enqueue(1);
		queuelist.enqueue(6);
		queuelist.enqueue(10);
		
		System.setOut(new PrintStream(Actualout));
		
		queuelist.display();
		
		assertEquals("Queue : 1 6 10 \r\n", Actualout.toString());
		
	}
	

	/** Dequeue elements from queue**/
	@Test
	public void dequeueTest1() {
		queuelist.enqueue(1);
		queuelist.enqueue(6);
		queuelist.enqueue(10);
		
		assertEquals(1,queuelist.dequeue());
		assertEquals(6,queuelist.dequeue());
		
		System.setOut(new PrintStream(Actualout));
		
		queuelist.display();
		
		assertEquals("Queue : 10 \r\n", Actualout.toString());
		
	}
	

	/** Enqueue element from empty queue**/
	@Test
	public void dequeueTest2() {
	
		
		assertEquals(-1,queuelist.dequeue());
		
		
		System.setOut(new PrintStream(Actualout));
		
		queuelist.display();
		
		assertEquals("Empty queue.\r\n", Actualout.toString());
		
	}
	

	/** Dequeue element from queue having 1 element **/
	@Test
	public void dequeueTest3() {
	
		
		queuelist.enqueue(10);
		
		assertEquals(10,queuelist.dequeue());
		
		assertEquals(-1,queuelist.dequeue());
		
		
		System.setOut(new PrintStream(Actualout));
		
		queuelist.display();
		
		assertEquals("Empty queue.\r\n", Actualout.toString());
		
	}
	

	/** Dequeue element from queue **/
	@Test
	public void enqueuedequeueTest() {
	
		
		queuelist.enqueue(10);
		queuelist.enqueue(15);
		queuelist.enqueue(80);
		queuelist.enqueue(19);
		
		assertEquals(10,queuelist.dequeue());
		
		queuelist.enqueue(89);
		queuelist.enqueue(50);
		
		assertEquals(15,queuelist.dequeue());
		
		
		System.setOut(new PrintStream(Actualout));
		
		queuelist.display();
		
		assertEquals("Queue : 80 19 89 50 \r\n", Actualout.toString());
		
	}
	
	/** Displaying Empty queue **/
	@Test
	public void displayTest1() {
		
		
		System.setOut(new PrintStream(Actualout));
		
		queuelist.display();
		
		assertEquals("Empty queue.\r\n", Actualout.toString());
		
	}

}
