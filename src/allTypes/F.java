package allTypes;

public class F {
    int a=100;
    int b=60;

    static void main(String[] args) {
   F f=new F();
   f.display();
   f.show();
    }
    public void display()
    {
        int a=40;//local variable
        int sum=a+b;//a is local and b is global variable
        System.out.println("sum is "+sum);
        int sum1=this.a+b;
        System.out.println("sum1 is "+sum1);
    }
    public void show()
    {
        int b=5;
        int mul=a*b;//a is global and b is local
        int mul1=a*this.b;//both is global
        System.out.println("mul is "+mul);
        System.out.println("mul1 is "+mul1);
    }
}
