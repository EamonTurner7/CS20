
package SkillBuilders;

public class Circle {

    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void displayAreaFormula() {
        System.out.println("Area = PI * radius * radius");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.radius == other.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle3 with radius " + radius;
    }

    public static void main(String[] args) {

        Circle spot = new Circle(3);
        Circle anotherSpot = new Circle(3);

        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());

        Circle.displayAreaFormula();

        System.out.println("Are the circles equal? " + spot.equals(anotherSpot));

        System.out.println(spot);
    }
}
