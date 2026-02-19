package Basics;
import java.util.Scanner;

public class PrintNumbers_NTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        for(int i=num; i>=1; i--){
            System.out.println(i);
        }
    }
}
