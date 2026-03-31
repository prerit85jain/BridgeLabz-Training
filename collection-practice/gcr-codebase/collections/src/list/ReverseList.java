package list;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
	public static List<Integer> list = new ArrayList<>();
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String args[]) {
		generateList();
		reverseList();
		
		Node head = generatell();
		Node revStart = reversell(head);
		print(revStart);
		
	}
	
	public static Node generatell() {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		return head;
	}
	
	public static Node reversell(Node head) {
		Node prev = null;
		Node curr = head;
		Node next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static void print(Node head) {
		System.out.println("\n\nAfter Reverse\n");
		while(head!=null) {
			System.out.print(head.data+" -> ");
			head = head.next;
		}
	}
	
	public static void generateList() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	}
	
	public static void reverseList() {
		System.out.println("Original List");
		for(int i : list) {
			System.out.print(i+" ");
		}
		int start = 0;
		int end = list.size()-1;
		
		while(start < end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
		System.out.println("\nAfter Reverse");
		for(int i : list) {
			System.out.print(i+" ");
		}
	}
}
