package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    } // 어떤 리스트를 사용할지는 실행 시점에 생성자를 통해 결정함
      // MyArrayList의 인스턴스가 들어올 수 도 있고
      // MyLinkedList의 인스턴가 들어올 수도 있음

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
