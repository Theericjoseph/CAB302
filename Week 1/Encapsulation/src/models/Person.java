package models;

public class Person {
//    Name is a private attribute so it cant be accessed by other classes
    private String name;

//  Default constructor method for person class
    public Person() {
    }
//  Overloaded constructor method for person class
    public Person(String name){
        setName(name);
    }
//  Getter method for the name attribute
    public String getName() {
        return name;
    }
//  Setter method for name attribute
//  with validation to ensure name is not empty
    public void setName(String name){
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

}
