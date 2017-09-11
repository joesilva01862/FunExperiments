package com.jsilva.linkedlist;

import com.jsilva.linkedlist.LinkedList;

/**
 * 
 * @author Josivaldo S.
 *
 * A driver class for manual testing.
 * 
 */
public class LinkedListDriver {
	LinkedList<Object> linkedList = new LinkedList<Object>();

	public void addObjects(Object[] objs) {
		for (Object obj : objs) {
			linkedList.add(obj);
		}
	}
	
	public Object[] getObjectsFromHead() {
		return linkedList.getArrayFromHead();
	}
	
	public Object[] getObjectsFromTail() {
		return linkedList.getArrayFromTail();
	}
	
	public void remove(Object item) {
		linkedList.remove(item);
	}
	
	public int getCount() {
		return linkedList.getCount();
	}
	
	public static void main(String[] args) {
		LinkedList<String> driver = new LinkedList<String>();
		String obj1 = "B";
		driver.add(obj1);
		String obj2 = "B";
		driver.add(obj2);
		String obj3 = "N";
		driver.add(obj3);
		String obj4 = " ";
		driver.add(obj4);
		String obj5 = "R";
		driver.add(obj5);
		String obj6 = "a";
		driver.add(obj6);
		String obj7 = "y";
		driver.add(obj7);
		
		// now list
		System.out.println("listing from head:");
		driver.list();
		System.out.println("\nlisting from tail:");
		driver.listFromTail();
		
		// remove
		driver.remove(obj6);
		System.out.println("\nafter removing, list from head:");
		driver.list();
		System.out.println("\nafter removing, list from tail:");
		driver.listFromTail();
		
		// list again
		String obj11 = "l";
		driver.remove(obj11);
		System.out.println("\nafter removing an item that doesn't exist:");
		driver.list();
		System.out.println("\nafter removing an item that doesn't exist:");
		driver.listFromTail();
		
		// create a list of another type
		LinkedList<Integer> intList = new LinkedList<Integer>();
		intList.add(new Integer(1));
		intList.add(new Integer(2));
		intList.add(new Integer(3));
		intList.add(new Integer(4));
		intList.add(new Integer(5));
		System.out.println("\nlist from head:");
		intList.list();
		System.out.println("\nlist from tail:");
		intList.listFromTail();
	}

}
