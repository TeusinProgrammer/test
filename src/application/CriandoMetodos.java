package application;

import entities.Tirangle;
import java.util.Locale;
import java.util.Scanner;

public class CriandoMetodos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Tirangle triangulox = new Tirangle();
        Tirangle trianguloy = new Tirangle();
        double xA, xB, xC, yA, yB, yC;
        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double areaX = triangulox.area();
        double areaY = trianguloy.area();
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
