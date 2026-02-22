package org.GuestManagement;

public class Guest {
    private int guestId;
    private String guestName;
    private String contactDetails;

    public Guest(int guestId, String guestName, String contactDetails) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.contactDetails = contactDetails;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", guestName='" + guestName + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                '}';
    }
}
