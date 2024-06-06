package lesson11;

import java.util.ArrayList;

public class ObjectList<T> extends ArrayList<T> { //型？？OblectList⑦　ArrayList⑦

	public boolean add(T value) {
		return super.add(value);
	}

	public T get(int index) {
		return super.get(index);
	}
}

