package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Failed
public class CardInitialTest {
    @Test
    public void testInitialCardClubJ(){
        CardInitial cardInitial = new CardInitial("Club", "J");
        Assertions.assertEquals("J", cardInitial.getCardNumbers());
        Assertions.assertEquals("Club", cardInitial.getSuits());
        Assertions.assertEquals(10, cardInitial.getPoint());
    }

    @Test
    public void testInitialCardDiamondQ(){
        CardInitial cardInitial = new CardInitial("Diamond", "Q");
        Assertions.assertEquals("Q", cardInitial.getCardNumbers());
        Assertions.assertEquals("Diamond", cardInitial.getSuits());
        Assertions.assertEquals(10, cardInitial.getPoint());
    }

    @Test
    public void testInitialCardSpadeK(){
        CardInitial cardInitial = new CardInitial("Spade", "K");
        Assertions.assertEquals("K", cardInitial.getCardNumbers());
        Assertions.assertEquals("Spade", cardInitial.getSuits());
        Assertions.assertEquals(10, cardInitial.getPoint());
    }

    @Test
    public void testInitialCardHeartA(){
        CardInitial cardInitial = new CardInitial("Heart", "A");
        Assertions.assertEquals("A", cardInitial.getCardNumbers());
        Assertions.assertEquals("Heart", cardInitial.getSuits());
        Assertions.assertEquals(1, cardInitial.getPoint());
    }

    @Test
    public void testInitialCard7(){
        CardInitial cardInitial = new CardInitial("Heart", "7");
        Assertions.assertEquals("7", cardInitial.getCardNumbers());
        Assertions.assertEquals(7, cardInitial.getPoint());
    }

    //The following tests should be in gameTest
    //reserve temporarily
    /*@Test
    public void testCompareCardPointsSmaller(){
        Card card = new Card();
        String result = card.compareCardPoints(1, 11);
        Assertions.assertEquals("Smaller", result);
    }

    @Test
    public void testCompareCardPointsBigger(){
        Card card = new Card();
        String result = card.compareCardPoints(11, 1);
        Assertions.assertEquals("Bigger", result);
    }

    @Test
    public void testCompareCardPointsSame(){
        Card card = new Card();
        String result = card.compareCardPoints(11, 11);
        Assertions.assertEquals("Same", result);
    }*/
}
