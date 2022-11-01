package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TDDTestPersonService {

    @Test
    public void testAddPerson(){
        //GIVEN
        PersonService ps = new PersonService(new ArrayList<>());
        //WHEN
        int id = ps.addPerson(new Person("A", 10)).getId();
        System.out.println("id="+id);
        //THEN
        Assertions.assertThat(id).isNotNull();
        Assertions.assertThat(ps.personList.isEmpty());
    }

    @Test
    public void testGetAllPerson(){

        PersonService ps = new PersonService(new ArrayList<>());
        //WHEN
        Person p0 = ps.addPerson(new Person("B", 10));
        Person p1 = ps.addPerson(new Person("C", 20));
        List<Person> list = ps.getAllPersons();

        Assertions.assertThat(list).isNotEmpty();
        Assertions.assertThat(list).isNotNull();


    }

}
