package com.staticvoid.cards;

import com.badlogic.gdx.utils.Array;

public final class CardUtils {

    private CardUtils() {
    }

    public static Array<Card> newStandard52Deck() {
        Array<Card> deck = new Array<>(52);

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }

        return deck;
    }

    public static Array<Card> copy(Array<Card> source) {
        return new Array<>(source);
    }
}
