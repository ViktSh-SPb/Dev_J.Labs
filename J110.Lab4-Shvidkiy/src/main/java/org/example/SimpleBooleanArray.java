package org.example;

public class SimpleBooleanArray implements BooleanArray {

    private final boolean[] storage = new boolean[MAX_SIZE];

    @Override
    public boolean get(int index) {
        return storage[index];
    }

    @Override
    public void setTrue(int index) {
        storage[index] = true;
    }

    @Override
    public void set(int index, boolean value) {
        storage[index] = value;
    }

    @Override
    public void setFalse(int index) {
        storage[index] = false;
    }

    @Override
    public boolean flip(int index) {
        storage[index] = !storage[index];
        return storage[index];
    }

    @Override
    public int countTrue() {
        int trueCount = 0;
        for (boolean b : storage) if (b) trueCount++;
        return trueCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (boolean b : storage) {
            if (b) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.toString();
    }
}
