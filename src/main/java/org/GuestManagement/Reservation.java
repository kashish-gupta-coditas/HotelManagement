package org.GuestManagement;

import java.time.LocalDate;

public abstract class Reservation {

    private int reservationId;
    private int guestId;
    private LocalDate reservationDate;

    public Reservation(int reservationId, int guestId, LocalDate reservationDate) {
        this.reservationId = reservationId;
        this.guestId = guestId;
        this.reservationDate = reservationDate;
    }

    public int getReservationId() {
        return reservationId;
    }

    public int getGuestId() {
        return guestId;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public abstract void display();
}