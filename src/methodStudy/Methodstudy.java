package methodStudy;

public class Methodstudy {
    static void main(String[] args) {
        study();
        Methodstudy methodstudy = new Methodstudy();
        methodstudy.study1();
        study3(30, 3);
        methodstudy.study4("pradnya",90,66.90f);
    }

    public static void study() {
        int a = 30;
        int b = 40;
        int sum = a + b;
        System.out.println("sum is " + sum);
    }

    public void study1() {
        int a = 50;
        int b = 3;
        int mul = a * b;
        System.out.println("mul is " + mul);
    }

    public static void study3(int a, int b) {
        int div = a / b;
        System.out.println("div is " + div);
    }

    public void study4(String name,int rollNum,float marks)
    {
        System.out.println(name);
        System.out.println(rollNum);
        System.out.println(marks);
    }
}