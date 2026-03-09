package com.staticvoid.cards;

import com.badlogic.gdx.utils.Array;

public class Hand {

    private final Array<Card> cards = new Array<>(false, 10);

    public void add(Card card) {
        cards.add(card);
    }

    public Card removeAt(int index) {
        return cards.removeIndex(index);
    }

    public boolean remove(Card card) {
        return cards.removeValue(card, false);
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

    public Card get(int index) {
        return cards.get(index);
    }

    public Array<Card> cards() {
        return cards;
    }
}
