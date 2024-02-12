package org.example;

import java.util.List;

public class User {
    private String name;
    private String surname;
    private int wealth;
    private List<String> cars;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter for surname
    public String getSurname() {
        return surname;
    }

    // Setter for wealth
    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    // Getter for wealth
    public int getWealth() {
        return wealth;
    }

    // Setter for cars
    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    // Getter for cars
    public List<String> getCars() {
        return cars;
    }
}
}
