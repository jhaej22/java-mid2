package collection.deque.test.stack;

import java.util.Deque;
import java.util.ArrayDeque;

public class BrowserHistory {

    private Deque<String> deque = new ArrayDeque<>();
    private String currentpage = null;

    public void visitPage(String url) {
        if (currentpage != null) {
            deque.push(currentpage);
        }

        currentpage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!deque.isEmpty()) {
            currentpage = deque.pop();
            System.out.println("뒤로 가기: " + currentpage);
            return currentpage;
        }
        return null;
    }
}
