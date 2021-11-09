package com.example.bmiexample.model;

public class Person {
    private String Email;
    private String Pass;



    public Person() {
        this.Email = "jamal_zayyad";
        this.Pass = "058585256";
    }
    public Person(String email, String pass) {
        this.Email = email;
        this.Pass = pass;
}

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }


    @Override
    public String toString() {
        return "Car{" +
                "Email='" + getEmail() + '\'' +
                ", pass='" + getPass() + '\'' +
                '}';
    }
}
