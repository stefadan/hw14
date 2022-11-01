package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    List<Person> personList;

    public PersonService(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public Person addPerson(Person person){
        int id = person.setId(100);
        Person result = new Person(id, person.getName(), person.getAge());
        personList.add(result);
        return result;
    }

    public List<Person> getAllPersons(){
        List<Person> result =  new ArrayList<>();

        for(Person person: personList){
            result.add(person);
        }
        return result;
    }


}
