package org.example.hotel;
public class Hotel {
    int hotId;
    String hotName;
    String hotDescrip;
    String hotFaci;
    double hotrating;


    public Hotel(int hotId, String hotName, String hotDescrip, String hotFaci, double hotrating) {
        this.hotId = hotId;
        this.hotName = hotName;
        this.hotDescrip = hotDescrip;
        this.hotFaci = hotFaci;
        this.hotrating = hotrating;
    }

    public int getHotId() {
        return hotId;
    }

    public void setHotId(int hotId) {
        this.hotId = hotId;
    }

    public String getHotName() {
        return hotName;
    }

    public void setHotName(String hotName) {
        this.hotName = hotName;
    }

    public String getHotDescrip() {
        return hotDescrip;
    }

    public void setHotDescrip(String hotDescrip) {
        this.hotDescrip = hotDescrip;
    }

    public String getHotFaci() {
        return hotFaci;
    }

    public void setHotFaci(String hotFaci) {
        this.hotFaci = hotFaci;
    }

    public double getHotrating() {
        return hotrating;
    }

    public void setHotrating(double hotrating) {
        this.hotrating = hotrating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotId=" + hotId +
                ", hotName='" + hotName + '\'' +
                ", hotDescrip='" + hotDescrip + '\'' +
                ", hotFaci='" + hotFaci + '\'' +
                ", hotrating=" + hotrating +
                '}';
    }
}
