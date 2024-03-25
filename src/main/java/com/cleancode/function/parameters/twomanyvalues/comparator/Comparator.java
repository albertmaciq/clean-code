package com.cleancode.function.parameters.twomanyvalues.comparator;

import java.util.Map;

public class Comparator {

    public static boolean compare(int a, int b, String comparator) {
        if (comparator.equals("equal")) {
            return a == b;
        } else if (comparator.equals("not equal")) {
            return a != b;
        } else if (comparator.equals("greater")) {
            return a > b;
        } else if (comparator.equals("smaller")) {
            return a < b;
        }
        return false;
    }
}
