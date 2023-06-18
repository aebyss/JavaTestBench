public class Hotel {
    private Room[] rooms;

    private Visitor[] visitors;


    public Hotel(int roomCount) {
        rooms = new Room[roomCount];
        initRooms();
    }

    private void initRooms() {
        for(int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 1);
        }
    }

    public boolean canRentRoom() {
        return true;
    }

    public int getRoomCount() {
        return rooms.length;
    }

    public Room getRoom(int roomNumber) {
        if(roomNumber >= 1 && roomNumber <= rooms.length) {
            return rooms[roomNumber - 1];
        } else {
            return null;
        }
    }
}
