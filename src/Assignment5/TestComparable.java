package Assignment5;


public class TestComparable {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(1);
        System.out.println("A circle " + circle1);
        System.out.println("The color is " + circle1.getColor());
        System.out.println("The radius is " + circle1.getRadius());
        System.out.println("The area is " + circle1.getArea());
        System.out.println("The diameter is " + circle1.getDiameter());

        ComparableCircle circle2 = new ComparableCircle(2);
        System.out.println("\nA circle " + circle2);
        System.out.println("The color is " + circle2.getColor());
        System.out.println("The radius is " + circle2.getRadius());
        System.out.println("The area is " + circle2.getArea());
        System.out.println("The diameter is " + circle2.getDiameter());

        System.out.print("Is circle1 area greater than circle2 ");
        System.out.println(circle1.compareTo(circle2) > 0 ? "true" : "false");
    }
}
