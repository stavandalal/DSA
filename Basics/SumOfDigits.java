package Basics;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 5745;
        int originalNum = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("The Sum of " + originalNum + " is " + sum);
    }
}
