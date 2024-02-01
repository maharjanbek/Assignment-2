

public class Q6Time {
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor sets the time for the current GMT time
    public Q6Time() {
        setTime(System.currentTimeMillis());
    }

    // Constructor with specified elapsed time since midnight, Jan 1, 1970, in milliseconds
    public Q6Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    // Set the time using the specified passed time
    private void setTime(long elapsedTime) {
        // Calculate the total seconds since midnight, Jan 1, 1970
        long totalSeconds = elapsedTime / 1000;

        // Calculate the current second in the minute
        second = (int) (totalSeconds % 60);

        // Calculate the total minutes
        long totalMinutes = totalSeconds / 60;

        // Calculate the current minute in the hour
        minute = (int) (totalMinutes % 60);

        // Calculate the total hours
        long totalHours = totalMinutes / 60;

        // Calculate the current hour
        hour = (int) (totalHours % 24);
    }

    // Getters for hour, minute, and second
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Main method to test the Time class
    public static void main(String[] args) {
        // Create a Time object using the no-arg constructor
        Q6Time currentTime = new Q6Time();

        // Display the current time using get methods
        System.out.println("Current Time (GMT):");
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
    }
}

