package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public int rankSum() {
        int value = 0;
        for (Card card : hand) {
            value += card.getRank();
        }
        return value;
    }

    public String getName() {
        return name;
    }

    public void showHand() {
        hand.sort(null);
        for (Card card : hand) {
            System.out.println(this.name + "의 카드" + hand + ", 합계: " + rankSum());
        }
    }
}
