package thisAndSuper;

public class B extends A{
    int x=4;
    int y=6;
    static void main(String[] args) {
   B b=new B();
   b.test();
    }
    public void test()
    {
        int x=4;
        int sum=x+5;
        int sum1=this.x+7;
        int sum2=super.x+7;
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
