package edu.bsu.cs222;

import java.util.Random;

public class Card {
    static String suits[] = {"Heart", "Diamond", "Club", "Spade"};
    static String cardNumbers[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static final int totalCards = 52;//a set of new cards without joker
    static CardInitial cards[] = new CardInitial[totalCards];

    public Card() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < cardNumbers.length; j++) {
                cards[i * 13 + j] = new CardInitial(suits[i], cardNumbers[j]);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int p = random.nextInt(cards.length);
            CardInitial temp = cards[i];
            cards[i] = cards[p];
            cards[p] = temp;
        }
    }


    public CardInitial[] getCard() {
        return Card.cards;
    }

    public CardInitial getOneCard(int n) {
        return Card.cards[n - 1];
    }

    public void displayCardsAfterShuffle() {
        for (int i = 0; i < totalCards; i++) {
            cards[i].displayNewCard();
        }
        System.out.println();
    }

    public String compareCardsAfterShuffle() {
        CardInitial cardsBefore[] = new CardInitial[totalCards];
        String result = new String();
        for (int i = 0; i < totalCards; i++) {
            if (cardsBefore[i] == cards[i]){
                result = "True";
            }else {
                result = "False";
            }
        }
        return result;
    }
}
