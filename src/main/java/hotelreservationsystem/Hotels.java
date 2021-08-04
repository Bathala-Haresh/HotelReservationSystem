/****************************************************************
 * Purpose : To create a POJO class which holds Hotels details.
 * @author Bathala Haresh
 ***************************************************************/
package hotelreservationsystem;

public class Hotels {
    private String hotelName;
    public int weekDay;
    public int weekEnd;

    // Generating getters and setters.
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    public int getWeekEnd() {
        return weekEnd;
    }

    public void setWeekEnd(int weekEnd) {
        this.weekEnd = weekEnd;
    }
}
