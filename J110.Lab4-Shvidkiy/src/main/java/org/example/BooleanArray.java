package org.example;

public interface BooleanArray {
    int MAX_SIZE = 1024;

    boolean get(int index);
    void setTrue(int index);
    void set(int index, boolean value);
    void setFalse(int index);
    boolean flip(int index);
    int countTrue();

    /**
     * Возвращает последовательность нулей и единиц, где каждый символ представляет значение соответствующего
     * элемента массива
     */
    @Override
    String toString();
}
