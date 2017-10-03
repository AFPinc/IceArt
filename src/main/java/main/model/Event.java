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

@Entity
@Table(name="event")
public class Event {

    @Id
    @Column(name = "eventId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                 // Auðkenni hvers viðburðar
    private String title;           // Titill á viðburði

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "locationId")
    private Location location;        // Staðsetning viðburðar

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "artistId")
    private Artist artist;          // Listamaður viðburðar
    private String timeBegin;         // Dagsetning og tími sem viðburður byrjar
    private String timeEnd;           // Dagsetning og tími sem viðburður endar
    private String description;     // Lýsing á viðburðinum
    private boolean deleted;        // Segir til um hvort að búið sé að eyða viðburði eða ekki

    public Event(String title, Location location, Artist artist, String timeBegin, String timeEnd, String description, boolean deleted) {
        this.title = title;
        this.location = location;
        this.artist = artist;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.description = description;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Location getLocation() {
        return location;
    }

    public Artist getArtist() {
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
