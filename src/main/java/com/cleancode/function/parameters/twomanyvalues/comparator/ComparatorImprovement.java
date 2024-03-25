package com.cleancode.function.parameters.twomanyvalues.comparator;

import java.util.Map;

public class ComparatorImprovement {

    public static boolean compare(Map<String, Object> comparisonData) {
        int first = (int) comparisonData.get("first");
        int second = (int) comparisonData.get("second");
        String comparator = (String) comparisonData.get("comparator");
        if (comparator.equals("equal")) {
            return first == second;
        } else if (comparator.equals("not equal")) {
            return first != second;
        } else if (comparator.equals("greater")) {
            return first > second;
        } else if (comparator.equals("smaller")) {
            return first < second;
        }
        return false;
    }
}
