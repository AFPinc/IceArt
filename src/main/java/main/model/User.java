package main.model;

import javax.persistence.*;

/**
 * @author Melkorka Mjöll
 * @date September 2017
 * Háskóli Íslands
 *
 * Klasinn User sem heldur utan um gögn notanda
 *
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                // Auðkenni notanda
    private String name;            // Nafn notanda
    private String username;        // Notandanafn notanda
    private String password;        // Lykilorð notanda

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    public User(){}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
