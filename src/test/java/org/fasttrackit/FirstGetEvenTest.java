package org.fasttrackit;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class FirstGetEvenTest {
    @Test
    public void testGetEvenWithAssert(){
        First first = new First();

        Assertions.assertThatThrownBy(()-> {
            List<Integer> even = first.getEven(null);
            }).isInstanceOf(RuntimeException.class);


    }

    @Test
    public void testGetEvenWithJUnit(){
        First first = new First();

        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, ()->{
            List<Integer> even = first.getEven(null);
        });


    }

    @Test
    public void testGetEvenNotEmpty(){
        First first = new First();

        List<Integer> even = first.getEven(new ArrayList<>());

        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();

    }

    @Test
    public void testGetEvenNoEven(){
        First first = new First();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);

        List<Integer> even = first.getEven(list);

        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).isEmpty();

    }

    @Test
    public void testGetEven(){
        First first = new First();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(6);

        List<Integer> even = first.getEven(list);

        Assertions.assertThat(even).isNotNull();
        Assertions.assertThat(even).hasSize(2);
        Assertions.assertThat(even).containsExactly(2, 6);

    }

}
