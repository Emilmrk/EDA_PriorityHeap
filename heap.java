package PriorityQueueHeap;

import java.util.ArrayList;

public class heap<E extends Comparable<E>> implements TADheap<E> {
	private ArrayList<E> array;
	private int heapPriory;
	
	public heap() {
		array=new ArrayList<E>();
		heapPriory = -1;
	}
	public void insert(E x, int priory) {
		if (isEmpty()) {
			System.out.println("Agregando el primer elemento");
			this.array.add(x);//Añadir solo el primer elemento
			heapPriory++;
		}else {
			if (priory<=this.heapPriory) {//si la prioridad es valida para el arbol prosigue
				if (hayEspaciodePrioridad(priory)) {
//					System.out.println("añadir sin prioridad");
					this.array.add(x);
					this.ActualizarPrioridad();
				}else {
//					System.out.println("Añadimos con prioridad");
					array.add((int) (Math.pow(2, priory+1)-2), x);
					this.ActualizarPrioridad();
				}
			}else {
				System.out.println("esta prioridad aun no existe");
			}
		}
		
	}
	public void remove() {
		this.array.remove(0);
		ActualizarPrioridad();
	}
	public String toString() {
		String lectura="";
		for (int i = 0; i < this.array.size(); i++) {
			lectura=lectura+" "+this.array.get(i);
		}
		return lectura;
	}
	public boolean isEmpty() {
		return this.heapPriory==-1;
	}
	private void ActualizarPrioridad() {
		int temporal=this.array.size(), count=-1;
		while (temporal!=0) {
			temporal=temporal/2;
			count++;
		}
		this.heapPriory=count;
	}
	public boolean hayEspaciodePrioridad(int priority) {
		return priority==this.heapPriory&&array.size()<Math.pow(2, this.heapPriory+1)-1;//si la prioridad dada es igual a la prioridad del arbol y el arbol no esta lleno (tamaño del arbol es menor que el tam) 
		//return this.array.size()!=Math.pow(2, priority)-1;//si el tamaño del arreglo es diferente a 2^prioridad -1
	}
}

