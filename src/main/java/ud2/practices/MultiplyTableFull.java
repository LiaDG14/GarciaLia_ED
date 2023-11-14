ºpackage ud2.practices;

import java.util.Scanner;
import java.util.Locale;

public class MultiplyTableFull {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
+       int n = in.nextInt();


        for (int i = 1; i <= 10; i++) {
+ for (int j = 1; j <= 20; j++) {            
                System.out.printf(" %3d", i*j);
            }
            System.out.println();
        }
    }
}

