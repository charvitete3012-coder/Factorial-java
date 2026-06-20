import java.util.Scanner;

public class Factorial{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorail till : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Factorial is 1 ");
        }
        int i=1;
        int fac=1;
        while(i<=n){
            fac = fac*i;
           System.out.println("Factorial of " +i +" is : " +fac);
           i++;
        }
    }
}