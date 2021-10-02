package linkedList;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListImpTest {

	LinkedListImp linkedlist;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		linkedlist = new LinkedListImp();
		linkedlist.numofElements=0;
		linkedlist.headPointer=null;
		linkedlist.tailPointer=null;
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Checking size of empty list **/
	@Test
	public void testSize1() {
		assertEquals(0,linkedlist.size());
	}
	
	/** Checking size of list having 1 element **/
	@Test
	public void testSize2() {
		linkedlist.add(9);
		assertEquals(1,linkedlist.size());
	}
	
	/** Adding 1 element to empty list **/
	@Test
	public void testAdd1() {
		linkedlist.add(9);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : [ 9 ]\r\n", Actualout.toString());
	}
	

	/** Adding 3 element to empty list **/
	@Test
	public void testAdd2() {
		linkedlist.add(9);
		linkedlist.add(18);
		linkedlist.add(23);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : [ 9 18 23 ]\r\n", Actualout.toString());
	}
	

	/** Inserting elements at start **/
	@Test
	public void testPushFront1() {
		linkedlist.pushFront(9);
		linkedlist.pushFront(18);
		linkedlist.pushFront(23);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : [ 23 18 9 ]\r\n", Actualout.toString());
	}
	

	/** Removing element from an empty list **/
	@Test(expected = Exception.class)
	public void testTopFront1() throws Exception {
		linkedlist.topFront();
		
		
		
	}
	
	

	/** Removing 1 element from list **/
	@Test
	public void testTopFront2() throws Exception {
		linkedlist.add(1);
		linkedlist.add(2);
		
		int f=linkedlist.topFront();
		
		assertEquals(1,f);		
		
	}
	


	/** Removing 1 element from start from list and check display **/
	@Test
	public void testPopFront1() throws Exception {
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		
		linkedlist.popFront();
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : [ 2 3 ]\r\n", Actualout.toString());
		
		
		
	}
	
	

	/** Removing 1 element from start from empty list **/
	@Test
	public void testPopFront2() throws Exception {
		linkedlist.add(1);
		linkedlist.popFront();
		

		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : [ ]\r\n", Actualout.toString());
		
		
		
	}
	
	
	/** Removing 1 element from start from an empty list **/
	@Test(expected = Exception.class)
	public void testPopFront3() throws Exception {
		linkedlist.popFront();
		
		
		
	}
	
	/** Removing 1 element from end from an empty list **/
	@Test(expected = Exception.class)
	public void testTopBack1() throws Exception {
		linkedlist.topBack();
		
		
		
	}
	
	
	/** Removing 1 element from back **/
	@Test
	public void testTopBack2() throws Exception {
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		
		int f=linkedlist.topBack();
		
		assertEquals(3,f);		
		
	}
	
	/** Removing 1 element from back from list having 1 element **/
	@Test
	public void testTopBack3() throws Exception {
		linkedlist.add(1);
		
		int f=linkedlist.topBack();
		
		assertEquals(1,f);		
		
	}
	
	/** Adding 1 element at back in an empty list **/
	@Test
	public void testPushBack1() {
		linkedlist.pushBack(9);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : [ 9 ]\r\n", Actualout.toString());
	}
	

	/** Adding 1 elements at back **/
	@Test
	public void testPushBack2() {
		linkedlist.pushBack(9);
		linkedlist.pushBack(17);
		linkedlist.pushBack(23);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : [ 9 17 23 ]\r\n", Actualout.toString());
	}
	
	/** Display empty list **/
	@Test
	public void testDisplay1() {
		
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : [ ]\r\n", Actualout.toString());
	}

}
