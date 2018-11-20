package com;

public class DynamicArray<T> {

    private int arrayLength = 16;
    private Object[] array;
    private int counter = 0;

    public DynamicArray() {
        array = new Object[arrayLength];
    }

    public DynamicArray(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public void add(T element) {
        if (counter == arrayLength) arrayLength *= 2;
        Object[] newArray = new Object[arrayLength];

        for (int i = 0; i < counter; i++) {
            newArray[i] = array[i];
        }

        newArray[counter++] = element;
        array = newArray;
    }

    public void remove (int index) {
        if (counter == 0) throw new RuntimeException();

        Object[] newArray = new Object[array.length];

        int cou = 0;
        for (int i = 0; i < counter; i++) {
            if (i == index) continue;
            newArray[cou++] = array[i];
        }
        counter--;
        array = newArray;
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < counter; i++) {
            builder.append("{");
            builder.append(array[i]);
            builder.append("}");
        }
        return builder.toString();
    }
}
