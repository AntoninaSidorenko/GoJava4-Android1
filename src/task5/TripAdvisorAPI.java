package task5;

import java.util.Date;

public class TripAdvisorAPI implements API {

    Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(3, 300, 4, new Date(), "D", "D");
        rooms[1] = new Room(3, 300, 4, new Date(), "D", "D");
        rooms[2] = new Room(3, 300, 4, new Date(), "D", "D");
        rooms[3] = new Room(3, 300, 4, new Date(), "D", "D");
        rooms[4] = new Room(3, 300, 4, new Date(), "D", "D");
    }

    @Override
    public Room[] findRooms(int prise, int persons, String city, String hotel) {
        Room[] foundRoom = new Room[5];
        Room room = new Room(0, 0, 0, new Date(), null, null);
        int index = 0;
        for (Room arrRoom : rooms) {
            if (arrRoom.equals(room)) {
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
