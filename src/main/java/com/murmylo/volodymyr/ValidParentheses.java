package com.murmylo.volodymyr;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> parentheses = Map.of('{', '}', '[', ']', '(', ')');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (parentheses.containsKey(c)) {
                stack.push(parentheses.get(c));
                continue;
            }
            if (parentheses.containsValue(c)) {
                if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
