public class LinearEquation {

    // instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double distance;
    private double yIntercept;

    // constructor
    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100.0) / 100.0;
    }
    public int getx1() {
        return x1;
    }
    public int gety1() {
        return y1;
    }
    public int getx2() {
        return x2;
    }
    public int gety2() {
        return y2;
    }

    public double distance(){
        double distance = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2 - y1), 2));
        return roundedToHundredth(distance);
    }

    public double slope() {
        double slope = 0;
        if (x1 == x2) {
            return slope;
        } else {
            slope = roundedToHundredth((double)(y2 - y1) / (x2 - x1));
            return slope;
        }
    }

    public double yIntercept (double slope) {
        double yInt = 0;
        yInt = y1 - (slope() * x1);
        return roundedToHundredth(yInt);
    }

    public String equation () {
        String equation = "";
        double slope = slope();
        double yInt = yIntercept(slope);
        if (slope == 0){
            equation = "y = " + yInt;
         } else {
            equation = "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yInt;
        }

        return equation;
    }

    public String coordinateForX(double x) {
        double slope = slope();
        double y = slope * x + yIntercept(slope);

        // Round x and y to the nearest hundredth
        x = roundedToHundredth(x);
        y = roundedToHundredth(y);
        String coorForX = "The point on the line is (" + x + ", " + y + ")";

        /* return String.format("(%.2f, %.2f)", x, y); */
        return coorForX;
    }
    public String lineInfo() {
        double slope = slope();
        String info = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n";
        info += "The equation of the line between these points is: " + equation() + "\n";
        info += "The slope of this line is: " + slope() + "\n";
        info += "The y-intercept of this line is: " + yIntercept(slope) + "\n";
        info += "The distance between these points is: " + distance() + "\n";

        return info;
    }

}


