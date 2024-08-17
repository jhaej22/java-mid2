package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int) charA);
        System.out.println(charB + " = " + (int) charB);

        // hashCode
        System.out.println("hashCode(A) = " + hashCode("A"));
        System.out.println("hashCode(B) = " + hashCode("B"));
        System.out.println("hashCode(AB) = " + hashCode("AB"));

        // hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));


    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    } // hashCode() 메서드를 통해 문자를 기반으로 고유한 숫자를 만듦

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

}
