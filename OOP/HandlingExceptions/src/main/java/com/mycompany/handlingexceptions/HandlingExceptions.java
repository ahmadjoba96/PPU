//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba 

package com.mycompany.handlingexceptions;

import static com.mycompany.handlingexceptions.DivisionApp.divide;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean keepGoing = true;

        System.out.println("=== Welcome to Safe Division App ===");

        while (keepGoing) {
            try {
                System.out.print("Enter numerator (int): ");
                int num = in.nextInt();

                System.out.print("Enter denominator (int): ");
                int den = in.nextInt();

                int result = divide(num, den);
                System.out.println("Result = " + result);
                keepGoing = false;

            } catch (InputMismatchException e) {
                System.err.println("Exception: " + e);
                System.out.println("Invalid input. Please enter **integers** only.");
                in.nextLine();
            } catch (ArithmeticException e) {
                System.err.println("Exception: " + e);
                System.out.println("Cannot divide by zero. Please try again.");
            } finally {
                System.out.println("End of one attempt.\n");
            }
        }

        System.out.println("finished");
        in.close();
    }
}
