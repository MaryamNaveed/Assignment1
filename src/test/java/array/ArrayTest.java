package array;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayTest {
	
	private Array arr;

	
	@Before
	public void setUp() throws Exception {
		arr= new Array();
	}

	/** Checking insertion at starting Index **/
	@Test
	public void testInsert1() {

		int [] expectedarray = {56, 12, 14, 8};
		
		
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		arr.insert(56, 0);
		
		arr.display();
		
		assertEquals(4, arr.size);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i],arr.array[i]);
		}
		
	}
	
	
	/** Checking insertion at negative Index **/
	@Test
	public void testInsert2(){

		arr.insert(12, -1);
		
		assertEquals(0,arr.size);

		
		
	}
	
	/** Checking insertion at Index out of bound **/
	@Test
	public void testInsert3(){

		arr.insert(12, 199);
		assertEquals(0,arr.size);

		
		
	}
	
	/** Checking insertion at middle Index **/
	@Test
	public void testInsert4() {

		int [] expectedarray = {56, 12, 8, 14};
		
		arr.insert(56, 0);
		arr.insert(12, 1);
		arr.insert(14, 3);
		arr.insert(8, 2);
		
		
		arr.display();
		
		assertEquals(4, arr.size);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i],arr.array[i]);
		}
		
	}
	
	/** Checking deletion at start Index **/
	@Test
	public void testDelete1() {

		int [] expectedarray =  {14, 8, 6, 7, 9};
		
		
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		arr.insert(6, 3);
		arr.insert(7, 4);
		arr.insert(9, 5);
		
		
		
		arr.delete(0);
		
		arr.display();
		
		assertEquals(5, arr.size);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i],arr.array[i]);
		}
		
	}
	
	/** Checking deletion at negative Index **/
	@Test
	public void testDelete2(){
		
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.delete(-5);
		
		assertEquals(3, arr.size);
		
	}
	
	/** Checking deletion at Index out of bound **/
	@Test
	public void testDelete3(){
		
		int [] expectedarray =  {12, 14, 8};
		
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.delete(190);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i],arr.array[i]);
		}
		
		
	}
	
	/** Checking size after deletion at Index out of bound **/
	@Test
	public void testsizeafterDelete1(){
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.delete(180);
		
		assertEquals(3, arr.size);
		
	}
	
	/** Checking size after deletion at middle Index **/
	@Test
	public void testsizeafterDelete2(){
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.delete(1);
		
		assertEquals(2, arr.size);
		
	}
	
	/** Checking size after deletion at negative Index **/
	@Test
	public void testsizeafterDelete3(){
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.delete(-1);
		
		assertEquals(3, arr.size);
		
	}
	
	/** Searching middle index value **/
	@Test
	public void testLinearSearch1() {
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		//arr.display();
		
		assertTrue(arr.linearSearch(14));
		
	}
	
	/** Searching value that does not exist **/
	@Test
	public void testLinearSearch2() {
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.display();
		
		assertFalse(arr.linearSearch(19));
		
	}
	
	/** Searching last index value **/
	@Test
	public void testLinearSearch3() {
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		arr.insert(9, 3);
		arr.insert(4, 4);
		
		arr.display();

		
		assertTrue(arr.linearSearch(4));
		
	}
	
	/** Searching first index value **/
	@Test
	public void testLinearSearch4() {
			
		arr.insert(12, 0);
		arr.insert(12, 1);
		arr.insert(8, 2);
		arr.insert(7, 3);
		
		arr.display();
		
		assertTrue(arr.linearSearch(12));
		
	}
	
	/** Searching value at middle index by giving correct first and last index **/
	@Test
	public void testBinarySearch1() {
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.display();
		
		
		assertTrue(arr.binarySearch(14, 0, 3));
		
	}
	
	/** Searching value that does not exist by giving correct first and last index **/
	@Test
	public void testBinarySearch2() {
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		arr.insert(19, 3);
		arr.insert(16, 2);
		
		arr.display();
		
		
		assertFalse(arr.binarySearch(4, 0, 4));
	}
	
	
	
	
	
	/** Searching value at last index by giving negative first index **/
	@Test
	public void testBinarySearch3(){
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.display();
		
		
		
		arr.binarySearch(8, -1, 3);
	}
	
	
	
	/** Searching value at last index by giving first index out of bound **/
	@Test
	public void testBinarySearch4() {
			
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		
		arr.display();
		
		
		assertFalse(arr.binarySearch(8, 20, 3));
	}
	
	/** Sorting Positive elements **/
	@Test
	public void testBubbleSort1() {
		
		int [] expectedarray = {6,8,12,14};
		
		arr.insert(12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		arr.insert(6, 3);
		
		arr.bubbleSort();
		
		arr.display();
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i],arr.array[i]);
		}
	}
	
	/** Sorting Negative and Positive elements **/
	@Test
	public void testBubbleSort2() {
		
		int [] expectedarray = {-12,-6,8,14};
		
		arr.insert(-12, 0);
		arr.insert(14, 1);
		arr.insert(8, 2);
		arr.insert(-6, 3);
		
		arr.bubbleSort();
		
		arr.display();
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i],arr.array[i]);
		}
	}
	
	/** sorting Equal elements **/
	@Test
	public void testBubbleSort3() {
		
		int [] expectedarray = {2,2,2, 9};
		
		arr.insert(9, 0);
		arr.insert(2, 1);
		arr.insert(2, 2);
		arr.insert(2, 3);
		
		arr.bubbleSort();
		
		arr.display();
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i],arr.array[i]);
		}
	}
	
	/** Checking display function **/
	@Test
	public void testDisplay() {
		
		arr.insert(10, 0);
		arr.insert(15, 1);
		arr.insert(20, 2);
		
		PrintStream expectedout=System.out;
		final ByteArrayOutputStream actualout = new ByteArrayOutputStream();
		System.setOut(new PrintStream(actualout));

		arr.display();
	    assertEquals("10 15 20 \r\n", actualout.toString());

	    System.setOut(expectedout);
	}
}
