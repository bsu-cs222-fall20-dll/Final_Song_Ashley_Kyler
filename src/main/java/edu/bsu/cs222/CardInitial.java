package edu.bsu.cs222;

//import javafx.application.Platform;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Paint;
//import java.text.AttributedCharacterIterator;

public class CardInitial {
    private final String suits;
    private final String cardNumbers;
    //private final Image cardImage;
    //private int x = 0;
    //private int y = 0;
    //private final int cardWidth = 80;
    //private final int cardHeight = 100;
    public int point;

    public CardInitial(String suits, String cardNumbers) {
        this.suits = suits;
        this.cardNumbers = cardNumbers;

        if(cardNumbers.equals("J") || cardNumbers.equals("Q") || cardNumbers.equals("K")) {
            this.point = 10;
        } else if(cardNumbers.equals("A")) {
            this.point = 1;
        } else {
            this.point = Integer.parseInt(cardNumbers);
        }
    }

    public String getSuits() {
        return suits;
    }

    public String getCardNumbers() {
        return cardNumbers;
    }

    public int getPoint() {
        return point;
    }

    public void displayNewCard() {
        System.out.print(suits + " " + cardNumbers);
        System.out.println();
    }

    public String displayFinalCard() {
        return (suits + " " + cardNumbers + " ");
    }

}
