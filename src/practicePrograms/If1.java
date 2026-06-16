package practicePrograms;

public class If1 {
    static void main(String[] args) {
        int marks = 50;
        if (marks >= 30)
        //if
        {
            System.out.println("result is pass");
        }
        //if-else
        marks = 70;
        if (marks >= 80 && marks <= 90) {
            System.out.println("grade A");
        }
        else
        {
            System.out.println("grade B");
        }
        //else if
        marks=60;
        if (marks >= 90) {
            System.out.println("A1");
        }
        else if(marks>=60)
        {
            System.out.println("B1");
        }
        else if(marks>=40)
        {
            System.out.println("only pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
