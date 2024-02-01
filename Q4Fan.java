package Assignment1;

public class Q4Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor
    public Q4Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0; // Default radius
        color = "blue"; // Default color
    }

    // Accessor methods
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Mutator methods
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        // Create a Fan object and set its properties
        Q4Fan myFan = new Q4Fan();
        myFan.setSpeed(FAST);
        myFan.setRadius(10);
        myFan.setColor("yellow");
        myFan.setOn(true);

        // Display the Fan object using the toString method
        System.out.println(myFan.toString());
    }
}
