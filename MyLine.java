public class MyLine {
    
    private MyPoint begin;
    private MyPoint end;

    // Constructor 
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2); 
    }

    // Constructor using MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // get the begining point of the line
    public MyPoint getBegin() {
        return begin;
    }

    // change the begining point of the line
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // get the end point of the line
    public MyPoint getEnd() {
        return end;
    }

    // change the end point of the line
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // get just the x value from the begining point
    public int getBeginX(){
        return begin.getX();
    }

    // change only the x value of the begining point
    public void setBeginX(int x){
        begin.setX(x);
    }

    // get just the y value from the begining point
    public int getBeginY(){
       return begin.getY();
    }

    // change only the y value of the begining point
    public void setBeginY(int y){
        begin.setY(y);
    }

    // get just the x value of the end point
    public int getEndX(){
        return end.getX();
    }

    // change only the x value of the end point
    public void setEndX(int x) {
        end.setX(x);
    }

    // get just the y value of the end point
    public int getEndY() {
       return end.getY();
    }
    
    // change only the y value of the end point
    public void setEndY(int y) {
        end.setY(y);
    }

    // get both x and y of the begining point in an array
    public int[] getBeginXY() {
        return new int[] { begin.getX(), begin.getY() };
    }
    
    // set both x and y of the begining point at once
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }
    
    // get both x and y of the end point in an array
    public int[] getEndXY() {
        return new int[] { end.getX(), end.getY() };
    }

    // set both x and y of the end point at once
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
        ;
    }

    // get the length of the line (distance between begining and end points)
    public double getLength() {
        return begin.distance(end); 
    }

    // figure out the angle (slope) of the line, in radians
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff); 
    }

    // make a string that shows the line's begining and end points
    public String toString() {
        return "MyLine[begin = " + begin + ", end = " + end + "]";
    }
}
