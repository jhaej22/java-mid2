package collection.set;

import java.util.Arrays;

public class MyHastSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        } // 셋에 중복 데이터가 있는지 전체 데이터를 항상 확인해야 함

        elementData[size] = value;
        size++;
        return true;
    } // O(n)

    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    } // O(n)

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHastSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
