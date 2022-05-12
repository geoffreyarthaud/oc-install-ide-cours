package com.openclassrooms.ideinstall;
import  org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void createNewUser(){
        Person person = new Person();
        person.setName("Daniel");
        person.setAge(34);
        System.out.println("nom: "+ person.getName()+" age: "+person.getAge());

    }


}