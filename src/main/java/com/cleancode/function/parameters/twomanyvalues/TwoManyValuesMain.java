package com.cleancode.function.parameters.twomanyvalues;

import com.cleancode.function.parameters.twomanyvalues.comparator.Comparator;
import com.cleancode.function.parameters.twomanyvalues.comparator.ComparatorImprovement;
import com.cleancode.function.parameters.twomanyvalues.user.User;
import com.cleancode.function.parameters.twomanyvalues.user.UserImprovement;

import java.util.HashMap;
import java.util.Map;

public class TwoManyValuesMain {

    public static void main(String[] args) {

        User user = new User("Max", 31, "max@test.com");

        Map<String, Object> userData = new HashMap<>();
        userData.put("name", "Max");
        userData.put("age", 31);
        userData.put("email", "max@test.com");
        UserImprovement userImprovement = new UserImprovement(userData);

        Map<String, Object> comparisonData = new HashMap<>();
        comparisonData.put("first", 3);
        comparisonData.put("second", 5);
        comparisonData.put("comparator", "smaller");
        boolean isSmallerCompImprovement = ComparatorImprovement.compare(comparisonData);
        boolean isEqualCompImprovement  = ComparatorImprovement.compare(comparisonData);

        boolean isSmallerComparator = Comparator.compare(3, 5, "smaller");
        boolean isEqualComparator = Comparator.compare(3, 5, "equal");
    }

}
