package org.GuestManagement;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventHallReservation extends Reservation {

    private LocalTime eventStartTime;
    private LocalTime eventEndTime;

    public EventHallReservation(int reservationId,
                                int guestId,
                                LocalDate date,
                                LocalTime eventStartTime,
                                LocalTime eventEndTime) {

        super(reservationId, guestId, date);
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
    }

    public LocalTime getEventStartTime() {
        return eventStartTime;
    }

    public LocalTime getEventEndTime() {
        return eventEndTime;
    }

    @Override
    public void display() {
        System.out.println("Event Hall Reservation | ID: " + getReservationId() +
                " | Guest ID: " + getGuestId() +
                " | Date: " + getReservationDate() +
                " | Start: " + eventStartTime +
                " | End: " + eventEndTime);
    }
}