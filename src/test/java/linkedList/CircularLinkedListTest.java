package linkedList;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CircularLinkedListTest {
	
	private CircularLinkedList circularlist;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();
	
	
	@Before
	public void setUp() throws Exception {
		circularlist = new CircularLinkedList();
		
	}
	

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Inserting 1 element at first **/
	@Test
	public void testPushFront1() {
		circularlist.pushFront(1);
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : 1\r\n", Actualout.toString());
	}
	
	/** Inserting elements at first **/
	@Test
	public void testPushFront2() {
		circularlist.pushFront(1);
		circularlist.pushFront(2);
		circularlist.pushFront(3);
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : 3 2 1\r\n", Actualout.toString());
	}
	
	/** Inserting elements at last **/
	@Test
	public void testPushBack1() {
		circularlist.pushBack(1);
		circularlist.pushBack(2);
		circularlist.pushBack(3);
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : 1 2 3\r\n", Actualout.toString());
	}
	
	/** Popping 1 and only element from first **/
	@Test
	public void testPopFront1() {
		circularlist.pushBack(1);
		
		circularlist.popFront();
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : Empty List.\r\n", Actualout.toString());
	}
	
	/** Popping 2 elements from first **/
	@Test
	public void testPopFront2() {
		circularlist.pushBack(4);
		circularlist.pushBack(12);
		circularlist.pushBack(7);
		circularlist.pushBack(9);
		
		circularlist.popFront();
		circularlist.popFront();
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : 7 9\r\n", Actualout.toString());
	}
	
	/** Popping 1 element from start from empty list **/
	@Test
	public void testPopFront3() {
	
		
		circularlist.popFront();
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : Empty List.\r\n", Actualout.toString());
	}
	
	/** Popping 1 and only element from last **/
	@Test
	public void testPopBack1() {
		circularlist.pushBack(1);
		
		circularlist.popBack();
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : Empty List.\r\n", Actualout.toString());
	}
	
	
	/** Popping 2 elements from last **/
	@Test
	public void testPopBack2() {
		circularlist.pushBack(4);
		circularlist.pushBack(12);
		circularlist.pushBack(7);
		circularlist.pushBack(9);
		
		circularlist.popBack();
		circularlist.popBack();
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : 4 12\r\n", Actualout.toString());
	}

	/** Popping 1 element from last from empty list **/
	@Test
	public void testPopBack3() {
		
		circularlist.popBack();
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : Empty List.\r\n", Actualout.toString());
	}
	
	/** Checking Display function of empty list **/
	@Test
	public void testDisplay1() {
		
		
		System.setOut(new PrintStream(Actualout));
		
		circularlist.display();
		
		assertEquals("List : Empty List.\r\n", Actualout.toString());
	}

}
