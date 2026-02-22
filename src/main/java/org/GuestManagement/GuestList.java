package org.GuestManagement;

import java.util.ArrayList;

public class GuestList {

    private ArrayList<Guest> guestArrayList = new ArrayList<>();

    // Add Guest
    public void addGuest(Guest g) throws InvalidGuestException {

        if (g.getGuestName() == null || g.getGuestName().trim().isEmpty()) {
            throw new InvalidGuestException("Guest name cannot be empty.");
        }

        if (g.getContactDetails() == null || g.getContactDetails().length() < 10) {
            throw new InvalidGuestException("Invalid contact number.");
        }

        // Duplicate contact check
        for (Guest guest : guestArrayList) {
            if (guest.getContactDetails().equals(g.getContactDetails())) {
                throw new InvalidGuestException("Duplicate contact not allowed.");
            }
        }

        guestArrayList.add(g);
        System.out.println("Guest Added Successfully!");
    }

    // Display Guests
    public void displayGuest() {

        if (guestArrayList.isEmpty()) {
            System.out.println("No Guests Available.");
            return;
        }

        for (Guest guest : guestArrayList) {
            System.out.println(guest);
        }
    }

    // Return Guest object
    public Guest getGuestById(int guestId) throws GuestNotFoundException {

        for (Guest g : guestArrayList) {
            if (g.getGuestId() == guestId) {
                return g;
            }
        }

        throw new GuestNotFoundException("Guest not found with ID: " + guestId);
    }
}