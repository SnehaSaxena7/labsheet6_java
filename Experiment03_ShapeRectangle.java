class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class Experiment03_ShapeRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Length = " + rectangle.length);
        System.out.println("Width = " + rectangle.width);
        System.out.println("Area of Rectangle = " + rectangle.getArea());
    }
}