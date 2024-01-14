package basicJava;

import java.util.ArrayList;
import java.util.Scanner;

public class javaLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();


        System.out.print("Type your array elements : ");
        for (int i = 0; i < 9; i++) {
            nums.add(scan.nextInt());
        }


        for(int num : nums) {
            System.out.println("Element : " + num);
        }

        System.out.println("#########  pattern building @@@@@@@@@");
        System.out.println();

        int row = scan.nextInt();

        for (int i=1; i<=row; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }


    }
}
