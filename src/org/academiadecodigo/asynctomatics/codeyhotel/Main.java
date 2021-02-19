package org.academiadecodigo.asynctomatics.codeyhotel;

public class Main {

    public static void main(String[] args) {

        // create a hotel
        Hotel codeyHotel = new Hotel();

        // create a person to visit the hotel
        Person person1 = new Person("Kristen Bell");
        Person person2 = new Person("Jameela Jamil");
        Person person3 = new Person("D'Arcy Carden");
        Person person4 = new Person("Maya Rudolph");

        // give the person class, access to the hotel
        person1.setCodeyHotel(codeyHotel);
        person2.setCodeyHotel(codeyHotel);
        person3.setCodeyHotel(codeyHotel);
        person4.setCodeyHotel(codeyHotel);

        // interactions with the person and the hotel
        person1.requestRooms();
        person2.requestRooms();
        person3.requestRooms();
        person4.requestRooms();
        person1.requestCheckOut();
        person2.requestCheckOut();
        person3.requestCheckOut();
        person4.requestCheckOut();
    }
}
