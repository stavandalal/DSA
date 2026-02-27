package Basics;

public class TableOF7 {
    public static void main(String[] args) {
        int num = 7;
        int originalNumber = num;
        int res = 1;
        for(int i=1; i<=10; i++){
            res = num * i;
            System.out.println(originalNumber +" X " +i+" = "+res);
        }
    }
}
