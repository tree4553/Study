package list.arraylist.implementation;

public class ArrayList {
	private int size = 0;
	private int maxSize = 100;
	private Object[] elementData = new Object[100];
	
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	public boolean addLast(Object element) {
//		elementData[size] = element;
//		size++;
		add(size, element);
		return true;
	}
	
	public boolean add(int index, Object element) {
		if(size == maxSize) {
			Object[] newelementData = new Object[maxSize*2];
			for(int i = 0 ; i < size; i++) {
				newelementData[i] = elementData[i];
			}
			elementData = newelementData;
			maxSize *= 2;
		}
		for(int i = size-1; i>= index; i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}
	
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i = index + 1; i <= size -1 ; i++) {
			elementData[i-1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
	}
	
	public Object removeFirst() {
		return remove(0);
	}
	
	public Object removeLast() {
		return remove(size-1);
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	
	public String toString() {
		String str = "[";
		for(int i = 0 ; i < size; i++) {
			str += elementData[i];
			if(i < size-1) {
				str += ",";
			}
		}
		return str + "]";
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object element) {
		for(int i = 0; i < size; i++) {
			if(element.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
}
