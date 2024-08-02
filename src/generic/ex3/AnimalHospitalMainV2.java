package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}

// 제네릭의 타입 매개변수에 전달되는 타입 인자에 제한이 없기 때문에
// 어떤 타입이든 들어갈 수 있음
// 자바는 최종 부모 클래스인 Object 타입으로 가정함
// Object의 기능만 사용할 수 있음

