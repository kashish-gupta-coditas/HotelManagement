package org.GuestManagement;

public class Guest {

    private static int counter = 1;   // Auto ID generation

    private int guestId;
    private String guestName;
    private String contactDetails;

    public Guest(String guestName, String contactDetails) {

        if (guestName == null || guestName.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest name cannot be empty");
        }

        if (contactDetails == null || contactDetails.trim().isEmpty()) {
            throw new IllegalArgumentException("Contact details cannot be empty");
        }

        this.guestId = counter++;   // Auto increment
        this.guestName = guestName;
        this.contactDetails = contactDetails;
    }

    public int getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    @Override
    public String toString() {
        return "Guest ID: " + guestId +
                ", Name: " + guestName +
                ", Contact: " + contactDetails;
    }
}