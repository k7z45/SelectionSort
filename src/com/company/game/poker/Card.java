package com.company.game.poker;

/**
 * Created by slin2 on 2/22/2017.
 */
public class Card {
    Suit suit;
    Rank rank;

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
