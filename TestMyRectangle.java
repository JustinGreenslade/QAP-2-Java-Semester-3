
public class TestMyRectangle {
    public static void main(String[] args) {
        // makes a couple of points
        MyPoint p1 = new MyPoint(1, 5);  // top left corner
        MyPoint p2 = new MyPoint(6, 1);  // bottom right corner

        System.out.println();
        // makes a rectangle using those points
        MyRectangle rect = new MyRectangle(p1, p2);

        // print the rectangle info
        System.out.println("Rectangle: " + rect);
        System.out.println("Top Left: " + rect.getTopLeft());
        System.out.println("Bottom Right: " + rect.getBottomRight());

        // print the width and height
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());

        // print the area and perimeter
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
