package com.example.awesomefat.csc250_hw14_template;

/**
 * Created by awesomefat on 11/30/17.
 */

public class Person
{
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String gender;

    public Person(String firstName, String lastName, int age, String gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    //overload our inherited toString method
    public String toString()
    {
        //return this.firstName + " " + this.lastName + " age: " + this.age + " gender: " + this.gender;
        return String.format("%s %s age: %d gender: %s", this.firstName, this.lastName, this.age, this.gender);
    }
}
