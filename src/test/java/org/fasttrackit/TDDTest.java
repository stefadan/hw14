package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TDDTest {
    @Test
    public void instatntiateClas(){
        TDD tdd = new TDD();

    }

    @Test
    public void callMethos(){
        TDD tdd = new TDD();
        tdd.find(new ArrayList<>(), 2);
    }

    @Test
    public Integer returnMethodAnInteger(){
        TDD tdd = new TDD();
        Integer result = tdd.find(new ArrayList<>(), 2);
        return result;
    }

    @Test
    public void returnMinusOneIfNegative(){
    //GIVEN
        TDD tdd = new TDD();
    List<Integer> list = null; //new ArrayList<>();
    Integer number = 2;
    //GIVEN
    Integer result = tdd.find(list, number);

    //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void returnMinusOneIfNumberNegative(){
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> list = Arrays.asList(1, 2, 4); //new ArrayList<>();
        Integer number = null;
        //WHEN
        Integer result = tdd.find(list, number);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

}
