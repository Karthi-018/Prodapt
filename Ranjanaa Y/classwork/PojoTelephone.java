package org.example;

public class PojoTelephone
{
    String name,phno;

    public PojoTelephone(String name, String phno) {
        this.name = name;
        this.phno = phno;
    }

    public String getName() {
        return name;
    }

    public String getPhno() {
        return phno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhno(String phno) {
        this.phno = phno;

    }
    public String toString()
    {
        return name+" "+phno;
    }
}
