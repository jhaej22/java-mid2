package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    // 다양한 데이터 타입을 보관하기 위해 Object 배열 사용
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    } // 기본 생성자 : 배열의 크기가 5

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    } // 생성자: 매개변수의 크기만큼 배열의 크기가 지정됨

    public int size() {
        return size;
    }

    public void add(Object e) {
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    } // 리스트에 데이터 추가. 추가 될때마다 size가 하나씩 증가

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
        // 기존 배열의 크기를 2배 늘리고 데이터 값을 복사하여 배열을 새로 생성
    }

    public Object get(int index) {
        return elementData[index];
    } // 인덱스에 있는 항목을 조회

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    } // 인덱스에 있는 항목을 변경. 기존의 데이터 값을 반환

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    } // 검색 기능. 리스트를 순차 탐색해서 같은 데이터의 인덱스 값을 반환. 데이터 없으면 -1 반환

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " +
                size + ", capacity = " + elementData.length;
    } // Arrays.copyOf(기존의 배열, 새로운 길이)로 복사하여 새로운 배열을 만들어줌

}
