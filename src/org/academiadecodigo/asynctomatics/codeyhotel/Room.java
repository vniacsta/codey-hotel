package org.academiadecodigo.asynctomatics.codeyhotel;

public class Room {

    private int id;
    private boolean vacancy;

    public Room(int id) {
        this.id = id;
        this.vacancy = true;
    }

    public int getId() {
        return id;
    }

    public boolean isVacant() {
        return vacancy;
    }

    public void setVacancy(boolean vacancy) {
        this.vacancy = vacancy;
    }
}
