package com.company.game.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by slin2 on 2/22/2017.
 */
public class Deck {
    List<Card> deckOfCards = new ArrayList<>();

    public void initializeDeck() {
        // 52 cards in order
        for(Rank rank : Rank.values()) {
            for(Suit suit: Suit.values()) {
                deckOfCards.add(new Card(suit, rank));
            }
        }
    }

    public void reset() {
        initializeDeck();
    }

    public void shuffle() {
        Random rand = new Random();
        for(int i = 0; i < deckOfCards.size(); i++) {
            int target = rand.nextInt(deckOfCards.size() - i) + i;
            Card temp = deckOfCards.get(target);
            deckOfCards.set(target, deckOfCards.get(i));
            deckOfCards.set(i, temp);
        }
    }

    public List<Card> getFirstNCards(int n) {
        if(n > deckOfCards.size()) {
            throw new RuntimeException("Asking for more than available");
        }
        List<Card> result = new ArrayList<>(deckOfCards.subList(0, n));
        deckOfCards.subList(0, n).clear();
        return result;
    }
}
