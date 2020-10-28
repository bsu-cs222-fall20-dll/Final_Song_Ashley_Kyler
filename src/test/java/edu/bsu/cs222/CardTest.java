package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
        public void testCardClubJ(){
        Card card = new Card();
        Assertions.assertEquals("False", card.compareCardsAfterShuffle());
    }
}
