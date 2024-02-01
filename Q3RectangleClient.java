package Assignment1;

public class Q3RectangleClient {
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(5, 50, "yellow");
        Rectangle rectangle2 = new Rectangle(5, 50, "yellow");

        // Display the properties of both objects
        displayRectangleProperties(rectangle1, 1);
        displayRectangleProperties(rectangle2, 2);
    }

    // Helper method to display rectangle properties
    private static void displayRectangleProperties(Rectangle rectangle, int number) {
        System.out.println("Rectangle " + number + " Properties:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + rectangle.findArea());
        System.out.println("Perimeter: " + rectangle.findPerimeter());
        System.out.println();
    }

    public static class Rectangle {
        private double width;
        private double height;
        private static String color;  // static variable for color

        // Constructors
        public Rectangle() {
            this(0.0, 0.0); // Default constructor sets width and height to 0.0
        }

        public Rectangle(double width, double height) {
            this(width, height, ""); // Constructor with width and height, color is initially empty
        }

        public Rectangle(double width, double height, String color) {
            this.width = width;
            this.height = height;
            Rectangle.color = color; // Set the static color variable
        }

        // Getter and setter methods
        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public static String getColor() {
            return color;
        }

        public static void setColor(String color) {
            Rectangle.color = color;
        }

        // Other methods
        public double findArea() {
            return width * height;
        }

        public double findPerimeter() {
            return 2 * (width + height);
        }
    }
}
