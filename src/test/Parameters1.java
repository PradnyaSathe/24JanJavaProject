package test;

public class Parameters1 {
    static void main(String[] args) {
    study("pradnya",50000);
    study(100,50,500);
    Parameters1 parameters1=new Parameters1();
    parameters1.study("pradnya",true);//true=pass false=fail
    }
    public static void study(String name,int salary)
    {
        System.out.println("my name is "+name);
        System.out.println("my salary is "+salary);
    }
    public void study(String name,boolean result)
    {
        System.out.println("my name is "+name);
        System.out.println("my marks are "+result);
    }
    public static void study(int a,int b,int c)
    {
       int sum=a+b+c;
       System.out.println("total sum is "+sum);
    }
}
