package PriorityQueueHeap;

public interface TADheap<E extends Comparable<E>> {
	void insert(E x, int priory);
	void remove();
	boolean isEmpty();
}
