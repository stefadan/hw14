package org.fasttrackit;

import java.util.List;

public class TDD {

    public Integer find(List<Integer> list, Integer number){
        if (list == null){
            return -1;
        }
        return list.indexOf(number);
    }
}
