package castingStudy;

public class CastingNew {
    static void main(String[] args) {
        byte a=10;
        System.out.println(a);
        //primitive casting:1.implicit 2.explicite casting
        // implicite casting
        // lower data type to higher data type
        //byte is lower convert it into int
        int b=a;
        System.out.println(b);

        float c=a;
        System.out.println(c);

        //explicit casting
        //covert heigher to lower but it can be loss data

        double d=12.345;
        System.out.println(d);

       // short e=d;
       // System.out.println(e);
        //data loss bcoz of higher to lower conversion
    }
}
