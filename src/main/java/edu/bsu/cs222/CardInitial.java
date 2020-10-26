package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.List;

public class CardInitial {
    private String suits;
    private String cardNumbers;
    public int point;

    //List<Card> list = new ArrayList();
    //JSONObject json = JSONObject.fromObject(str);
    //Not sure if we need to use Json

    public CardInitial(String suits, String cardNumbers) {
        this.suits = suits;
        this.cardNumbers = cardNumbers;
        if(cardNumbers== "J" || cardNumbers == "Q" || cardNumbers == "K") {
            this.point = 10;
        } else if(cardNumbers == "A") {
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
        System.out.print("Suit" + suits);
        System.out.print("CardNumber" + cardNumbers);
        System.out.println("Point" + point);
    }
}
