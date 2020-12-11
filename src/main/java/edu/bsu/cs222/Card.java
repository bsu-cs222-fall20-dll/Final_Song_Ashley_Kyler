package edu.bsu.cs222;

//import com.sun.javafx.tk.Toolkit;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;

//import java.awt.*;
import java.util.Random;

public class Card {
    // Card Classification
    static final int totalCards = 52;
    static String[] suits = {"Heart", "Diamond", "Club", "Spade"};
    static String[] cardNumbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static CardInitial[] cards = new CardInitial[totalCards];

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
    //allowing the user or computer to draw one card
    public CardInitial getOneCard(int n) {
        return Card.cards[n - 1];
    }

    public void showCards() {
        for(int i = 0; i < totalCards; i++) {
            cards[i].displayNewCard();
        }
        System.out.println();
    }

    public String compareCardsAfterShuffle() {
        Being able to compare cards after each shuffle
        CardInitial[] cardsBefore = new CardInitial[totalCards];
        String result = "";

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
