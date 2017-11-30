package com.example.awesomefat.csc250_hw14_template;

/**
 * Created by awesomefat on 11/30/17.
 */

public class Patient extends Person
{
    private double balance;

    public Patient(String firstName, String lastName, int age, String gender, double balance)
    {
        super(firstName, lastName, age, gender); //MUST be the first line in this constructor
        this.balance = balance;
    }

    public String toString()
    {
        return String.format("%s Balance: %f", super.toString(), this.balance);
    }
}
