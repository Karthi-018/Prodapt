package org.example;

class Hotel {
    private int id;
    private String name;
    private String description;
    private String facilities;
    private int rating;
    Hotel(int id, String name, String description, String facilities, int rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.facilities = facilities;
        this.rating = rating;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getFacilities() {
        return facilities;
    }
    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", facilities='" + facilities + '\'' +
                ", rating=" + rating +
                '}';
    }
}