package accessSpecifiers;

public class B {
    static void main(String[] args) {
        A a=new A();
        //we access only default ,protected and public
        //private is only within class
        a.test2();
        a.test3();
        a.test4();
        //int sum=1+a.a;
        int sum2=1+a.b;
        int sum3=1+a.c;
        int sum4=1+a.d;
       //System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
