package test;

public class NewMethod {
    static void main(String[] args) {
        //this is my main method
     add();
     //creat object for non-static method how it creat
     // ClassName objectName=new ClassName();
        NewMethod newMethod=new NewMethod();
        //now calling non-static method how=objectName.methodName();
        newMethod.sub();
        //now i have to call static method from NewMethod1 class first
        //call it by ClassName.methodName();
        NewMethod1.mul();
        NewMethod1 newMethod1=new NewMethod1();//creat object of NewMethod1 class for non-static
        newMethod1.div();
    }
    //now I want to write here static method
    public static void add()//this is static method declaration with zero parameters
    {
       int c=6;
       int d=9;
       int sum=c+d;
       System.out.println("sum is "+sum);
       //this is method is not run on its own we have to call it into main method
        // so we call it by its name only add(); within the main method
    }
    //now I want to write non-static method
    //where static word is not present that method called non-static method
    public void sub()//in non-static method we have to creat object first within main method
    {
        int a=10;
        int b=6;
        int sub=a-b;
        System.out.println("sub is "+sub);
    }

}
