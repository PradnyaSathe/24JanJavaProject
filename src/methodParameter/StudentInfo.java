package methodParameter;

public class StudentInfo {
    static void main(String[] args) {
        studentData();
        studentData("Ishan",23,'A',66.6f,true);
    }
    public static void studentData()//this static without parameters method we have to call into main method
    {
        //StudentInfo--->name(String),rollNum(int),div(char),marks(float),result(boolean)
        String name;
        int rollNum;
        char div;
        float marks;
        boolean result;//this is declaration of variables
        name="Surya";
        rollNum=45;
        div='A';
        marks=90.5f;
        result=true;//true(pass) false(fail)
        System.out.println("my name is "+name);
        System.out.println("my rollNum is "+rollNum);
        System.out.println("my div is "+div);
        System.out.println("my marks are "+marks);
        System.out.println("my result is "+result);
    }
    public static void studentData( String name,int rollNum,char div,float marks,boolean result)
    {
        System.out.println("my name is "+name);
        System.out.println("my rollNum is "+rollNum);
        System.out.println("my div is "+div);
        System.out.println("my marks are "+marks);
        System.out.println("my result is "+result);
    }
}
