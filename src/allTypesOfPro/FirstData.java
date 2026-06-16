package allTypesOfPro;

public class FirstData {
    static void main(String[] args) {
        test("pradnya", 59, 'A');
        FirstData firstData = new FirstData();
        firstData.test1();
        evenOdd(20,7);
    }

    public static void test(String name, int rollNum, char grade) {
        System.out.println("my name is " + name);
        System.out.println("my rollNum is " + rollNum);
        System.out.println("my grade is " + grade);
    }

    public void test1() {
        int a = 50;
        int b = 50;
        int sum = a + b;
        System.out.println("sum is " + sum);
    }

    public static void evenOdd(int a, int b) {
        String num;
        if (a % 2 == 0 && b % 2 == 0)
        {
            System.out.println("num is even");
        }
        else
        {
            System.out.println("num is odd");
        }
    }
}