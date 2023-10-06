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

        if (i == 2){
            set.add(2);
            return set;
        }
        return set;
    }
}