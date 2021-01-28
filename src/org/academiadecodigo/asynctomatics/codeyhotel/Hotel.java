package org.academiadecodigo.asynctomatics.codeyhotel;

public class Hotel {

    // hotel has to have access to the rooms
    private Room[] rooms;
    // field to store the index of my objects room
    private int idReservedRoom;

    // creating my Hotel constructor with my array of rooms
    public Hotel() {
        rooms = new Room[3];
        rooms[0] = new Room(20);
        rooms[1] = new Room(26);
        rooms[2] = new Room(15);
    }

    // methods called by class person
    public boolean checkVacancy() {
        // loop to check all the rooms
        for (int i = 0; i < rooms.length; i++) {
            // if any of the rooms in my array is vacant check inside the if statement
            if (rooms[i].isVacant()) {
                // save the index of my vacant room
                idReservedRoom = i;
                System.out.println("We have a vacant room. Pls proceed to the check-in counter.");
                // return true to finish block of code
                return true;
            }
        }
        // if my loop doesn't find a vacant room, it returns false and a print
        System.out.println("No vacancy");
        return false;
    }

    public void checkIn(String name) {
        // save the id of my reserved room and set that room to occupied
        rooms[idReservedRoom].setVacancy(false);
        int roomNumber = rooms[idReservedRoom].getId();
        System.out.println("Welcome to our hotel, " + name + ". Your room is number " + roomNumber +
                ".");
    }

    public void checkOut(String name) {
        // check out that room and set it to available again
        rooms[idReservedRoom].setVacancy(true);
        System.out.println(name + ", I hope you enjoyed your stay. Have a nice day.");
    }
}

