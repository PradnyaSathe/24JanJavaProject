package stringStudy;

public class ContainsStudy {
    static void main(String[] args) {
        //5.contains()= it checks the sequence of the character
        //if correct result is true
        //if not then result is false
        String a="katraj";
        boolean a1=a.contains("ka");
        System.out.println(a1);
        boolean a2=a.contains("ja");
        System.out.println(a2);
        String a3="t";
        boolean a4=a3.contains("t");
        System.out.println(a4);

        //6.isEmpty()=if string is empty it show result true
        //if not then result false
        String b="";
        boolean b2=b.isEmpty();
        System.out.println(b2);
        String b3="t";
        boolean b4=b3.isEmpty();
        System.out.println(b4);

        //7.isBlank()=if string is empty or white space
        // it show result true otherwise flase
        String b5="     ";
        boolean b6=b5.isBlank();
        System.out.println(b6);

        //8.replace
         String c="pune";
         String c1=c.replace("ne","te");
        System.out.println(c1);
        String c3=c.replaceAll("pune","test");
        System.out.println(c3);

        String t="testingiin";
       // String t1=t.replaceAll("testing","engineering");
        String t2=t.replace("ing","png");
        System.out.println(t2);
        String t3=t.replaceFirst("in","uu");
       System.out.println(t3);
        String t4=t.replace("in","tt");
        System.out.println(t4);
        String t5=t.replace("in","tt");
        System.out.println(t5);


    }
}
