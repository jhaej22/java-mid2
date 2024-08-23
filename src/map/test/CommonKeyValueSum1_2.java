package map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1_2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
        // put() 메서드 대신 Map.of() 메서드를 사용하면 편리하게 Map을 생성할 수 있음

        Map<String, Integer> resultMap = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                resultMap.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(resultMap);
    }
}
