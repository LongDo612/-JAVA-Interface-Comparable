package Shape;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class mainShape {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        ComparableRectangle[] rectangles = new ComparableRectangle[3];
        rectangles[0] = new ComparableRectangle(10,5);
        rectangles[1] = new ComparableRectangle(15,6);
        rectangles[2] = new ComparableRectangle(11,7);

        System.out.println("Pre-sorted:");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Arrays.sort(rectangles);

        System.out.println("After-sorted:");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        ComparableSquare[] squares = new ComparableSquare[3];
        squares[0] = new ComparableSquare(6);
        squares[1] = new ComparableSquare(8);
        squares[2] = new ComparableSquare(5);

        System.out.println("Pre-sorted:");
        for (ComparableSquare square : squares) {
            System.out.println(square);
        }

        Arrays.sort(squares);

        System.out.println("After-sorted:");
        for (ComparableSquare square : squares) {
            System.out.println(square);
        }
    }
}
