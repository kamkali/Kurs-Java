package geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeometryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a radius of a circle");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Please input a and b");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        Rectangle rec = new Rectangle(a, b);

        List<Figure> figureList = new ArrayList<>();

        figureList.add(circle);
        figureList.add(rec);

        System.out.println();

        System.out.println("Area of a rectangle is: " + rec.getArea());
        System.out.println("Area of a circle is: " + circle.getArea());


    }
}
