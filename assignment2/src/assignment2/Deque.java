package assignment2;

public interface Deque<E> {
	int size();

	boolean isEmpty();

	E last();

	
	E first();
	
	E removeFirst();

	E removeLast();
	
	void addLast(E e);

	void addFirst(E e);

	

}
