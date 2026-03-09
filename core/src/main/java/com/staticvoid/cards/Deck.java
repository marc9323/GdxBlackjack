package com.staticvoid.cards;

import com.badlogic.gdx.utils.Array;

public class Deck {

    private final Array<Card> cards;

    public Deck() {
        this.cards = new Array<>(52);
        reset();
    }

    public final void reset() {
        cards.clear();

        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        cards.shuffle();
    }

    public Card drawTop() {
        if(cards.isEmpty()) {
            throw new IllegalStateException("Empty Deck");
        }
        return cards.pop();
    }

    public Card drawBottom() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }
        return cards.removeIndex(0);
    }

    public void addTop(Card card) {
        cards.add(card);
    }

    public void addBottom(Card card) {
        cards.insert(0, card);
    }

    public Card peekTop() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }
        return cards.peek();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int size() {
        return cards.size;
    }

    public Array<Card> cards() {
        return cards;
    }
}
