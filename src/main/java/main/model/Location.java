package main.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhannesdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date September 2017
 * Háskóli Íslands
 *
 * Klasinn Location sem heldur utan um gögn staðanna sem viðburðirnir eru á
 *
 */

@Entity
@Table(name = "location")
public class Location {

    @Id
    @Column(name = "locationId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                    // Auðkenni staðsetningar
    private String name;                // Heiti staðar
    private String description;         // Lýsing staðar
    private String openHours;           // Opnunartími staðar
    private int maxPeople;              // Hámarksfjöldi fólks sem staðurinn tekur

    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Event> events = new HashSet<Event>();

    public Location(String name, String description, String openHours, int maxPeople) {
        this.name = name;
        this.description = description;
        this.openHours = openHours;
        this.maxPeople = maxPeople;
    }

    public Location() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Long getId() {
        return id;
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
