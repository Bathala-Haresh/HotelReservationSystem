
package hotelreservationsystem;

public class HotelReservationMain {
    public static void main(String args[]) {
        System.out.println("Welcome to Hotel Reservation System");
        HotelReservation obj = new HotelReservation();
        System.out.println("List of Hotels and their prices are shown here :");
        obj.addHotelDetails();
        obj.displayHotels();

    }
}
