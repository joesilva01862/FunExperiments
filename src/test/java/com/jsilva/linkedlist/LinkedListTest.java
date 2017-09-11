package com.jsilva.linkedlist;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author Josivaldo S.
 * 
 * Unit tests for a LinkedList implementation.
 */
public class LinkedListTest
{
	private static Logger logger = Logger.getLogger(LinkedListTest.class);
	private static String obj0 = "Aone";
	private static String obj1 = "Btwo";
	private static String obj2 = "Cthree";
	private static String[] objArray = new String[] {obj0, obj1, obj2};
	private static LinkedListDriver driver;
	 
    @BeforeClass
    public static void setUp() {
    	logger.info("in setUp()");
    }
    
    @Test
    public void testCount()
    {
    	logger.info("in testCount(");
    	driver = new LinkedListDriver();
    	driver.addObjects(objArray);
        Assert.assertTrue( driver.getCount() == objArray.length );
    }
    
    @Test
    public void testSequenceHead() {
    	logger.info("in testSequenceHead(");
    	driver = new LinkedListDriver();
    	driver.addObjects(objArray);
    	Object[] array = driver.getObjectsFromHead();
    	Assert.assertArrayEquals(array, objArray);
    }
    
    @Test
    public void testSequenceTail() {
    	logger.info("in testSequenceTail(");
    	driver = new LinkedListDriver();
    	driver.addObjects(objArray);
    	Object[] array = driver.getObjectsFromTail();
    	Assert.assertTrue(array[0].equals(objArray[2]));
    	Assert.assertTrue(array[1].equals(objArray[1]));
    	Assert.assertTrue(array[2].equals(objArray[0]));
    }
    
    @Test
    public void testRemoveOne() {
    	logger.info("in removeOne()");
    	driver = new LinkedListDriver();
    	driver.addObjects(objArray);
    	driver.remove(obj1);
    	Object[] array = driver.getObjectsFromHead();
    	Assert.assertTrue(array.length == objArray.length-1);
    	Assert.assertTrue(array[0].equals(obj0));
    	Assert.assertTrue(array[1].equals(obj2));
    }
}
