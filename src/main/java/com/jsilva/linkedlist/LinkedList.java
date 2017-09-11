package com.jsilva.linkedlist;

public class LinkedList<T> {
	private LinkedNode<T> head;
	private LinkedNode<T> tail;
	private int count = 0;
	
	public void add(T item) {
		if (head == null) {
			head = new LinkedNode<T>(item);
			tail = head;
			count++;
			return;
		}
		
		LinkedNode<T> obj = head;
		LinkedNode<T> prev = null;
		LinkedNode<T> recItem = new LinkedNode<T>(item);
		
		while (true) {
			if (obj.getNext() == null) {
				break;
			}
			prev = obj;
			obj = obj.getNext();
		}
		
		recItem.setPrev(obj); // update this item
		obj.setPrev(prev);
		obj.setNext(recItem);
		tail = recItem;
		count++;
	}
	
	
	public void remove(T item) {
		if (head == null)
			return;
		
		LinkedNode<T> obj = head;
		LinkedNode<T> prev = null;
		
		
		while (true) {
			if (obj.getData().equals(item)) {
				break;
			}
			prev = obj;
			if (obj.getNext() == null)
				return; // not found
			
			obj = obj.getNext();
		}
		
		count--;
		LinkedNode<T> prox = obj.getNext();
		
		if (prev != null) {
			prev.setNext(obj.getNext());
		}
		else { // first item
			if (prox==null) {
				head = null;
				tail = null;
			}
			else {
				prox.setPrev(null);
				head = prox;
			}
			return;
		}
		
		if (prox != null) {
			prox.setPrev(prev);
		}
		else { // last item
			prev.setNext(null);
			tail = prev;
		}
	}
	
	public void list() {
		if (head == null)
			return;
		LinkedNode<T> obj = head;
		System.out.println("content: "+obj.getData());
		
		while (obj.getNext() != null) {
			obj = obj.getNext();
			System.out.println("content: "+obj.getData());
		}
		
	}
	
	public void listFromTail() {
		if (tail == null)
			return;
		LinkedNode<T> obj = tail;
		System.out.println("content: "+obj.getData());
		
		while (obj.getPrev() != null) {
			obj = obj.getPrev();
			System.out.println("content: "+obj.getData());
		}
	}

	public Object[] getArrayFromHead() {
		if (head == null)
			return null;
		Object[] array = new Object[count];
		LinkedNode<T> obj = head;
		array[0] = obj.getData();
		int ind = 1;
		
		while (obj.getNext() != null) {
			obj = obj.getNext();
			 array[ind++] = obj.getData();
		}
		
		return array;
	}
	
	public Object[] getArrayFromTail() {
		if (tail == null)
			return null;
		Object[] array = new Object[count];
		LinkedNode<T> obj = tail;
		array[0] = obj.getData();
		int ind = 1;
		
		while (obj.getPrev() != null) {
			obj = obj.getPrev();
			 array[ind++] = obj.getData();
		}
		
		return array;
	}
	
	public int getCount() {
		return count;
	}

}
