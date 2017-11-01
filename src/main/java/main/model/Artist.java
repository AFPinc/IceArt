package main.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date September 2017
 * Háskóli Íslands
 *
 * Klasinn Artist sem heldur utan um gögn um listamenn
 *
 */

@Entity
@Table(name="artist")
public class Artist {

    @Id
    @Column(name="artistId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                 // Auðkenni listamanns sem er notað til að tengja við viðburði hans
    private String name;            // Heiti listamanns
    private String description;     // Lýsing á listamanni
    private int age;                // Aldur listamanns
    private String country;         // Þjóðerni listamanns

    @OneToMany(mappedBy = "artist", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Event> events = new HashSet<Event>();

    public Artist(String name, String description, int age, String country) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.country = country;
    }

    public Artist() {
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
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

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public Set<Event> getEvents() {
        return null;
    }
}