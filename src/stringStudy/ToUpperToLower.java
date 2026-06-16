package stringStudy;

public class ToUpperToLower {
    static void main(String[] args) {

        String a = "testing";
        String a1 = a.toUpperCase();
        System.out.println(a1);

        String a2="pune";
        String a3=a2.toUpperCase();
        System.out.println(a3);

        String a4="PrAdnya";
        String a5=a4.toLowerCase();
        System.out.println(a5);

        String b1="pune";
        String b2="Pune";
        String b3="Java";
        String b4="my";
       // b1.equals(b2);
        System.out.println( b1.equals(b2));
        System.out.println( b1.equals(b3));
        boolean b5= b3.equals(b4);
        System.out.println(b5);
        boolean b6=b1.equalsIgnoreCase(b2);
        System.out.println(b6);


    }
}
