package main.model;

//Pakkinn Location geymir

/*
    Höfundar

    Melkorka Mjöll Jóhannesdóttir - mmj8@hi.is

 */

public class Location {
    private String name;
    private String description;
    private String openHours;
    private int maxPeople;

    public Location(String name, String description, String openHours, int maxPeople) {
        this.name = name;
        this.description = description;
        this.openHours = openHours;
        this.maxPeople = maxPeople;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOpenHours() {
        return openHours;
    }

    public int getMaxPeople() {
        return maxPeople;
    }
}
