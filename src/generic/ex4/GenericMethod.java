package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("object print = " + obj);
        return obj;
    } //  static 메서드

    public static <T> T genericMethod(T t) {
        System.out.println("generic print = " + t);
        return t;
    } // static 메서드에 제네릭 메서드 사용

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }
}

// 제네릭 메서드는 클래스 전체가 아니라 특정 메서드 단위로 제네릭을 도입할 때 사용
// 제네릭 메서드를 정의할 때는 반환타입 앞에 <T>와 같이 타입 매개변수를 선언해줌
// 제네릭 메서드는 실제 메서드를 호출하는 시점에 타입인자를 전달한 뒤 호출함
