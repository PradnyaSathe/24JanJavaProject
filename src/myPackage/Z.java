package myPackage;

import accessSpecifiers.A;

public class Z extends A {
    //we want to call methods from A class of accessSpecifiers
   public static void main(String[]args) {
        A a=new A();
        a.test4();
        //only we can access test4 bcoz other test2 and test3 are only limited within package
        //but protected we can call using inheritance
        //consider class C is sub-class and class A is super class
      // int sum=1+a.d;
       Z z=new Z();
       z.test3();
      // z.test4();
     //   int sum1=1+c.c;
    }
}
