package PriorityQueueHeap;

public class priorityQueueHeap<E extends Comparable<E>> {
	private heap<E> myHeap;
	
	public priorityQueueHeap() {
		this.myHeap=new heap<E>();
	}
	public void Enqueue(E x, int priory) {
		myHeap.insert(x, priory);
	}
	public E Dequeue() {
		E temp = this.myHeap.getElementk(0);
		this.myHeap.remove();
		return temp;
	}
	public E front() {
		return this.myHeap.getElementk(0);
	}
	public E back() {
		return this.myHeap.ultimo();
	}
}
