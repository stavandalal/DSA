package Numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int origianlNum = num;
        int rev = 0;
        while(num>0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        
        if(origianlNum == rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
