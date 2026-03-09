package com.staticvoid.cards;

import com.badlogic.gdx.utils.Array;

public class DiscardPile {

    private final Array<Card> cards = new Array<>(52);

    public void add(Card card) {
        cards.add(card);
    }

    public Card top() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Discard pile is empty");
        }
        return cards.peek();
    }

    public Card takeTop() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Discard pile is empty");
        }
        return cards.pop();
    }

    public void clear() {
        cards.clear();
    }

    public int size() {
        return cards.size;
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Array<Card> cards() {
        return cards;
    }
}
