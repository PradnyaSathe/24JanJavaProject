package variableTypes;

public class X {
   int a=10; //globle variable
   int b=50;//globle variable

    static void main(String[] args) {
 X x=new X();
 x.addition();
 X x1=new X(200,40);
 x1.addition();
 x.display();
 x.display();

    }
   public void addition() //this is operation
   {
       int sum2=a+b;
       System.out.println("sum is "+sum2);
   }
   public X()//this is constructor used only for initialization variables
   {
       a=5;//here globle variable value is changed
       b=40;
   }
   public X(int x,int y)
   {
      a=x;
      b=y;
   }
   public void display()
   {
       int a=10;//this is local variable bcoz this is within the method that's why
       int sum=a+b;//here a is local variable and b is globle variable
       int sum1=this.a+b;//this.a=globle a --> why bcoz here 2 (a) variables are present
       System.out.println("sum is "+sum);
       System.out.println("sum1 is "+sum1);

   }
}





