/**
 * Created by lytte on 6/27/2016.
 *
 * Purpose, rectangle area
 */
public class Chap1Exercise {
    public static void main(String [] args) {
        //taking 1.9
        double width, height;
        width = 4.5;
        height = 7.9;
        area(width, height);
    }
        //creates a method for finding the area of a rectangle
        public static double area(double w, double h) {

        double print=w*h;
        System.out.println("The area is " +print);
        return print;
    }

    }

