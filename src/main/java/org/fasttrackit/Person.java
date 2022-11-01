package org.fasttrackit;

public class Person {
    int id;
    String name;
    int age;

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        if (name == null){
            return null;
        }
        if (name.equals("")){
            return "";
        }
        if (!name.matches("^[a-zA-Z]*$")){
            return new String("Name is not valid");
        }
        return name;
    }

    public int getAge() {
        if (age < 0) {
            return 0;
        }
        return age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
