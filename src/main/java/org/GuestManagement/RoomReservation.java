package org.GuestManagement;

import java.time.LocalDate;
import java.time.LocalTime;

public class RoomReservation extends Reservation {

    private int roomId;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;

    public RoomReservation(int reservationId,
                           int guestId,
                           LocalDate date,
                           int roomId,
                           LocalTime checkInTime,
                           LocalTime checkOutTime) {

        super(reservationId, guestId, date);
        this.roomId = roomId;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public int getRoomId() {
        return roomId;
    }

    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }

    @Override
    public void display() {
        System.out.println("Room Reservation | ID: " + getReservationId() +
                " | Guest ID: " + getGuestId() +
                " | Room ID: " + roomId +
                " | Date: " + getReservationDate() +
                " | Check-In: " + checkInTime +
                " | Check-Out: " + checkOutTime);
    }
}