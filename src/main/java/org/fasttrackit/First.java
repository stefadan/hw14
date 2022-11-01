package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class First {

    public int sum(int a, int b){
        return a+b;
    }

    public List<Integer> getEven(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        if (list == null){
            throw new RuntimeException(); //return result;
        }
        for (Integer integer: list){
            if (integer%2 == 0) {
                result.add(integer);
            }

        }
        return result;

    }

}
