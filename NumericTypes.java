import java.util.Scanner;

/**
 This program demonstrates how numeric types and operators behave in Java
 */
public class test {
    public static void main (String [] args) {
        //TASK #2 Create a Scanner object here
        Scanner userInput = new Scanner (System.in);
        //identifier declarations
        final int NUMBER = 2; // number of scores
        int score1 = 100; // first test score
        int score2 = 95; // second test score
        final int BOILING_IN_F = 212; // boiling temperature
        double fToC; // temperature in Celsius
        double average; // arithmetic average
        String output; // line of output to print out
        //Task #2 declare a variable to hold the user’s temperature
        int givenTemp;
        //Task #2 prompt user to input score1
        System.out.println("Please enter the first score");
        //Task #2 read score1
        score1 = userInput.nextInt();
        //Task #2 prompt user to input score2
        System.out.println("Please enter the second score");
        //Task #2 read score2
        score2 = userInput.nextInt();
        // Find an arithmetic average
        average = (double)(score1 + score2) / (double)NUMBER;
        output = score1 + " and " + score2 + " have an average of " + average;
        System.out.println(output);
        // Convert Fahrenheit temperatures to Celsius
        fToC = (5.0/9.0) * ((double)BOILING_IN_F - 32);
        System.out.println(fToC);
        output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
        System.out.println(output);
        //Task #2 prompt user to input another temperature
        System.out.println("Please enter another temperature");
        //Task #2 read the user’s temperature in Fahrenheit
        givenTemp = userInput.nextInt();
        //Task #2 convert the user’s temperature to Celsius
        fToC = (5.0/9.0) * ((double)givenTemp - 32);
        output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
        //Task #2 print the user’s temperature in Celsius
        System.out.println(output);
        System.out.println("Goodbye"); // to show that the program is ended
    }
}
