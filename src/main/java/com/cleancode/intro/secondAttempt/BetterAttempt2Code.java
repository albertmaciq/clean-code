package com.cleancode.intro.secondAttempt;

public class BetterAttempt2Code {

    public static void main(String[] args) {
        ValidatableNumber inputNumber = new ValidatableNumber(31);
        System.out.println(inputNumber.isBiggerThan(15));
        System.out.println(inputNumber.isBiggerThan(32));
    }
}
