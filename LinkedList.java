/**
 * 
 */
package com.list;

import java.util.AbstractCollection;
import java.util.TreeSet;

import com.interfaces.InterfaceOne;
import com.interfaces.InterfaceTwo;
import com.list.bean.ThreadTest;
import com.list.bean.ThreadTestInter;

/**
 * @author e075269
 *
 */
public class LinkedList extends Thread implements InterfaceOne,InterfaceTwo {

	Node head;

	static class Node {

		public int data;
		public Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Code for linkedList ops
		 * 
		 * LinkedList l = new LinkedList();
		l = insert(l, 4);
		l = insert(l, 45);
		l = insert(l, 14);
		l = insert(l, 0);
		l = deleteAtPosition(l, 2);
		print(l);*/
		
		/*AbstractCollection<String> absCollection = new TreeSet<String>();
		
		absCollection.add("45");
		absCollection.add("4345");
		absCollection.add("4345");
		absCollection.add("4325");
		absCollection.add("432325");
		
		System.out.println(absCollection.toString());
		
		absCollection.add("45425");
		
		System.out.println(absCollection.toString());*/
		
		/*ThreadTest tt = new ThreadTest();
		tt.start();//8 - Thread-0 executing.
		tt.run();//1 - main executing.
*/		
		
		/*Thread t = new Thread(new ThreadTestInter());
		t.start();//8 - Thread-0 executing.
		t.run();//1 - main executing.
*/	
		LinkedList l = new LinkedList();
		
	
	}

	public static LinkedList insert(LinkedList list, int data) {

		Node n = new Node(data);

		if (list.head == null) {
			list.head = n;
			n.next = null;
		} else {
			Node head = list.head;
			while (head.next != null) {
				head = head.next;
			}
			head.next = n;
			n.next = null;
		}
		return list;
	}

	public static void print(LinkedList list) {

		Node head = list.head;

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static LinkedList delete(LinkedList list, int data) {

		Node n = new Node(data);

		if (list.head == null) {
			System.out.println("empty list");
		} else {
			Node head = list.head;
			if (head.data == data) {
				list.head = head.next;
			} else {
				while (head.next.data != data) {
					head = head.next;
					if (head.next == null) {
						// System.out.println("Not found");
						break;
					}
				}
				if (head.next == null) {
					System.out.println("Not found");
				} else {
					head.next = head.next.next;
				}
			}
		}
		return list;
	}

	public static LinkedList deleteAtPosition(LinkedList list, int index) {

		if (list.head == null) {
			System.out.println("empty list");
		} else {
			Node head = list.head;
			if (index == 0) {
				list.head = null;
			} else {
				int count = 0;
				while (head.next != null ) {
					if(count == index){
						head = head.next.next;
						break;
					} else{
						head = head.next;	
					}
					
				}
				if (head.next == null) {
					System.out.println("Not found");
				} else {
					head.next = head.next.next;
				}
			}
		}
		return list;
	}

	@Override
	public void log() {
		System.out.println("Finalyy here");
	}
}
