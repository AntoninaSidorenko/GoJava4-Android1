package task5;

import java.util.Date;

public class GoogleAPI implements API{
    Room [] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(2, 200, 3, new Date(), "B", "B");
        rooms[1] = new Room(2, 200, 3, new Date(), "B", "B");
        rooms[2] = new Room(2, 200, 3, new Date(), "B", "B");
        rooms[3] = new Room(2, 200, 3, new Date(), "B", "B");
        rooms[4] = new Room(2, 200, 3, new Date(), "B", "B");
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
