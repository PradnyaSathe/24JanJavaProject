package parametersStudy;

import math1.MathOp1;

public class MathStudy {
    static void main(String[] args) {
   test();
        MathStudy mathStudy=new MathStudy();
        mathStudy.mul();
        MathStudy1 mathStudy1=new MathStudy1();
        mathStudy1.sub();
        MathStudy1.div();
        MathStudy1.add(5,9);
        mathStudy1.mul(4,7);
    }
    public static void test(){
        int a=6;
        int b=100;
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
    public void mul()
    {
        int a=8;
        int b=9;
        int mul=a*b;
        System.out.println("mul is "+mul);
    }
}
