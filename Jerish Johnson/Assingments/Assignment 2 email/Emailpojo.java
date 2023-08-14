package org.example;

public class Emailpojo {
    private  String email;

    public Emailpojo(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email id : "+email;
    }
}
