package methodStudy;

public class NewStaticMethod {
    static void main(String[] args) {
     test();
     test1();
     //here we want to run regular static method from another class
     //first we write ClassName.methodName();
     NewStaticMethodAnother.a();
    }
    public static void test() // this is method declaration
    {
        System.out.println("hi all this is static test method");
    }
    // we can write multiple regular static method within one class but not within the main method
    //so if I want to run static regular method then first call that method into main method
    //e.g I want to run test method then first call it into main method then it will run
    public static void test1() // this is method declaration
    {
       System.out.println("hi my name is pradnya"); //method defination
    }
}

