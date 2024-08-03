package generic.ex4;

import generic.animal.Animal;

// 만약 제네릭 타입의 타입 매개변수와
// 제네릭 메서드의 타입매개변수가 같은 경우에는..?
// 제네릭 타입보다 제네릭 메서드가 우선순위를 가짐

public class ComplexBox<T extends Animal> { // 제네릭 타입 사용

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) { // 제네릭 메서드 사용
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        //t.getName();
        // 여기서 타입 매개변수의 상한이 없으므로
        // Object 타입으로 취급된다.
        // 즉, Animal에 존재하는 메서드를 호출할 수 없음
        return t;
    }
}
