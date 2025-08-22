package com.livyajasmine.assignment4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading ticket booking details
        String[] bookingDetails = sc.nextLine().split(",");
        String stageEvent = bookingDetails[0];
        String customer = bookingDetails[1];
        Integer noOfSeats = Integer.parseInt(bookingDetails[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        booking.printBookingDetails();

        switch (choice) {
            case 1: // Cash payment
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2: // Wallet payment
                double walletAmount = sc.nextDouble();
                sc.nextLine(); // consume newline
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3: // Credit card payment
                String holderName = sc.nextLine();
                double ccAmount = sc.nextDouble();
                sc.nextLine();
                String ccType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, ccAmount, ccType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

