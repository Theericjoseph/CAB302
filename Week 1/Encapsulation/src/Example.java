import models.*;


import java.util.Arrays;

public class Example {
    public static void main(String[] args){
//      Create an empty person class and use setter method to set name
        Person person = new Person();
        person.setName("John Doe");
        System.out.println(person.getName());

//      Equivalently using the constructor method
        Person person1 = new Person("John Doe1");
        System.out.println(person1.getName());
    }
}
