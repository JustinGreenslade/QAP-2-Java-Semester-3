public class TestMyLine {
    public static void main(String[] args) {
        // make a line that goes from (1, 1) to (4, 5)
        MyLine line = new MyLine(1, 1, 4, 5);

        // print the whole line 
        System.out.println("Line: " + line);

        // gets the starting and ending points and print them
        System.out.println("Begin Point: " + line.getBegin());
        System.out.println("End Point: " + line.getEnd());

        // changing the lines points to new ones
        line.setBeginXY(2, 3);
        line.setEndXY(5, 7);
        System.out.println("Updated Line: " + line);

        // prints the individual X and Y values
        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("Begin Y: " + line.getBeginY());
        System.out.println("End X: " + line.getEndX());
        System.out.println("End Y: " + line.getEndY());

        // grab both X and Y together as arrays and print them
        int[] beginXY = line.getBeginXY();
        int[] endXY = line.getEndXY();
        System.out.println("Begin XY: (" + beginXY[0] + ", " + beginXY[1] + ")");
        System.out.println("End XY: (" + endXY[0] + ", " + endXY[1] + ")");

        // let's see how long the line is and what angle it's pointing
        System.out.println("Line Length: " + line.getLength());
        System.out.println("Line Gradient (radians): " + line.getGradient());
    }
}
