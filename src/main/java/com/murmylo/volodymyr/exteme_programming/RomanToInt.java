package com.murmylo.volodymyr.exteme_programming;

public class RomanToInt {
    /**
     * This solution is based
     * @param s input roman number string
     * @return same number in decimal
     */
    public int romanToInt(String s) {
        int[] characterValue = new int[128];
        characterValue['I'] = 1;
        characterValue['V'] = 5;
        characterValue['X'] = 10;
        characterValue['L'] = 50;
        characterValue['C'] = 100;
        characterValue['D'] = 500;
        characterValue['M'] = 1000;
        int sum = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int value = characterValue[s.charAt(i)];
            if (i + 1 < length) {
                int nextValue = characterValue[s.charAt(i + 1)];
                if (value < nextValue) {
                    sum += nextValue - value;
                    i++;
                    continue;
                }
            }
            sum += value;
        }
        return sum;
    }
}
