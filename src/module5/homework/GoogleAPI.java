package module5.homework;

import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(2662L, 200, 2, new Date(), "Dnister", "Ukraine");
//        same from 4 rooms

    }

    @Override
    public Room[] findRooms(int prise, int persons, String city, String hotel) {
        return new Room[0];
    }
}
