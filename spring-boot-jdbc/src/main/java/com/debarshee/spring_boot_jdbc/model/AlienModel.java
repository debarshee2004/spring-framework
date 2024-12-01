package com.debarshee.spring_boot_jdbc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Represents a model class for an Alien entity in a Spring application.
 * This class is annotated as a Spring Component with prototype scope,
 * meaning a new instance will be created each time it is requested.
 */
@Component
@Scope("prototype")
public class AlienModel {

    // Unique identifier for the Alien
    private int id;

    // Name of the Alien
    private String name;

    // Technology associated with the Alien
    private String tech;

    /**
     * Gets the unique identifier of the Alien.
     *
     * @return the id of the Alien.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the Alien.
     *
     * @param id the id to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the Alien.
     *
     * @return the name of the Alien.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Alien.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the technology associated with the Alien.
     *
     * @return the technology of the Alien.
     */
    public String getTech() {
        return tech;
    }

    /**
     * Sets the technology associated with the Alien.
     *
     * @param tech the technology to set.
     */
    public void setTech(String tech) {
        this.tech = tech;
    }

    /**
     * Provides a string representation of the Alien object.
     *
     * @return a string containing the Alien's details.
     */
    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
