package com.company.game.poker;

import java.util.List;

/**
 * Created by slin2 on 2/22/2017.
 */
public class Player {

    Hand hand = new Hand();
    Deck deck;
    String name;
    private static final int LANDLOARD_NUM = 17;

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
    }

    public void getFightLandLordHand() {
        hand.getCards(deck, LANDLOARD_NUM);
    }

    public void showHand() {
        System.out.println(name + "'s hand : " + hand);
    }

    public void selectionSort() {
        List<Card> cardList = hand.getCardList();
        for(int  i = 0; i < cardList.size(); i++) {
            int min = cardList.get(i).getRank().ordinal(), minIdx = i;
            for(int j = i + 1; j < cardList.size(); j++) {
                if(cardList.get(j).getRank().ordinal() < min) {
                    min = cardList.get(j).getRank().ordinal();
                    minIdx = j;
                }
            }
            Card card = cardList.get(minIdx);
            cardList.set(minIdx, cardList.get(i));
            cardList.set(i, card);
            showHand();
        }
    }
}
