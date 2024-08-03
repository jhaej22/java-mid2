package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    } // 제네릭 메서드
      // 특정 시점에 타입인자에서 타입 매개변수로 전달 받은 뒤
      // 타입을 결정한 후 메서드 실행

    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    } // 일반적인 메서드에 와일드 카드 사용
      // 단순히 매개변수로 이미 결정된 제네릭 타입을 받을 뿐



    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printWildCardV3(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}

// 와일드 카드는 제네릭 타입이나 제네릭 메서드를 선언하는 것이 아님
// 이미 만들어진 제네릭 타입을 간편히 활용할 때 사용
