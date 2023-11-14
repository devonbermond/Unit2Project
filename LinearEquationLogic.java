import java.util.Scanner;
public class LinearEquationLogic {


    private Scanner scan;
    private LinearEquation linEquation;


    public LinearEquationLogic() {
        linEquation = null;
        scan = new Scanner(System.in);
    }


    public void start() {
        getPointInfo();
        continueOn();
    }

    private void getPointInfo() {
        System.out.println("Welcome to the linear equation calculator!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1, coord1.indexOf(", ")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(",") + 2, coord1.length() - 1));
        int x2 = Integer.parseInt(coord2.substring(1, coord2.indexOf(", ")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",") + 2, coord2.length() - 1));

        if (x1 != x2){
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            System.out.println(equation.lineInfo());
            System.out.print("Enter a value for x: ");
            double xPoint = scan.nextDouble();
            scan.nextLine();
            System.out.println("The point on the line is " + equation.coordinateForX(xPoint));
        } else {
            System.out.println("Sorry, this is an invalid coordinate set");
        }

    }

    private void continueOn() {
        System.out.print("Would you like to enter another pair of coordinates? (y/n): ");
        String answer = scan.nextLine();
        if (answer.equals("y")) {
            start();
        }
    }

}



