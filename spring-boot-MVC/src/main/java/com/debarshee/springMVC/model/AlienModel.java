package com.debarshee.springMVC.model;

public class AlienModel {
    private int alien_id;
    private String alien_name;

    public int getAlien_id() {
        return alien_id;
    }

    public void setAlien_id(int alien_id) {
        this.alien_id = alien_id;
    }

    public String getAlien_name() {
        return alien_name;
    }

    public void setAlien_name(String alien_name) {
        this.alien_name = alien_name;
    }

    @Override
    public String toString() {
        return "AlienModel{" +
                "alien_id=" + alien_id +
                ", alien_name='" + alien_name + '\'' +
                '}';
    }
}
