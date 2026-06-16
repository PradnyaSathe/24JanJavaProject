package math1;

public class MathOp1 {
    static void main(String[] args) {
        MathOp1 mathOp1 = new MathOp1();
        mathOp1.findMax(20, 30);
        mathOp1.findMax(100,200);
        mathOp1.findMax(800,400);
    }

    public void findMax(int a, int b) {
        if (a > b)
            System.out.println("greater value is " + a);
        else
            System.out.println("greater value is "+b);

    }
}