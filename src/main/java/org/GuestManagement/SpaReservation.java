package org.GuestManagement;

import java.time.LocalDate;
import java.time.LocalTime;

public class SpaReservation extends Reservation {

    private LocalTime sessionTime;
    private int durationMinutes;

    public SpaReservation(int reservationId,
                          int guestId,
                          LocalDate date,
                          LocalTime sessionTime,
                          int durationMinutes) {

        super(reservationId, guestId, date);
        this.sessionTime = sessionTime;
        this.durationMinutes = durationMinutes;
    }

    public LocalTime getSessionTime() {
        return sessionTime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public void display() {
        System.out.println("Spa Reservation | ID: " + getReservationId() +
                " | Guest ID: " + getGuestId() +
                " | Date: " + getReservationDate() +
                " | Session Time: " + sessionTime +
                " | Duration: " + durationMinutes + " minutes");
    }
}