package org.GuestManagement;

import java.util.ArrayList;

public class RoomList {

    ArrayList<Room> roomArrayList = new ArrayList<>();

    public void addRoom(Room room) {
        roomArrayList.add(room);
    }

    public Room getRoomById(int roomId) throws RoomNotFoundException {

        for (Room r : roomArrayList) {
            if (r.getRoomId() == roomId) {
                return r;
            }
        }

        throw new RoomNotFoundException("Room not found with ID: " + roomId);
    }

    public void displayRooms() {

        if (roomArrayList.isEmpty()) {
            System.out.println("No Rooms Available.");
            return;
        }

        for (Room r : roomArrayList) {
            r.display();
        }
    }
}