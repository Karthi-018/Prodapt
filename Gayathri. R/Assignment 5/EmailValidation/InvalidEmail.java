package org.example;

public class InvalidEmail extends Exception{
    public InvalidEmail()
    {
        System.out.println("invalid email. Email should contains @ ");
    }

}
