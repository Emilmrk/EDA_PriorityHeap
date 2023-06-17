package PriorityQueueHeap;

public class test {
	public static void main(String[]args) {
		//			ArrayList<Integer> numerosArrayList=new ArrayList<Integer>();
		//			priorityQueueHeap<Integer> miobjetoHeap =new priorityQueueHeap<Integer>();
		heap<Integer> myHeap = new heap<Integer>();
		myHeap.insert(10, 0);//0
		myHeap.insert(20, 0);//1
		myHeap.insert(45, 1);//1
		myHeap.insert(56, 0);//2
		myHeap.insert(23, 1);//2
		myHeap.insert(2, 1);//2
		myHeap.insert(6, 0);//2
		myHeap.insert(24, 0);//3
		myHeap.insert(15, 1);//3
		myHeap.insert(14, 2);//3
		System.out.println(myHeap);
		myHeap.remove();
		System.out.println(myHeap);
		myHeap.remove();
		myHeap.remove();
		myHeap.remove();
		System.out.println(myHeap);
		myHeap.insert(50, 2);
		myHeap.insert(53, 0);;
		System.out.println(myHeap);
	}
}

