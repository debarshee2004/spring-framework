package com.debarshee.spring_boot_mvc.model;

import jakarta.persistence.*;

/**
 * Represents a model class for an Alien entity in a Spring MVC application.
 * This class contains properties for an Alien's ID and name,
 * along with getter and setter methods for accessing and modifying these properties.
 */
@Entity
@Table(name = "alien")
public class AlienModel {

    // Unique identifier for the Alien
    @Id
    private int alien_id;

    // Name of the Alien
    private String alien_name;

    /**
     * Creates an empty controller of the Alien.
     */
    public AlienModel() {}

    /**
     * Gets the unique identifier of the Alien.
     *
     * @param alien_id the alien_id of the Alien.
     * @param alien_name the alien_name of the Alien.
     */
    public AlienModel(int alien_id, String alien_name) {
        this.alien_id = alien_id;
        this.alien_name = alien_name;
    }

    /**
     * Gets the unique identifier of the Alien.
     *
     * @return the alien_id of the Alien.
     */
    public int getAlien_id() {
        return alien_id;
    }

    /**
     * Sets the unique identifier of the Alien.
     *
     * @param alien_id the ID to set for the Alien.
     */
    public void setAlien_id(int alien_id) {
        this.alien_id = alien_id;
    }

    /**
     * Gets the name of the Alien.
     *
     * @return the alien_name of the Alien.
     */
    public String getAlien_name() {
        return alien_name;
    }

    /**
     * Sets the name of the Alien.
     *
     * @param alien_name the name to set for the Alien.
     */
    public void setAlien_name(String alien_name) {
        this.alien_name = alien_name;
    }

    /**
     * Provides a string representation of the AlienModel object.
     *
     * @return a string containing the Alien's ID and name.
     */
    @Override
    public String toString() {
        return "AlienModel{" +
                "alien_id=" + alien_id +
                ", alien_name='" + alien_name + '\'' +
                '}';
    }
}
