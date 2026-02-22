package org.GuestManagement;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReservationList {

    ArrayList<Reservation> reservationArrayList = new ArrayList<>();

    GuestList guestList;
    RoomList roomList;

    public ReservationList(GuestList guestList, RoomList roomList) {
        this.guestList = guestList;
        this.roomList = roomList;
    }

    void addReservation(Reservation r) {

        try {

            if (r.getReservationDate().isBefore(LocalDate.now())) {
                throw new InvalidReservationException("Reservation date cannot be in past.");
            }

            boolean guestExists = false;

            for (Guest g : guestList.gu) {
                if (g.getGuestId() == r.getGuestId()) {
                    guestExists = true;
                    break;
                }
            }

            if (!guestExists) {
                throw new GuestNotFoundException("Guest not found.");
            }

            // Room specific validation
            if (r instanceof RoomReservation) {

                RoomReservation rr = (RoomReservation) r;

                if (rr.getCheckOutTime().isBefore(rr.getCheckInTime())) {
                    throw new InvalidReservationException("Check-out cannot be before check-in.");
                }

                Room room = roomList.getRoomById(rr.getRoomId());

                if (!room.isAvailable()) {
                    throw new InvalidReservationException("Room already booked.");
                }

                room.bookRoom();   // 🔥 Availability update
            }

            reservationArrayList.add(r);
            System.out.println("Reservation Added Successfully!");

        } catch (InvalidReservationException |
                 GuestNotFoundException |
                 RoomNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    void displayReservations() {

        if (reservationArrayList.isEmpty()) {
            System.out.println("No Reservations Available.");
            return;
        }

        for (Reservation r : reservationArrayList) {
            r.display();
        }
    }
}