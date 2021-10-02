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

public class ArrayDeletionTest {

	private ArrayDeletion arr2;

	
	
	@Before
	public void setUp() throws Exception {
		arr2= new ArrayDeletion();
	
	}
	
	
	/** Checking Deletion at last Index **/
	@Test
	public void test1() {
		int [] actualarray = {10, 15, 20, 25};
		int [] expectedarray = {10, 15, 20};
		
		actualarray=arr2.delete(actualarray, 3);
		
		//arr2.display(actualarray);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i], actualarray[i]);;
		}
	}
	
	/** Checking Deletion at middle Index **/
	@Test
	public void test2() {
		int [] actualarray = {10, 15, 20, 25};
		int [] expectedarray = {10, 20, 25};
		
		actualarray=arr2.delete(actualarray, 1);
		
		//arr2.display(actualarray);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i], actualarray[i]);
		}
	}
	
	/** Checking Deletion at Index out of bound **/
	@Test
	public void test3(){
		int [] actualarray = {10, 15, 20};
		int [] expectedarray = {10, 15, 20};
		
		actualarray=arr2.delete(actualarray, 5);
		
		//arr2.display(actualarray);
		
		for(int i=0; i<expectedarray.length; i++) {
			assertEquals(expectedarray[i], actualarray[i]);
		}
		
	}
	
	/** Checking Deletion at negative Index **/
	@Test
	public void test4(){
		int [] actualarray = {10, 15, 20};
		int [] expectedarray = {10, 15, 20};
		
		actualarray=arr2.delete(actualarray, -2);
		
		//arr2.display(actualarray);
		
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

		arr2.display(actualarray);
	    assertEquals("10 15 20 \r\n", actualout.toString());

	    System.setOut(expectedout);
	}
	
	
	

}
