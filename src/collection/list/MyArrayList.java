package collection.list;

import java.util.Arrays;

/**
 * 제네릭 타입 도입
 */

public class MyArrayList<E> implements MyList<E>{

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    // 다양한 데이터 타입을 보관하기 위해 Object 배열 사용
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    } // 기본 생성자 : 배열의 크기가 5

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    } // 생성자: 매개변수의 크기만큼 배열의 크기가 지정됨

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    @Override
    public void add(int index, E e) {

        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    } // 리스트에 데이터 추가. 추가 될때마다 size가 하나씩 증가

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
        // 기존 배열의 크기를 2배 늘리고 데이터 값을 복사하여 배열을 새로 생성
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        } // 리스트의 마지막(size)부터 해당 인덱스까지 오른쪽으로 밀기
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E)elementData[index];
    } // 고정된 타입으로 다운 캐스팅

    @Override
    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    } // 인덱스에 있는 항목을 변경. 기존의 데이터 값을 반환

    @Override
    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    @Override
    public int indexOf(E o) {
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

// E[] elementData가 아니라 Object[] elementDate를 사용한 이유
// : 제네릭은 컴파일이후 런타임에 타입 이레이저에 의해 삭제된다.
// : 런타임에 객체를 생성하는 생성자는 타입 정보가 필요한데 이미 삭제되었기 때문에
// : 생성자와 함께 제네릭을 사용할 수 없다.
