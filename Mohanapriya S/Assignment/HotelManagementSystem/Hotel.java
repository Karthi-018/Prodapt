package org.example;

public class Hotel extends Exception
{
    int Id;
    String Name;
    String Description;
    String Facilities;
    double rating;

    public Hotel(int id, String name, String description, String facilities, double rating) {
        Id = id;
        Name = name;
        Description = description;
        Facilities = facilities;
        this.rating = rating;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getFacilities() {
        return Facilities;
    }

    public void setFacilities(String facilities) {
        Facilities = facilities;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Hotel{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", Facilities='" + Facilities + '\'' +
                ", rating=" + rating +
                '}';
    }
}
