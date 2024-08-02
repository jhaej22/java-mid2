package generic.ex2;

/**
 * 객체를 보관하는 제네릭 클래스
 */
public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
