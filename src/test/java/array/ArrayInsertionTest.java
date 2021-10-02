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

public class ArrayInsertionTest {

	private ArrayInsertion arr1;

	
	@Before
	public void setUp() throws Exception {
		arr1= new ArrayInsertion();

		arr1.size=0;
	}
	
	
	/** Checking insertion at end Index one by one **/
	@Test
	public void test1() {
		int [] actualarray = new int[5];
		int [] expectedarray = {10, 20, 15};
		
		
		actualarray=arr1.insert(actualarray, 10, 0);	
		actualarray=arr1.insert(actualarray, 20, 1);	
		actualarray=arr1.insert(actualarray, 15, 2);	
		
		assertEquals(3, arr1.size);
	
		
		//arr1.display(actualarray);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i], actualarray[i]);
		}
		
	}
	
	/** Checking insertion at negative Index **/
	
	@Test
	public void test2(){
		int [] actualarray = new int[5];
		
		actualarray=arr1.insert(actualarray, 10, -1);	
		
		assertEquals(0,arr1.size);
		
	}
	
	/** Checking insertion at Index out of bound **/
	@Test
	public void test3(){
		int [] actualarray = new int[5];
		
		actualarray=arr1.insert(actualarray, 10, 6);	
		
		assertEquals(0,arr1.size);
			
		
	}
	
	/** Checking insertion at middle Index **/
	@Test
	public void test4() {
		int [] actualarray = new int[5];
		int [] expectedarray = {10, 15, 20};
		
		
		actualarray=arr1.insert(actualarray, 10, 0);	
		actualarray=arr1.insert(actualarray, 20, 2);	
		actualarray=arr1.insert(actualarray, 15, 1);	
		
		assertEquals(3, arr1.size);
	
		
		//arr1.display(actualarray);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i], actualarray[i]);
		}
		
	}
	
	/** Checking Display function **/
	@Test
	public void testDisplay() {
		
		int [] actualarray = {10, 15, 20};
		
		PrintStream expectedout=System.out;
		final ByteArrayOutputStream actualout = new ByteArrayOutputStream();
		System.setOut(new PrintStream(actualout));

		arr1.display(actualarray);
	    assertEquals("10 15 20 \r\n", actualout.toString());

	    System.setOut(expectedout);
	}
	
	/** Checking insertion at last Index (array.legth-1 index) **/
	@Test
	public void test5(){
		
		//arr1.size=0;
		
		
		int [] actualarray = new int[5];
		int [] expectedarray = {10, 20, 15, 25, 30};
		
		
		actualarray=arr1.insert(actualarray, 10, 0);	
		actualarray=arr1.insert(actualarray, 20, 1);	
		actualarray=arr1.insert(actualarray, 15, 2);	
		actualarray=arr1.insert(actualarray, 25, 3);	
		actualarray=arr1.insert(actualarray, 30, 4);	
		
		arr1.display(actualarray);
		
		
		
		assertArrayEquals(expectedarray, actualarray);
		
	}

}
