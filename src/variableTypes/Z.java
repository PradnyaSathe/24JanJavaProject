package variableTypes;

public class Z {
    int a=10;//this ia global variable
    int b=20;//global variable

    static void main(String[] args) {
Z z=new Z();
z.display();
z.show();
    }

    public void display()
    {
        int a=30;//local variable applicable only for this method
        int sum=a+b; //here a is local and b is global
        int sum1=this.a+b;//a is global and b is also global
        // here two same name a variables are present but I want global variable that why (this.a)is given
        System.out.println("sum is "+sum);
        System.out.println("sum1 is "+sum1);
    }
    public void show()
    {
        int a=5;
        int c=10;//local variable
        int sub=a-c;//here a is local and c is local
        int sub1=this.a-c;
        System.out.println("sub is "+sub);
        System.out.println("sub1 is "+sub1);
    }
}
