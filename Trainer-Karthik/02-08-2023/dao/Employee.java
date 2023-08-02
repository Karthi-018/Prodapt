package org.example.dao;

public class Employee {

    private int eid;
    private String eName;
    private String deprt;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDeprt() {
        return deprt;
    }

    public void setDeprt(String deprt) {
        this.deprt = deprt;
    }

    public Employee(int eid, String eName, String deprt) {
        this.eid = eid;
        this.eName = eName;
        this.deprt = deprt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", deprt='" + deprt + '\'' +
                '}';
    }
}
