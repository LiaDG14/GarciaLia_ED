package exam1;

import java.util.Scanner;
import java.util.Locale;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Introdueix el nombre d'elements de l'array:");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.println("Introdueix el contingut de l'array:");
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }

        int suma = 0;
        for(int i = 0; i < array.length; i++){
            suma += array[i];
        }

    System.out.printf("La suma total és %d\n", suma);
  
    }
}

