package org.GuestManagement;

import java.util.ArrayList;

public class GuestList {

    ArrayList<Guest> guestArrayList = new ArrayList<Guest>();

    void addGuest(Guest g){
        guestArrayList.add(g);
    }

    void displayGuest(Guest g){
        for(int i=0;i<guestArrayList.size();i++) {
            System.out.println(guestArrayList.get(i));
        }
    }


}
