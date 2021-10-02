package linkedList;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListTest {
	
	LinkedList linkedlist;
	private PrintStream Expectedout=System.out;
	private final ByteArrayOutputStream Actualout = new ByteArrayOutputStream();


	@Before
	public void setUp() throws Exception {
		linkedlist=new LinkedList();
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(new PrintStream(Expectedout));
	}

	/** Adding elements at start **/
	@Test
	public void testPushFront1() {
		linkedlist.pushFront(9);
		linkedlist.pushFront(18);
		linkedlist.pushFront(23);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 23 18 9 \r\n", Actualout.toString());
	}
	
	/** Adding 1 element at back **/
	@Test
	public void testPushBack1() {
		linkedlist.pushBack(9);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 9 \r\n", Actualout.toString());
	}
	
	
	/** Adding elements at back **/
	@Test
	public void testPushBack2() {
		linkedlist.pushBack(9);
		linkedlist.pushBack(17);
		linkedlist.pushBack(23);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 9 17 23 \r\n", Actualout.toString());
	}
	
	/** Removing element from start **/
	@Test
	public void testPopFront1(){
		linkedlist.pushBack(1);
		linkedlist.pushBack(2);
		linkedlist.pushBack(3);
		
		linkedlist.popFront();
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 2 3 \r\n", Actualout.toString());
		
		
		
	}
	
	/** Removing element from start from list having 1 element **/
	@Test
	public void testPopFront2() {
		linkedlist.pushBack(1);
		linkedlist.popFront();
		

		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList :  \r\n", Actualout.toString());
		
		
		
	}
	
	/** Removing element from start from an empty list **/
	@Test
	public void testPopFront3(){
		linkedlist.popFront();
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList :  \r\n", Actualout.toString());
		
	}
	
	/** Removing element from back **/
	@Test
	public void testPopBack1(){
		linkedlist.pushBack(1);
		linkedlist.pushBack(2);
		linkedlist.pushBack(3);
		
		linkedlist.popBack();
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 1 2 \r\n", Actualout.toString());
		
		
		
	}
	
	/** Removing element from back from list having 1 element **/
	@Test
	public void testPopBack2() {
		linkedlist.pushBack(1);
		linkedlist.popBack();
		

		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList :  \r\n", Actualout.toString());
		
		
		
	}
	
	/** Removing element from back from an empty list **/
	@Test
	public void testPopBack3(){
		linkedlist.popBack();
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList :  \r\n", Actualout.toString());
		
	}
	
	/** Removing element at index out of bound from an empty list **/
	@Test
	public void testPop1(){
		linkedlist.pop(2);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList :  \r\n", Actualout.toString());
		
	}
	
	/** Removing element at index out of bound from a list **/
	@Test
	public void testPop2(){
		linkedlist.pushBack(18);
		
		linkedlist.pop(2);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 18 \r\n", Actualout.toString());
		
	}
	
	/** Removing element at index 0 from a list having 1 element **/
	@Test
	public void testPop3(){
		linkedlist.pushBack(18);
		
		linkedlist.pop(0);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList :  \r\n", Actualout.toString());
		
	}
	
	/** Removing element at index 0 from a list **/
	@Test
	public void testPop4(){
		linkedlist.pushBack(18);
		linkedlist.pushBack(25);
		linkedlist.pushBack(28);
		
		linkedlist.pop(0);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 25 28 \r\n", Actualout.toString());
		
	}
	
	/** Removing element at last index from a list **/
	@Test
	public void testPop5(){
		linkedlist.pushBack(18);
		linkedlist.pushBack(25);
		linkedlist.pushBack(28);
		
		linkedlist.pop(2);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 18 25 \r\n", Actualout.toString());
		
	}
	
	/** Removing element at middle index from a list **/
	@Test
	public void testPop6(){
		linkedlist.pushBack(18);
		linkedlist.pushBack(25);
		linkedlist.pushBack(28);
		
		linkedlist.pop(1);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 18 28 \r\n", Actualout.toString());
		
	}
	
	/** Removing element at negative index from a list **/
	@Test
	public void testPop7(){
		linkedlist.pushBack(18);
		linkedlist.pushBack(25);
		linkedlist.pushBack(28);
		
		linkedlist.pop(-1);
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList : 18 28 \r\n", Actualout.toString());
		
	}
	
	/** Displaying list **/
	@Test
	public void testDisplay1() {
		
		
		System.setOut(new PrintStream(Actualout));
		
		linkedlist.display();
		
		assertEquals("LinkedList :  \r\n", Actualout.toString());
	}

}
