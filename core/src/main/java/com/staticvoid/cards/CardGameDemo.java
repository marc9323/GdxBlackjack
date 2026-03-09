package com.staticvoid.cards;

public class CardGameDemo {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand playerHand = new Hand();
        Hand enemyHand = new Hand();

        for (int i = 0; i < 5; i++) {
            playerHand.add(deck.drawTop());
            enemyHand.add(deck.drawTop());
        }

        for (Card card : playerHand.cards()) {
            System.out.println("Player card: " + card.shortName());
        }

        for(Card card : enemyHand.cards())
            System.out.println("Enemy card: " + card.shortName());

        System.out.println("Cards left in deck: " + deck.size());
    }
}
