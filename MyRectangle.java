public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Default constructor
    public MyRectangle() {
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(0, 0);
    }

    // Constructor using two points
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // getter for top left
    public MyPoint getTopLeft() {
        return topLeft;
    }

    // setter for top left
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // getter for bottom right
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // setter for bottom right
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // calculates the width 
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // calculates the height
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // area = width * height
    public int getArea() {
        return getWidth() * getHeight();
    }

    // perimeter = 2 * (width + height)
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // print
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
