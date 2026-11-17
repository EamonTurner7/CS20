
package SkillBuilders;

public class Rectangle {

    private double length;
    private double width;

    // No-parameter constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Two-parameter constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Set length
    public void setLength(double length) {
        this.length = length;
    }

    // Get length
    public double getLength() {
        return length;
    }

    // Set width
    public void setWidth(double width) {
        this.width = width;
    }

    // Get width
    public double getWidth() {
        return width;
    }

    // Calculate area
    public double area() {
        return length * width;
    }

    // Calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    // Display area formula
    public static void displayAreaFormula() {
        System.out.println("Area = length * width");
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;

            return this.length == other.length &&
                   this.width == other.width;
        }

        return false;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Rectangle with length " + length +
               " and width " + width;
    }

    // Main method (client code)
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(10, 5);
        Rectangle rectangle3 = new Rectangle(8, 4);

        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Area: " + rectangle1.area());
        System.out.println("Perimeter: " + rectangle1.perimeter());

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());

        System.out.println();

        // Display area formula
        Rectangle.displayAreaFormula();

        // Compare rectangles
        System.out.println("Are rectangle 1 and 2 equal? "
                + rectangle1.equals(rectangle2));

        System.out.println("Are rectangle 1 and 3 equal? "
                + rectangle1.equals(rectangle3));

        // Display rectangle using toString
        System.out.println(rectangle1);
    }
}
