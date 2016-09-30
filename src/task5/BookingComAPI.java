package task5;

import java.util.Date;

public class BookingComAPI implements API {

    Room[] rooms = new Room[5];



    public BookingComAPI() {
        rooms[0] = new Room(1, 100, 2, new Date(), "A", "B");
        rooms[1] = new Room(1, 100, 2, new Date(), "A", "B");
        rooms[2] = new Room(1, 100, 2, new Date(), "A", "B");
        rooms[3] = new Room(1, 100, 2, new Date(), "A", "B");
        rooms[4] = new Room(1, 100, 2, new Date(), "A", "B");

    }



    @Override
    public Room[] findRooms(int prise, int persons, String city, String hotel) {
        Room [] foundRoom = new Room[5];
        Room room = new Room(0, 0, 0, new Date(), null, null);
        int index = 0;
        for(Room arrRoom: rooms){
            if(arrRoom.equals(room)){
                foundRoom[index] = arrRoom;
                index++;

            }
        }

        return foundRoom;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
