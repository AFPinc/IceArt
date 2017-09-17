package main.model;

import java.util.Date;

/**
 * @author Melkorka Mjöll
 * @date September 2017
 * Háskóli Íslands
 *
 * Klasinn Event sem heldur utan um gögn um viðburði
 *
 */


public class Event {
    private int id;                 // Auðkenni hvers viðburðar
    private String title;           // Titill á viðburði
    private String location;        // Staðsetning viðburðar
    private String artist;          // Listamaður viðburðar
    private String timeBegin;         // Dagsetning og tími sem viðburður byrjar
    private String timeEnd;           // Dagsetning og tími sem viðburður endar
    private String description;     // Lýsing á viðburðinum
    private boolean deleted;        // Segir til um hvort að búið sé að eyða viðburði eða ekki

    public Event(int id, String title, String location, String artist, String timeBegin, String timeEnd, String description, boolean deleted) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.artist = artist;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.description = description;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getArtist() {
        return artist;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public String getDescription() {
        return description;
    }

    public boolean getDeleted() {
        return deleted;
    }
}
