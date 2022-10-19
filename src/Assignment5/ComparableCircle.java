package Assignment5;

public class ComparableCircle extends Circle implements Comparable<Circle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getArea() > o.getArea()) return 1;
        return 0;
    }
}
