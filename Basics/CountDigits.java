package Basics;

public class CountDigits {
    public static void main(String[] args) {
        int num =5478;
        int originalNum = num;
        int count = 0;
        while(num>0){
            num = num /10;
            count++;
        }
        System.out.println("The count for "+originalNum+ " is "+ count);
    }
}
