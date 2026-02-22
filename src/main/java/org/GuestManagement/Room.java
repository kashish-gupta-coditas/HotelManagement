package org.GuestManagement;

public class Room {

    private int roomId;
    private String roomType;
    private boolean isAvailable;

    public Room(int roomId, String roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
    }

    public void releaseRoom() {
        isAvailable = true;
    }

    public void display() {
        System.out.println("Room ID: " + roomId +
                " | Type: " + roomType +
                " | Available: " + isAvailable);
    }
}