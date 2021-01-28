package org.academiadecodigo.asynctomatics.codeyhotel;

public class Room {

    // fields of my class Room
    private int id;
    private boolean vacancy;

    // constructor for my room
    public Room(int id) {
        this.id = id;
        this.vacancy = true;
    }

    // getter for field id
    public int getId() {
        return id;
    }

    // getter for field vacancy
    public boolean isVacant() {
        return vacancy;
    }

    // setter for field vacancy
    public void setVacancy(boolean vacancy) {
        this.vacancy = vacancy;
    }
}
