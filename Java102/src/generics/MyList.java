package generics;

import java.util.Arrays;

public class MyList<T> {
    public T[] array;
    public int capacity;
    public int indexStart = 0;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public MyList() {
        setCapacity(10);
        this.array = (T[]) new Object[getCapacity()];
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        this.array = (T[]) new Object[getCapacity()];
    }

    public int size() {
        return this.indexStart;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(T data) {

        if (indexStart == getCapacity()) {
            setArray(updateList(array));
            setCapacity(getCapacity() * 2);
            array[indexStart++] = data;
        } else {
            array[indexStart++] = data;
        }
    }

    public T[] updateList(T[] array) {
        T[] array2 = (T[]) new Object[getCapacity() * 2];
        for (int i = 0; i < getCapacity(); i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public T get(int index) {
        if (index > getCapacity()) {
            return null;
        } else return (T) array[index];
    }

    public T[] remove(int index) {
        if (index > this.indexStart) {
            return null;
        } else {
            for (int i = index; i < getCapacity(); i++) {
                if (i != getCapacity() - 1) {
                    array[i] = array[i + 1];
                }
            }
        }
        setArray(array);
        this.indexStart--;
        return this.array;
    }

    public T[] set(int index, T data) {
        if (index < 0 || index > getCapacity())
            return null;
        else {
            array[index] = data;
        }
        setArray(array);
        return this.array;
    }

    public int indexOf(T data) {
        for (int i = 0; i < getCapacity(); i++) {
            if (this.array[i] == data)
                return i;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int lastIndex = -1;
        for (int i = 0; i < getCapacity(); i++) {
            if (array[i] == data)
                lastIndex = i;
        }
        return lastIndex;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T[] toArray() {
        T[] newArray = (T[]) new Object[getCapacity()];
        for (int i = 0; i < getCapacity(); i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void clear() {
        T[] newArray = (T[]) new Object[getCapacity()];
        setArray(newArray);
        this.indexStart = 0;
    }

    public T[] sublist(int start, int finish) {
        T[] newArray = (T[]) new Object[finish - start + 1];
        int count = 0;
        for (int i = start; i < finish; i++) {
            newArray[count++] = array[i];
        }
        return newArray;
    }

    public boolean contains(T data) {
        for (int i = 0; i < getCapacity(); i++) {
            if (array[i] == data)
                return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "MyList{" +
                "array=" + Arrays.toString(array) +
                ", capacity=" + capacity +
                ", indexStart=" + indexStart +
                '}';
    }
}
