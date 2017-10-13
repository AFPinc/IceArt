package main.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Melkorka Mjöll
 * @date September 2017
 * Háskóli Íslands
 *
 * Klasinn Category heldur utan um flokka sem viðburðir flokkast í
 *
 */

// Búum til töflu í gagnagrunninum sem heitir Category
@Entity
@Table(name="category")
public class Category {

    // Skilgreinum vensl í töflunni Category
    @Id
    @Column(name = "categoryId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                    // Auðkenni hvers flokks
    private String title;               // Titill flokks

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Event> events = new HashSet<Event>();

    public Category(String title) {
        this.title = title;
    }

    public Category() {}

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
