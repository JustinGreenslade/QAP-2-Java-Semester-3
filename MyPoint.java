public class MyPoint {
    private int x;
    private int y;

    // default constructor 
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // constructor with x and y values
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // get x value of the point
    public int getX() {
        return x;
    }

    // change the x value of the point
    public void setX(int x) {
        this.x = x;
    }

    // get y value of the point
    public int getY() {
        return y;
    }

    // change the y value of the point
    public void setY(int y) {
        this.y = y;
    }

    // set both x and y at once
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // print the point
    public String toString() {
        return ("(" + this.x + ", " + this.y + ")");
    }

    // find distance from this point to another point using x and y values
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return (Math.sqrt(yDiff * yDiff + (xDiff * xDiff))); // pythagoras baby
    }

    // find distance from this point to another MyPoint object
    public double distance(MyPoint p) {
        int xDiff = this.x - p.x;
        int yDiff = this.y - p.y;
        return (Math.sqrt(yDiff * yDiff + (xDiff * xDiff)));
    }

    // find distance from this point to the original 
    public double distance() {
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return (Math.sqrt(yDiff * yDiff + (xDiff * xDiff)));
    }
}
