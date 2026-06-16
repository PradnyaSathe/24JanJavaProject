package methodStudy;

public class NonStatic2 {
    static void main() {
        //first I creat the object of the another class
        //ClassName objectName=new ClassName();
        NonStatic1 nonStatic1=new NonStatic1();
        //now I calling non static method e.g objectName.methodname();
        nonStatic1.a();
        NonStatic1.sub();
        nonStatic1.addition();
        nonStatic1.mul();
        NonStatic1.div();
    }
}
