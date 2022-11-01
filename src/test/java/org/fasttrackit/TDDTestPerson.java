package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDDTestPerson {

    @Test
    public void testPerson(){
        //GIVEN
        Person person = new Person(100, "Pop", 0);
        //WHEN
        int result = person.getAge();
        //THEN
        Assertions.assertThat(result).isEqualTo(0);
    }
    @Test
    public void testNegativeAge(){
        //GIVEN
        Person person = new Person(100, "Pop", -3);
        //WHEN
        int result = person.getAge();
        //THEN
        Assertions.assertThat(result).isEqualTo(0);
    }
    @Test
    public void testNullName(){
        //GIVEN
        Person person = new Person(100, null, 3);
        //WHEN
        String result = person.getName();
        //THEN
        Assertions.assertThat(result).isNull();
    }

    @Test
    public void testEmptyName(){
        //GIVEN
        Person person = new Person(100, "", 3);
        //WHEN
        String result = person.getName();
        //THEN
        Assertions.assertThat(result).isEmpty();
    }

    @Test
    public void testInvalidName(){
        //GIVEN
        Person person = new Person(100, "4Pop4", 3);
        //WHEN
        String result = person.getName();
        //THEN
        Assertions.assertThat(result).isEqualTo("Name is not valid");
    }
}
