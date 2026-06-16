package logicalPrograms;

public class PrePostDecre {
    static void main(String[] args) {
        int a=5;
        int b=40;
        int c=a--;//post decrement
        System.out.println(c);
        System.out.println(a);
        int d=--b;
        System.out.println(d);
        System.out.println(b);
        int e=7;

        System.out.println(e++ + ++e);
        //logic is e++=first use value of e means 7 then incremented by 1 =8
        //++e=first value is incremented by 1 then used means
        //e++= 7 after ++ it is 8
        //now here value of e is 8 the incremented by 1 ++e= 9
        //e++ + ++e= 7 +9=16
    }
}
