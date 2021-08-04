/****************************************************************
 * Purpose : To add hotels in hotel reservation system and to display all the hotel details.
 * @author Bathala Haresh
 ***************************************************************/
package hotelreservationsystem;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelReservation {
    ArrayList<Hotels> hotelsList = new ArrayList<>();

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,20}";

    public boolean validateName(String hotelName) {
        return patternChecker(hotelName, NAME_PATTERN);
    }

    private boolean patternChecker(String input, String fieldPattern) {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }

    /**
     * This method is used to add Hotels with hotel names and with their respective prices.
     *
     * @return boolean value.
     */
    public boolean addHotelDetails() {
        Hotels hotels = new Hotels();

        hotels.setHotelName("Lakewood");
        hotels.setWeekDay(110);
        hotels.setWeekEnd(90);
        //adding hotel to hotelList
        hotelsList.add(hotels);
        hotels = new Hotels();

        hotels.setHotelName("BridgeWood");
        hotels.setWeekDay(160);
        hotels.setWeekEnd(60);
        //adding hotel to hotelList
        hotelsList.add(hotels);
        hotels = new Hotels();

        hotels.setHotelName("RidgeWood");
        hotels.setWeekDay(220);
        hotels.setWeekEnd(150);
        //adding hotel to hotelList
        hotelsList.add(hotels);
        return true;

    }

    /**
     * This method is used to display the list of hotel details by fetching the hotels list.
     */
    public void displayHotels() {
        System.out.println("Number of Hotels :" + hotelsList.size());
        for (int i = 0; i < hotelsList.size(); i++) {
            Hotels temp = hotelsList.get(i);
            System.out.println("Hotels Name : " + temp.getHotelName() + "  Hotel week day price : " + temp.getWeekDay() + "  Hotel week end price : " + temp.getWeekEnd());
        }
    }
}
