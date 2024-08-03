package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.<Dog>printGenericV1(dogBox);// 제네릭 메서드
        WildcardEx.printWildcardV1(dogBox); // 일반적인 메서드
        // 타입 인자가 미리 정해진 제네릭 타입을 전달 받아서 활용할 떄 와일드 카드 사용

        WildcardEx.<Dog>printGenericV2(dogBox); // 제네릭 메서드
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.<Dog>printAndReturnGeneric(dogBox); // 제네릭 메서드
        Animal animal = WildcardEx.printWildCardV3(dogBox); // 일반적인 메서드
    }
}
