package main.model;

/**
 * @author Melkorka Mjöll
 * @date September 2017
 * Háskóli Íslands
 *
 * Klasinn Location sem heldur utan um gögn staðanna sem viðburðirnir eru á
 *
 */

public class Location {
    private String name;                // Heiti staðar
    private String description;         // Lýsing staðar
    private String openHours;           // Opnunartími staðar
    private int maxPeople;              // Hámarksfjöldi fólks sem staðurinn tekur

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
