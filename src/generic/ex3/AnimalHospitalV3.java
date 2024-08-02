package generic.ex3;

import generic.animal.Animal;

/**
 * 타입 매개변수 제한
 */

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
       return animal.getSize() > target.getSize() ? animal : target;
    }
}

// 타입 매개변수 T를 Animal과 그 자식 클래스만 받을 수 있게 제한함
// 자바 컴파일러는 타입 매개변수에 입력될 수 있는 타입의 범위를 예측할 수 있음
// Animal의 메서드 기능을 사용할 수 있게 됨
