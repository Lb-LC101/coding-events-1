package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventCategory {
    //An id field of type int.
    @Id
    @GeneratedValue
    private int id;
    //A name field of type String.
    private String name;
    //A constructor.
    public EventCategory (String name) {
        this.name = name;
    }

    public EventCategory(){}
    //The appropriate getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
