package org.academiadecodigo.asynctomatics.codeyhotel;

public class Hotel {

    // hotel has to have access to the rooms
    private Room room;

    // creating my rooms
    public Hotel() {
        room = new Room(22);
    }

    // methods
    public boolean checkVacancy() {
        if (room.isVacant()) {
            System.out.println("We have a vacant room. Pls proceed to the check-in counter.");
            return true;
        }
        System.out.println("No vacancy");
        return false;
    }

    public void checkIn(String name) {
        System.out.println("Welcome to our hotel, " + name + ". Your room is number " + room.getId() + ".");
        room.setVacancy(false);
    }

    public void checkOut(String name) {
        room.setVacancy(true);
        System.out.println(name + ", I hope you enjoyed your stay. Have a nice day.");
    }
}

