/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Winter 2019
 * Assignment 2
 * Section:  M  
 * Student Name:Ahmad Baig  
 * Student eecs account: ahmad85
 * Student ID number: 215180870
 **********************************************************/
package assignment2;

import java.util.Stack;

public class NewDeque implements Deque<Object>{

	Stack<Object> first = new Stack<>();
	Stack<Object> second = new Stack<>();

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		NewDeque l = new NewDeque();
 		 
 		
 		System.out.println("l empty status: " + l.isEmpty());
 		System.out.println("10 numbers are put into the stack...");
 		for (int i = 0; i <10; i++) {
 			l.addLast(i);
 		}
 		System.out.println("l empty status: " + l.isEmpty());
 		System.out.println("first element: " + l.first());
 		System.out.println("last element: " + l.last());
		l.removeLast();
		System.out.println("removing last element...");
		System.out.println("last element: " + l.last());
 		l.removeFirst();
 		System.out.println("removing first element...");
 		System.out.println("first element: " + l.first());
 		System.out.println("adding 'first' and 'last' as strings...");
 		l.addFirst("first");
 		l.addLast("last");
 		System.out.println("last element: " + l.last());
 		System.out.println("first element: " + l.first());
 		System.out.println("total amount of elements: " + l.size());
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		int i=0;
		while (!first.empty() || !second.empty()) {
			if (first.empty()) {
				second.pop();
				i++;
			} else {
				first.pop();
				i++;
			}
		}
		return i;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(first.empty()&&second.empty()) {
			return true;
		}
		else {		
			return false;
		}
	}

	

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if(first.empty()&&second.empty()) {
			return null;
		}else{
			while(first.empty()!=true) {
				second.push(first.pop());
			}
			return second.peek();
		}
	}

	
	@Override
	public Object last() {
		// TODO Auto-generated method stub
		if(first.empty()&&second.empty()) {
			return null;
		}else{
			while(second.empty()!=true) {
				first.push(second.pop());
			}
			return first.peek();
		}
	}
	@Override
	public Object removeFirst() {
		// TODO Auto-generated method stub
		if(first.empty()&&second.empty()) {
			return null;
		}else{
			while(first.empty()!=true) {
				second.push(first.pop());
			}
			return second.pop();
		}
	}
	@Override
	public void addFirst(Object e) {
		// TODO Auto-generated method stub
		
			while(first.empty()!=true) {
				second.push(first.pop());
			}
			second.push(e);
	}
	@Override
	public Object removeLast() {
		// TODO Auto-generated method stub
		if(first.empty()&&second.empty()) {
			return null;
		}else{
			while(second.empty()!=true) {
				first.push(second.pop());
			}
			return first.pop();
		}
	}

	@Override
	public void addLast(Object e) {
		// TODO Auto-generated method stub
		while (second.empty()!=true) {
			first.push(second.pop());
		}
		second.push(e);
	}
}
