package FacteursPremiers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FacteursPremiersTest {

    FacteursPremiers facteursPremiers = new FacteursPremiers();

    @Test
    public void test1_return_test_vide() {

        //When
        Set<Integer> set = facteursPremiers.generate(1);

        //Then
        assertEquals(set, Set.of());
    }

    @Test
    public void test2_return_2() {

        //When
        Set<Integer> set = facteursPremiers.generate(2);

        //Then
        assertEquals(set, Set.of(2));
    }

    @Test
    public void test3_return_3(){

        //When
        Set<Integer> set = facteursPremiers.generate(3);

        //Then
        assertEquals(set, Set.of(3));
    }

    @Test
    public void test6_return_23(){

        //When
        Set<Integer> set = facteursPremiers.generate(6);

        //Then
        assertEquals(set, Set.of(2,3));
    }

}