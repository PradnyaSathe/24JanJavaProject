package loops;

public class LoopStat1 {
    static void main() {
        int a=10;
        int b=20;
        //post increment
         int c=a++;//in post increment first value of a assign to the c then incremented by 1
        System.out.println("c" +c);
        System.out.println("a" +a);

        //pre increment
        int d=++b;//in pre increment first value will be increases by 1 then assign to the d
        System.out.println("d" +d);
        System.out.println("b" +b);
    }
}
