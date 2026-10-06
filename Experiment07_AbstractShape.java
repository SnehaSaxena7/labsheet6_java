abstract class AbstractShape07 {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle07 extends AbstractShape07 {
    double radius;

    Circle07(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle07 extends AbstractShape07 {
    double a;
    double b;
    double c;

    Triangle07(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class Experiment07_AbstractShape {
    public static void main(String[] args) {

        AbstractShape07 circle = new Circle07(5);

        System.out.println("Circle Area = " + circle.calculateArea());
        System.out.println("Circle Perimeter = " + circle.calculatePerimeter());

        AbstractShape07 triangle = new Triangle07(3, 4, 5);

        System.out.println("Triangle Area = " + triangle.calculateArea());
        System.out.println("Triangle Perimeter = " + triangle.calculatePerimeter());
    }
}