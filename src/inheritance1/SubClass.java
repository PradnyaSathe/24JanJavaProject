package inheritance1;

public class SubClass extends SuperClass{
    static void main(String[] args) {
 SubClass subClass=new SubClass();
 subClass.car();
 subClass.height();
 subClass.money();
 bike();
 color();
 nature();
    }
    public void car()
    {
        System.out.println("car");
    }
    public static void bike()
    {
        System.out.println("bike");
    }
}
