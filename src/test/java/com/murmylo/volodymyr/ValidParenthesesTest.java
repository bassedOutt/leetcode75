package com.murmylo.volodymyr;

import com.murmylo.volodymyr.exteme_programming.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void returnsTrueWhenValidString() {
        String s = "{[]}";
        assertTrue(validParentheses.isValid(s));
    }
}
