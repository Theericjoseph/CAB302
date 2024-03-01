package models;

import java.util.Arrays;

public class Student extends Person{
//    class student inherits the attributes and methods of class Person
//    The student class can have its own attributes
    private String[] courses;
//    To inherit constructor it is necessary to define a constructor and use super keyword
//    to call the superclass constructor
    public Student(String name, String[] courses)
    {
        super(name);
        for(String course: courses)
        {
            addCourse(course);
        }
    }

//    If default constructor is needed it needs to be redeclared
    public Student()
    {
        super();
    }

//    The student class can override method and
//    call superclass method using the super keyword
    @Override
    public String getName()
    {
        return "Student : " + super.getName();
    }

//    The student class can also add new methods
    public String[] getCourses()
    {
        return courses;
    }

    public void addCourse(String course)
    {
//        Add course to the course array
//        with validation

    }
}
