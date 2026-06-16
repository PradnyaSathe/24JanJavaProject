package test;

public class NewMethod1 {
    public static void mul() //this static regular method
         // but this class has not any main method so we have to run it on another method
    {
    int a=4;
    int b=6;
    int mul=a*b;
    System.out.println("mul is "+mul);
    }
    public void div(){
        //this is non static method without main method
        //first creat object of this method into another class
        int s=20;
        int t=3;
        int div=s/t;
        System.out.println("div is "+div);
    }
}
