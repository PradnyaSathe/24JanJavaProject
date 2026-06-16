package controlStatements;

public class ElseIfStudy12 {
    static void main(String[] args) {
        //if marks is >=70--->dist
        //marks>=60-->first class
        //marks>=40-->pass class
        //else-->fail
        int marks=90;
        if(marks>=70)
        {
            System.out.println("dist");
        }
        else if(marks>=60)
        {
            System.out.println("first class");
        }
        else if(marks>=40)
        {
            System.out.println("pass class");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
