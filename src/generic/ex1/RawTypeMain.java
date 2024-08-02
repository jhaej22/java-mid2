package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        // GenericBox<Object> integerBox = new GenericBox<Object>(); 권장
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);
        // 원시 타입을 사용하면 내부의 타입 매개변수가 Object로 사용된다고 이해하면 됨
        // 제네릭 타입을 사용할 때는 항상 <>를 사용해서 사용시점에 원하는 타입을 지정해야한다.(인수, 인자 지정)
    }
}
