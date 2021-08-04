package hotelreservationsystem;

public class HotelReservationException extends Exception {
    static String message;

    enum ExceptionType {

        HOTELDETAILS_INVALID
    }

    ExceptionType type;

    public HotelReservationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

