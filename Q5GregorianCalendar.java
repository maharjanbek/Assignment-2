
import java.util.GregorianCalendar;

public class Q5GregorianCalendar {

    public static void main(String[] args) {
        // Create a GregorianCalendar object for the current date
        GregorianCalendar currentDate = new GregorianCalendar();
        // Display the current year, month, and day
        System.out.println("Current Date:");
        System.out.println("Year: " + currentDate.get(GregorianCalendar.YEAR));
        // Months are zero-based, so we need to add 1 to get the correct month
        System.out.println("Month: " + (currentDate.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + currentDate.get(GregorianCalendar.DAY_OF_MONTH));
    }
}