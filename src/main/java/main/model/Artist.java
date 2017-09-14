package main.model;

//Pakkinn Artist geymir

/*
    Höfundar

    Melkorka Mjöll Jóhannesdóttir - mmj8@hi.is

 */

public class Artist {
    private int id;
    private String name;
    private String description;
    private int age;
    private String country;

    public Artist(int id, String name, String description, int age, String country) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.age = age;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}