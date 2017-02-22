package com.company.game.poker;

public class Game {

    public static void main(String[] args) {
	    // write your code here
        Deck deck = new Deck();
        deck.initializeDeck();
        Player player1 = new Player("player1", deck), player2 = new Player("player2", deck), player3 = new Player("player3", deck);

        deck.shuffle();
        player1.getFightLandLordHand();
        player2.getFightLandLordHand();
        player3.getFightLandLordHand();

        player1.showHand();
//        player2.showHand();
//        player3.showHand();

        player1.selectionSort();

    }
}
