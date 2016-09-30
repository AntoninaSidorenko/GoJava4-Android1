package task5;

public class Controller {

    API[] apis = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[15];
        int index = 0;
        for (API api : apis) {
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                result[index] = room;
                index++;

            }
        }
        return result;
    }

    Room[] check(API api1, API api2) {

        int prise = 0;
        int persone = 0;
        String city = null;
        String hotel = null;

        int count = 0;

        for (Room room1 : api1.findRooms(prise, persone, city, hotel)) {
            for (Room room2 : api2.findRooms(prise, persone, city, hotel)) {
                if (room1.equals(room2)) {
                    count++;
                }
            }

        }

        Room[] value = new Room[count];
        int i = 0;
        for (Room room1 : api1.findRooms(prise, persone, city, hotel)) {
            for (Room room2 : api2.findRooms(prise, persone, city, hotel)) {
                if (room1.equals(room2)) {
                    value[i] = room1;

                }
            }

        }
        return value;
    }
}
