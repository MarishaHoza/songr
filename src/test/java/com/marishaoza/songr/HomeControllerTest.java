package com.marishaoza.songr;

import com.marishaoza.songr.controllers.HomeController;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void reverseText_oneWord() {
        assertEquals("A single word should not be changed",
                "hello", HomeController.reverseText("hello"));
    }

    @Test
    public void reverseText_manyWords() {
        assertEquals("Words should be returned in reverse order",
                "reversed be should this", HomeController.reverseText("this should be reversed"));
    }

    @Test
    public void reverseText_emptyString() {
        assertEquals("An empty string should remain empty",
                "", HomeController.reverseText(""));
    }

    @Test ( expected = NullPointerException.class )
    public void reverseText_null() {
        // an error should be thrown if reverseText is called on null
        HomeController.reverseText(null);
    }
}