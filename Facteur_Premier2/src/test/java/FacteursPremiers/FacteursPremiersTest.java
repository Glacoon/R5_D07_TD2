package FacteursPremiers;

import org.junit.jupiter.api.Test;

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
}