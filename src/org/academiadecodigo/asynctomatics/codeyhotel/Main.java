package org.academiadecodigo.asynctomatics.codeyhotel;

public class Main {

    public static void main(String[] args) {

        // create a hotel
        Hotel codeyHotel = new Hotel();

        // create a person to visit the hotel
        Person person = new Person("Kristen Bell");

        // give the person class, access to the hotel
        person.setCodeyHotel(codeyHotel);

        // interactions with the person and the hotel
        person.requestRooms();
    }
}
