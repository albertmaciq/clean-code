package com.cleancode.intro.firstAttempt;

import java.util.function.Predicate;

public class BetterAttempt1Code {

    static Predicate<Integer> createValidator(String mode, int number) {
        if (mode.equals("Max")) {
            return value -> value < number;
        } else if (mode.equals("Min")) {
            return value -> value > number;
        }
        return null;
    }

    public static void main(String[] args) {
        Predicate<Integer> isBelowMax = createValidator("Max", 31);
        System.out.println(isBelowMax.test(15));
        System.out.println(isBelowMax.test(32));
    }
}
