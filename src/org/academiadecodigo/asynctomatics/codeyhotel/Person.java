package org.academiadecodigo.asynctomatics.codeyhotel;

public class Person {

    // person properties
    private String name;
    // person has to have access to the hotel
    private Hotel codeyHotel;

    // constructor for my person
    public Person(String name) {
        this.name = name;
    }

    // methods asked by person to be transmitted to the hotel
    public void requestRooms() {
        // ask the hotel if there's an available room
        if (codeyHotel.checkVacancy()) {
            codeyHotel.checkIn(name);
            codeyHotel.checkOut(name);
        }
    }

    // setter to give access to the hotel
    public void setCodeyHotel(Hotel codeyHotel) {
        this.codeyHotel = codeyHotel;
    }
}
