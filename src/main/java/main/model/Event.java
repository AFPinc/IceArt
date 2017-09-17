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
    private Date timeBegin;         // Dagsetning og tími sem viðburður byrjar
    private Date timeEnd;           // Dagsetning og tími sem viðburður endar
    private String description;     // Lýsing á viðburðinum
    private boolean deleted;        // Viðburði er eytt eða er til

    public Event(String title, String location, Date timeBegin, Date timeEnd, String description, int id, boolean deleted) {
        this.title = title;
        this.location = location;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.description = description;
        this.id = id;
        this.deleted = deleted;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public Date getTimeBegin() {
        return timeBegin;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean getDeleted() {
        return deleted;
    }
}
