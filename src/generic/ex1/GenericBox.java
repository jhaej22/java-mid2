package generic.ex1;

/**
 * 제네릭 클래스 사용
 * : 코드 재사용과 타입 안정성 둘다 잡을 수 있음
 */

public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
