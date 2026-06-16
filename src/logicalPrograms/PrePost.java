package logicalPrograms;

public class PrePost {
    static void main(String[] args) {
        int a=10;
        int b=20;
        int c=a++;//post increment
        System.out.println(a);
        System.out.println(c);
        int d=++b;//pre increments
        System.out.println(b);
        System.out.println(d);
    }
}
