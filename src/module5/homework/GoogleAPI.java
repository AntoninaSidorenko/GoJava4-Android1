package module5.homework;

import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(16, 250, 2, new Date(), "Dnister", "Ukraine");
        rooms[1] = new Room(17, 100, 2, new Date(),"A", "A");
        rooms[2] = new Room(18, 150, 2, new Date(),"D", "S");
        rooms[3] = new Room(19, 2050, 2,new Date(), "B", "D");
        rooms[4] = new Room(20, 1200, 2,new Date(), "H", "f");


    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }

    @Override
    public Room[] findRooms(int prise, int persons, String city, String hotel) {
        int r = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrise() == prise && rooms[i].getPerson() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel){
                r++;
            }

        }
        return new Room[0];
    }
}
