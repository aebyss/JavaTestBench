public class Room {

    private int roomNumber;
    private boolean isOccupied;

    private Visitor visitor;
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public boolean isOccupied() {
        return isOccupied;
    }

    public void enter() {
        isOccupied = true;
    }

    public void exit() {
        isOccupied = false;
    }
}
