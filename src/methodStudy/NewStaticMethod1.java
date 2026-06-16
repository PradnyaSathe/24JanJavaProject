package methodStudy;

public class NewStaticMethod1 {
    static void main(String[] args) {
        test();
    }
    // I want to creat static regular method and I want to run this into same class
    // First creat static regular method
    public static void test() //this method declaration
    {
        System.out.println("this is static regular method"); // method body/definaion
        //now I want to run this method then first it need to call into the main method then it will run
        // how to call it ,first write it into main method e.g test();
    }

}
