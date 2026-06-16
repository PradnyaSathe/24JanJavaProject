package methodStudy;

public class NonStaticMethod {
    static void main(String[] args) {
        //how to creat 'Object'
        //ClassName objectName=new ClassName();
        NonStaticMethod nonStaticMethod=new NonStaticMethod();
        //this is object creation
        //now call non static method first write objectName.methodName();
        nonStaticMethod.b();
    }
    //how to creat non-static method
    // The method in which 'static' word is not present that method is called non-static regular method
    public void b() //method declaration
                    //this is non static method
    {
        System.out.println("this is non static regular method");
    }
    //In nonstatic method first you should creat 'Object'
    //object is always created into main method
}


