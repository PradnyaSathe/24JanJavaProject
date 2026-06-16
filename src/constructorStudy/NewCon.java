package constructorStudy;

public class NewCon {
    int a=4;// variable declaration, this is globle variables
    int b=100;//variable declaration, this is globle variables
    static void main(String[] args) {
 NewCon newCon=new NewCon();
 newCon.add();
 NewCon newCon1=new NewCon(100,600);//this is object of two parameter constructor
         //and here we have to assign value of the parameters
  newCon1.add();
  newCon1.D();
    }
    public void add() //this non-static method and its variables declared as a globle variable
    {
        int sum=a+b;
        System.out.println("sum is "+sum);//now we creat object into main method first
    }
    public NewCon() //this is user defined constructor with zero parameter
     {
        a=100;
        b=200;//it doesn't need to assign data type here bcoz we have already created
    }
    public NewCon(int x,int y)//this is two parameters constructor
    //here we have to creat new object for this two parameter constructor
    {
      a=x;
      b=y;
      int sum=x+y;
    }
    public void D()
    {
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
    }
}
