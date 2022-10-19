package Assignment5;


public class TestEquals {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 4);
        System.out.println("\nA rectangle1 " + rectangle1);
        System.out.println("The area is " + rectangle1.getArea());
        System.out.println("The perimeter is " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(2, 4);
        System.out.println("\nA rectangle2 " + rectangle2);
        System.out.println("The area is " + rectangle2.getArea());
        System.out.println("The perimeter is " + rectangle2.getPerimeter());

        System.out.println("\n" + rectangle1.equals(rectangle2));

    }
}
