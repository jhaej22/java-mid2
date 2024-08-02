package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //  문제1: 개 병원에 고양이 전달
        dogHospital.set(cat); // 인수 체크 실패: 컴파일 오류가 발생하지 않음

        //  문제2: 개 타입 반환 -> 다운 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

// 코드 재사용: 개와 고양이 모두를 받을 수 있는 병원이므로 재사용성 높음
// 타입 안정성: 타입 안정성이 떨어짐.
// 개 병원에 고양이를 전달하는 문제 발생
// Animal 타입이므로 다운캐스팅 해야함

