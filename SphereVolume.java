import java.util.Scanner;

public class SphereVolume {
    public static void main (String [] args) {
        // Variables
        double diam;
        double radius;
        double volume;

        // Scanner object
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program calculates diameter of a sphere based on your input");
        System.out.println("Please enter a diameter");
        diam = userInput.nextDouble();

        radius = diam / 2;
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume of the sphere is " + volume);

    }
}
