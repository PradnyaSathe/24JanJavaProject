package allTypes;

public class G {
    int a=10;
    static int b=10;

    static void main(String[] args) {
 //test();
 G g=new G();
 g.test1();
 test();
    }
public static void test()
{
    int a=60;//local variable for this method
    int sum=a+b;//a is local here and b is static global
    System.out.println("sum is "+sum);
    //we can not use global variable into the static method
    int b=50;
    int sum1=a+G.b;
    System.out.println("sum1 is "+sum1);
}
public void test1()
{
    int a=100;
    int b=70;
    int sub=a-b;
    System.out.println("sub is "+sub);
    int sub1=this.a-G.b;//a is global and b is global
    //in non static method we can get global variable but in static we can not
    System.out.println("sub1 is "+sub1);
}
}
