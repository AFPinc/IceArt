package main.model;

import javax.persistence.*;

/**
 * @author Melkorka Mjöll
 * @date September 2017
 * Háskóli Íslands
 *
 * Klasinn Event sem heldur utan um gögn um viðburði
 *
 */

// Búum til töflu í gagnagrunninum sem heitir Event
@Entity
@Table(name="event")
public class Event {

    // Skilgreinum vensl í töflunni Event
    @Id
    @Column(name = "eventId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                    // Auðkenni hvers viðburðar
    private String title;               // Titill á viðburði

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "locationId")
    private Location location;          // Staðsetning viðburðar

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "artistId")
    private Artist artist;              // Listamaður viðburðar

    private String dateBegin;           // Dagsetning sem viðburður byrjar
    private String timeBegin;           // Tími sem viðburður byrjar
    private String dateEnd;             // Dagsetning sem viðburður endar
    private String timeEnd;             // Tími sem viðburður endar

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "categoryId")
    private Category category;

    private String description;         // Lýsing á viðburðinum
    private boolean deleted;            // Segir til um hvort að búið sé að eyða viðburði eða ekki

    public Event(String title, Location location, Artist artist, String dateBegin, String timeBegin, String dateEnd, String timeEnd, Category category, String description, boolean deleted) {
        this.title = title;
        this.location = location;
        this.artist = artist;
        this.dateBegin = dateBegin;
        this.timeBegin = timeBegin;
        this.dateEnd = dateEnd;
        this.timeEnd = timeEnd;
        this.category = category;
        this.description = description;
        this.deleted = deleted;
    }

    public Event() {}

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location.getName();
    }

    public String getArtist() {
        return artist.getName();
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public String getCategory() {
        return category.getTitle();
    }

    public String getDescription() {
        return description;
    }

    public boolean getDeleted() {
        return deleted;
    }

    @Override
    public String toString() {
        return String.format("<BR>" + "title: "+title + "<BR>"
                +"artist: "+artist.getName());
        }
}
