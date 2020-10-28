package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
        public void testInitialCardClubJ(){
        Card card = new Card();
        Assertions.assertEquals("F", card.compareCardsAfterShuffle());
    }
}
