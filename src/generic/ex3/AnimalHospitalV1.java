package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        // Animal 클래스에 있는 메서드이기 때문에 사용 가능
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}

// 개와 고양이를 모두 받을 수 있는 병원
// Dog와 Cat의 부모 클래스인 Animal을 통해 다형성 구현
