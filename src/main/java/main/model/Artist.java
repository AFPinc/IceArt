package main.model;

/**
 * @author Melkorka Mjöll
 * @date September 2017
 * Háskóli Íslands
 *
 * Klasinn Artist sem heldur utan um gögn um listamenn
 *
 */


public class Artist {
    private Long id;                 // Auðkenni listamanns sem er notað til að tengja við viðburði hans
    private String name;            // Heiti listamanns
    private String description;     // Lýsing á listamanni
    private int age;                // Aldur listamanns
    private String country;         // Þjóðerni listamanns

    public Artist(Long id, String name, String description, int age, String country) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.age = age;
        this.country = country;
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
}