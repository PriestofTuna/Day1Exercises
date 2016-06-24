/**
 * Created by lytte on 6/17/2016.
 */
import com.sun.corba.se.impl.presentation.rmi.ExceptionHandler;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean again=false;

         do {
             int input = key.nextInt();
             System.out.print("Here is your pent number, " + formula(input) + " input another? true/false ");

             try{ again =key.nextBoolean();}
             catch(InputMismatchException e) {
                 System.out.println("Incorrect input, ending program");
                 System.exit(0);
             }

        } while(again==true);

    }
    public static int formula(int Tune) {
//        int translate = Tune;
//        translate*=3;
//        translate-=1;
//        translate*=Tune;
//        translate/=2;
//        base = translate;
        Tune= Tune*(Tune*3 -1)/2;
        int base = Tune; //dummy value
        return base;
    }
}

