package com.staticvoid.cards;

public record Card(Suit suit, Rank rank) {
    // ... nothing here yet ...
    public String shortName() {
        return rank.symbol() + suit.symbol();
    }

    public String textureKey() {
        return rank.name().toLowerCase() + "_of_" + suit.name().toLowerCase();
    }
}
