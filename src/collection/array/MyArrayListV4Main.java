package collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String str = stringList.get(0);
        System.out.println("str = " + str);
        // stringList에는 String 문자열만 보관하고 조회가능

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
        // intList에는 Interger 숫자만 보관하고 조회가능
    }
}

// 배열에 넣을 때는 add메서드의 매개변수로 지정된 타입만 넣을 수 있음
// 배열에서 데이터를 조회할 때도 get 메서드의 매개변수를 통해 지정된 타입만 조회할 수 있음