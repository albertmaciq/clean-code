package com.cleancode.intro;

import java.util.function.Predicate;

public class DirtyCode {

    static Predicate<Integer> create(String a, int b) {
        if (a.equals("Max")) {
            return n -> n < b;
        } else if (a.equals("Min")) {
            return n -> n > b;
        }
        return null;
    }

    public static void main(String[] args) {
        Predicate<Integer> max = create("Max", 31);
        System.out.println(max.test(15));
        System.out.println(max.test(32));
    }
}
