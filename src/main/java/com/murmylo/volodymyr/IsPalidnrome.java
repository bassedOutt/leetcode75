package com.murmylo.volodymyr;

public class IsPalidnrome {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        while (head <= tail) {
            char cHead = s.charAt(head);
            char cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalidnrome isPalidnrome = new IsPalidnrome();
        System.out.println(isPalidnrome.isPalindrome("race a car"));
        System.out.println(isPalidnrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalidnrome.isPalindrome("raceacar"));
    }

}
