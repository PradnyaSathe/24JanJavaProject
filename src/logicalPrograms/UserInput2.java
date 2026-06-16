package logicalPrograms;

import java.util.Scanner;

public class UserInput2 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.next();
        System.out.println("my name is "+name);

        System.out.println("enter your roll number");
        String rollNum=scanner.next();
        System.out.println("my rollNum is "+rollNum);

        System.out.println("enter your marks");
        String marks=scanner.next();
        System.out.println("my marks is "+marks);
    }
}
