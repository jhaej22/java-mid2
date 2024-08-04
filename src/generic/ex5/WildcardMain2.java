package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 와일드 카드는 상한뿐만 아니라 하한도 지정할 수 있음
 */

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objbox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objbox);
        writeBox(animalBox);
         //writeBox(dogBox);
         //writeBox(catBox);
         // 와일드 카드 타입 매개변수에 하한이 Animal임
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
