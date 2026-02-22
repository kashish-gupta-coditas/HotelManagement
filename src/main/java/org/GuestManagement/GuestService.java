package org.GuestManagement;

import java.util.Scanner;

public class GuestService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GuestList guestList = new GuestList();

        while (true) {
            System.out.println("Guest Management : ");
            System.out.println("1. Add Guest");
            System.out.println("2. Display All Guests");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Guest ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Guest Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Contact Number: ");
                    String contact = sc.nextLine();

                    Guest guest = new Guest(id, name, contact);
                    guestList.addGuest(guest);

                    System.out.println("Guest Added Successfully!");
                    break;

                case 2:
                    guestList.displayGuest();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}