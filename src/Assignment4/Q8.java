package Assignment4;

public class Q8 {
    public static void main(String[] args) {
//        GeometricObject object = new GeometricObject();
//        Circle circle = (Circle) object;
//
//        System.out.println("circle instanceof GeometricObject: " + (circle instanceof GeometricObject));
//        System.out.println("object instanceof GeometricObject: " + (object instanceof GeometricObject));
//        System.out.println("circle instanceof Circle: " + (circle instanceof Circle));
//        System.out.println("object instanceof Circle: " + (object instanceof Circle));

        Object circle1 = new Circle();
        Object circle2 = new Circle();
        System.out.println(circle1.equals(circle2));
    }
}
