package com.cleancode.intro.secondAttempt;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ValidatableNumber {

    private int number;

    public boolean isBiggerThan(int otherNumber) {
        return otherNumber > this.number;
    }

    public boolean isSmallerThan(int otherNumber) {
        return otherNumber > this.number;
    }

}
