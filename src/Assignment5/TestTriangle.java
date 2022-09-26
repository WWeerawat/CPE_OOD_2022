package Assignment5;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color = input.nextLine();
        boolean filled = input.nextBoolean();
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println("\nA " + triangle);
        System.out.println("A triangle color is " + triangle.getColor());
        System.out.println("A triangle filled is " + triangle.isFilled());
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
    }
}
