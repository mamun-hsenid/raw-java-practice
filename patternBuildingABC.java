package basicJava;

import java.util.Scanner;

public class patternBuildingABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of row : ");
        int num = sc.nextInt();
        for (int i = 1, ch = 65; i <= num; i++, ch++) {
            for (int j=1; j<=i; j++) {
                System.out.printf("%c ",ch);
            }
            System.out.println("");
        }
        System.out.println(" -------------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j=1, ch = 65; j<=i; j++, ch++) {
                System.out.printf("%c ",ch);
            }
            System.out.println("");
        }

    }
}



