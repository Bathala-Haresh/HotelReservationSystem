package hotelreservationsystem;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert;


public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void addHotelDetails_To_HotelReservationSystem() throws HotelReservationException {
        assertTrue(hotelReservation.addHotelDetails());
    }

    @Test
    public void givenHotelName1_FirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = hotelReservation.validateName("Lakewood");
        Assert.assertTrue(result);
    }

    @Test
    public void givenHotelName1_WhenLessThanThreeChar_ShouldReturnFalse() {
        boolean result = hotelReservation.validateName("La");
        Assert.assertFalse(result);
    }

}