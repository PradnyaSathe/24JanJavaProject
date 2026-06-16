package test;

public class NewParameters {
    static void main(String[] args) {
 NewParameters newParameters=new NewParameters();
 newParameters.Addition(2,4,6);
 newParameters.Addition(4,10,45);//we call it multiple times
        MyRules myRules=new MyRules();//creat object of class=MyRules here
        myRules.sub(10,5,2);
        myRules.sub(40,30,20);
        myRules.sub(100,48,3);
    }
    public void Addition(int a,int b,int c)//this is non-static method with parameters
    {
        int sum=a+b+c;
        System.out.println("sum is "+sum);
    }
}

