package logicalPrograms;

import java.util.Scanner;

public class UserInput {

    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name =scanner.next();
        System.out.println("my name is "+name);

        System.out.println("enter your roll number");
        String rollNum=scanner.next();
        System.out.println("my roll num is "+rollNum);
    }
}
