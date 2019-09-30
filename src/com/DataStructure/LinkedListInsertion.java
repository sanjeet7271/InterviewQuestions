package com.DataStructure;
/**
 * Steps :
 * 1.	Linked List Class 
 * 2.	declare head of list 
 * 3.	create Node Class
 * 4.   constructor to create a new node 
 */
class LinkedListInsertion {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	/**
	 * This function is in LinkedList class. Inserts a new Node at front of the list. This method is defined inside LinkedList class shown above
	 * 1.	1 & 2: Allocate the Node & Put in the data
	 * 2.	Make next of new Node as head
	 * 3.	Move the head to point to new Node
	 * 
	 */
	public void push(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	/**
	 * This function is in LinkedList class.Inserts a new node after the given prev_node. This method is defined inside LinkedList class shown above 
	 *1.	Check if the given Node is null
	 *2.	Allocate the Node & 3. Put in the data
	 *4.	Make next of new Node as next of prev_node
	 *5.	make next of prev_node as new_node
	 *
	 */
	public void insertAfter(Node prev_node, int new_data) {
		if(prev_node==null) {
			System.out.println("Given previouse node cannot node");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	
	public void append(int new_data) {
		Node new_node=new Node(new_data);
		if(head==null) {
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
	public static void main(String args[]) {
		LinkedListInsertion list=new LinkedListInsertion();
		list.append(5);
		list.push(6);
		list.push(1);
		list.append(8);
		list.insertAfter(list.head.next, 9);
		list.printList();
	}
}