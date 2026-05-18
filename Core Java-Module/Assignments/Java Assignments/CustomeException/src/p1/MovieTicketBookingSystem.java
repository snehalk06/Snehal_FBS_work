package p1;
import java.util.Scanner;

// Custom Exception 1
class InvalidTicketNumberException extends Exception {
    public String toString() {
        return "Invalid number of tickets! Please enter tickets greater than 0.";
    }
}

// Custom Exception 2
class TicketsSoldOutException extends Exception {
    public String toString() {
        return "Sorry! Tickets are sold out.";
    }
}

// Movie Booking Class
class MovieBooking {

    static String movieName = "3 Idiots";
    static int ticketPrice = 200;
    static int remainingTickets = 50;

    // Booking Method
    public void bookTickets(int numberOfTickets)
            throws InvalidTicketNumberException,
            TicketsSoldOutException {

        // Check if tickets are sold out
        if (remainingTickets == 0) {
            throw new TicketsSoldOutException();
        }

        // Validate ticket number
        if (numberOfTickets <= 0) {
            throw new InvalidTicketNumberException();
        }

        // Check requested tickets
        if (numberOfTickets > remainingTickets) {
            throw new TicketsSoldOutException();
        }

        // Successful booking
        remainingTickets = remainingTickets - numberOfTickets;

        int totalAmount = numberOfTickets * ticketPrice;

        System.out.println("\nBooking Successful for \"" + movieName + "\"!");
        System.out.println("Tickets booked: " + numberOfTickets);
        System.out.println("Total amount: ₹" + totalAmount);
        System.out.println("Remaining tickets: " + remainingTickets);
    }
}

// Main Class
public class MovieTicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieBooking booking = new MovieBooking();

        while (MovieBooking.remainingTickets > 0) {

            System.out.println("\nRemaining Tickets: "
                    + MovieBooking.remainingTickets);

            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();

            try {
                booking.bookTickets(tickets);
            }

            catch (InvalidTicketNumberException ine) {
                System.out.println(ine);
            }

            catch (TicketsSoldOutException tse) {
                System.out.println(tse);
            }
        }

        System.out.println("\nAll tickets are booked!");

        sc.close();
    }
}