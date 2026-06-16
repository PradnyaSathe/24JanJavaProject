package methodParameter;

public class MethodReuse {
    static void main(String[] args){
//ClassName objectName=new ClassName();
//after that we calling the method
//
// e.g objectName.methodName();
        MethodReuse methodReuse=new MethodReuse(); // this is object creation
        methodReuse.addition();//method without parameters
        methodReuse.addition(4,8);
        //I have declare method with parameter ones e.g (int a, int b) and run in main method many times with diff values
        methodReuse.addition(5,9);
        methodReuse.addition(10,35);
    }
    public void addition()
   // this is a method without  parameters non static method
   // in the round bracket where there is no any parameter is assign called zero parameter method
    {
       int a=3;
       int b=4;
       int sum=a+b;
       System.out.println("sum is "+sum);
    // so this non-static method that's why we creat object in main method first
    }
    //now here we add parameters how: we add parameters within the round bracket of the method
    public void addition(int a, int b) //
    {
     int sum=a+b;
     System.out.println("sum is "+sum);
    }
}
