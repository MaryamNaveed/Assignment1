package linkedList;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListSwapNodesTest {
	
	private LinkedListSwapNodes listSwapNodes;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();



	@Before
	public void setUp() throws Exception {
		listSwapNodes=new LinkedListSwapNodes();
		listSwapNodes.size=0;
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Adding 1 element at start **/
	@Test
	public void testPushFront1() {
		listSwapNodes.pushFront(1);
		
		System.setOut(new PrintStream(Actualout));
		
		listSwapNodes.display();
		
		assertEquals("List : 1 \r\n", Actualout.toString());
	}
	
	/** Adding elements at start **/
	@Test
	public void testPushFront2() {
		listSwapNodes.pushFront(1);
		listSwapNodes.pushFront(2);
		listSwapNodes.pushFront(3);
		
		System.setOut(new PrintStream(Actualout));
		
		listSwapNodes.display();
		
		assertEquals("List : 3 2 1 \r\n", Actualout.toString());
	}
	
	/** Adding elements at back **/
	@Test
	public void testPushBack1() {
		listSwapNodes.pushBack(1);
		listSwapNodes.pushBack(2);
		listSwapNodes.pushBack(3);
		
		System.setOut(new PrintStream(Actualout));
		
		listSwapNodes.display();
		
		assertEquals("List : 1 2 3 \r\n", Actualout.toString());
	}
	
	/** Swapping elements in an empty list **/
	@Test
	public void testSwap1() {
		
		listSwapNodes.swap();
		
		
		System.setOut(new PrintStream(Actualout));
		
		listSwapNodes.display();
		
		assertEquals("List : Empty.\r\n", Actualout.toString());
	}
	
	/** Swapping elements in a list having 1 element **/
	@Test
	public void testSwap2() {
		
		listSwapNodes.pushBack(1);
		
		listSwapNodes.swap();
		
		
		System.setOut(new PrintStream(Actualout));
		
		listSwapNodes.display();
		
		assertEquals("List : 1 \r\n", Actualout.toString());
	}
	
	/** Swapping elements in a list having 2 elements **/
	@Test
	public void testSwap3() {
		
		listSwapNodes.pushBack(1);
		listSwapNodes.pushBack(9);
		
		listSwapNodes.swap();
		
		
		System.setOut(new PrintStream(Actualout));
		
		listSwapNodes.display();
		
		assertEquals("List : 9 1 \r\n", Actualout.toString());
	}
	
	/** Swapping elements in a list having 4 elements **/
	@Test
	public void testSwap4() {
		
		listSwapNodes.pushBack(1);
		listSwapNodes.pushBack(12);
		listSwapNodes.pushBack(9);
		listSwapNodes.pushBack(6);
		
		listSwapNodes.swap();
		
		
		System.setOut(new PrintStream(Actualout));
		
		listSwapNodes.display();
		
		assertEquals("List : 6 12 9 1 \r\n", Actualout.toString());
	}
	
	/** Display empty list **/
	@Test
	public void testDisplay1() {
		
		
		System.setOut(new PrintStream(Actualout));
		
		listSwapNodes.display();
		
		assertEquals("List : Empty.\r\n", Actualout.toString());
	}

}
