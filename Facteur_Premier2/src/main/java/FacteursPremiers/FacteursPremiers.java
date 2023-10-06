package FacteursPremiers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FacteursPremiers {

    public Set<Integer> generate(int i) {
        Set<Integer> set = new HashSet<>();


        while(i % 2 ==0){
            set.add(2);
            i /= 2;
        }

        while (i % 3 ==0){
            set.add(3);
            i /= 3;
        }

        for (int j = 3; j <= Math.sqrt(i); j+=2){
            while(i % j == 0){
                set.add(j);
                i /= j;
            }
        }

        if (i>2){
            set.add(2);
        }

        return set;
    }
}