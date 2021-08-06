/****************************************************************
 * Purpose : To create a POJO class which holds hotelnames ,ratings and totalRate
 * @author Bathala Haresh
 ***************************************************************/
package com.hotelreservation;

public class Result {

    private String hotelName;
    private int totalRate;
    private int rating;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getTotalRate() { return totalRate; }

    public void setTotalRate(int totalRate) { this.totalRate = totalRate; }

    public int getRating() { return rating; }

    public void setRating(int rating) { this.rating = rating; }
}
