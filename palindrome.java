package basicJava;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        System.out.print("Enter a number to check palindrome :  ");
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        StringBuilder number = new StringBuilder();
        number.append(num);

        System.out.println(number.toString().equals(number.reverse().toString())? num + " is a palindrome number" : num + " is not a palindrome number");
    }
}
