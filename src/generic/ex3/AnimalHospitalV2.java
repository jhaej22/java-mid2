package generic.ex3;

import generic.animal.Animal;

/**
 * 제네릭 도입과 실패
 */

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        // Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);
        // T의 타입을 메서드를 정의하는 시점에 알 수 없음
        // System.out.println("동물 이름: " + animal.getName());
        // System.out.println("동물 크기: " + animal.getSize());
        // animal.sound();
    }

    public T bigger(T target) {
        // 컴파일 오류
       // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}

// 개와 고양이를 모두 받을 수 있는 병원
// Dog와 Cat의 부모 클래스인 Animal을 통해 다형성 구현
