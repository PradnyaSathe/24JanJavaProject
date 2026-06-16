package logicalPrograms;

import java.util.Scanner;

public class EvenOddScanner {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enetr number");
        int a=scanner.nextInt();

        if(a==0)
        {
            System.out.println("number is zero");
        } else if (a%2==0)
        {
            System.out.println("numer is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}
