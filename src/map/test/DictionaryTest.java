package map.test;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q' ) : ");
            String word = scanner.nextLine();
            if (word.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String meaning = scanner.nextLine();

            dictionary.put(word, meaning);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾으려는 영어 단어를 입력하세요 (종료는 'q') : ");
            String word = scanner.nextLine();
            if (word.equals("q")) {
                break;
            }

            if (dictionary.containsKey(word)) {
                System.out.println(word + "의 뜻: " + dictionary.get(word));
            } else {
                System.out.println(word + "(은)는 사전에 없는 단어입니다.");
            }
        }
    }
}
