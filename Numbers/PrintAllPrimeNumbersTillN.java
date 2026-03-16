package Numbers;
import java.util.Scanner;

public class PrintAllPrimeNumbersTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for(int num=2; num<=n; num++){
            boolean isPrime = true;
            for(int i =2; i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(num+ " ");
            }
        }
    }
}
