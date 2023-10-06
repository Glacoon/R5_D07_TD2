package FacteursPremiers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FacteursPremiers {

    public Set<Integer> generate(int i) {
        Set<Integer> set = new HashSet<>();

        if (i == 1) {
            return set;
        }

        for (int j = 2; j <= i; j++) {
            while (i % j == 0) {
                set.add(j);
                i /= j;
            }
        }
        return set;
    }
}