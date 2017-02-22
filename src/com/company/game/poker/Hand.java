package com.company.game.poker;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by slin2 on 2/22/2017.
 */
public class Hand {
    public List<Card> getCardList() {
        return cardList;
    }

    List<Card> cardList;

    public void getCards(Deck deck, int n) {
        cardList = deck.getFirstNCards(n);
    }

    @Override
    public String toString() {
        return cardList.stream().map(card -> {return card.getRank() + "(" + card.getSuit() + ")";}).collect(Collectors.joining(" "));
    }


}
