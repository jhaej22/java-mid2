package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        // MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        // 생성자에 어떤 리스트를 사용할지 결정해서 넘김
        processor.logic(1_000_000);
        // 생성자로 넘긴 자료 구조(리스트)를 사용해서 실행
    }
}
