package exam1;

import java.util.Locale;
import java.util.Scanner;

public class WhichPizzaShouldIBuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Introdueix el diàmetre de la pizza redona:");
        double diametre = in.nextDouble();

        System.out.println("Introdueix els dos costats de la pizza rectangular:");
        double a = in.nextDouble();
        double b = in.nextDouble();

        double areaRedona = 2 * Math.PI * diametre;
        double areaRectangular = a + b;

        if (areaRedona < areaRectangular)
            System.out.println("Compra la pizza redona!");
        else
            System.out.println("Compra la pizza rectangular!");
    }
}
