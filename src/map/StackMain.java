package map;

import java.util.Stack;

/**
 * stack은 사용하면 안됨 -> deque 대신 사용
 */
public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 스택 요소 넣기 (push)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인( 꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기 (pop)
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }
}
