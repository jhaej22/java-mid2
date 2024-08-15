package collection.list.test.ex1;

import java.io.*;
import java.util.ArrayList;

public class ListEx3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> scores = new ArrayList<>();
        int sum = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }
            scores.add(num);
            sum += num;
        }

        double average = (double) sum / scores.size();
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
