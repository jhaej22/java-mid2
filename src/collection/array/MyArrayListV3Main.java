package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        // 리스트 마지막에 추가 -> o(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 리스트에 원하는 위치에 추가 -> o(n)
        System.out.println("addLast");
        list.add(3, "addLast"); // o(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        // 리스트에 원하는 위치 삭제 -> o(n)
        Object removed1 = list.remove(4);
        System.out.println("remove(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);
        System.out.println("remove(0) = " + removed2);
        System.out.println(list);
    }
}