package map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1_2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        // getOrDefault(k, defaulValue): key와 연결된 value를 반환
        // 만약 키가 없다면 defalutValue를 반환

        System.out.println(map);
    }
}
