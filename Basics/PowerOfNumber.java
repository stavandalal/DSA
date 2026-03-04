package Basics;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base, exponent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number: ");
        base = sc.nextInt();
        System.out.println("Enter exponent number");
        exponent = sc.nextInt();

        int result = 1;
        for(int i=1; i<=exponent; i++){
            result= result * base;
        }

        System.out.println("The Result is : "+ result);
    }
}
