package stringStudy;

public class StringChar {
    static void main(String[] args) {
        String s="pune";
        char s1=s.charAt(3);
        System.out.println(s1);

        //endwith
        String e="testing";
        boolean e1=e.endsWith("te");
        System.out.println(e1);

        //startwith
        String r="selenium";
        boolean r1=r.startsWith("iu");
        System.out.println(r1);

        //substring
        String y="velocity testing center";
        String y1=y.substring(9);
        System.out.println(y1);
        String y2=y.substring(9,16);
        System.out.println(y2);

        //concat
        String u="java";
        String u1="testing";
       // String u2=u.concat(u1);
       // System.out.println(u2);
        String u2=(u.concat(" ").concat(u1));
        System.out.println(u2);

        //indexof
        String t="selenium";
        int t2=t.indexOf('i');
        System.out.println(t2);
        int t3=t.indexOf('e',0);
        System.out.println(t3);

        String a="pune";
        int a2=a.length()-1;
        System.out.println(a2);

        String b="pradnya";
        String b2=b.toUpperCase();
        System.out.println(b2);

        String c="PUNE";
        String c2=c.toLowerCase();
        System.out.println(c2);

        String d="pune";
        String d1="Pune";
        boolean d2=d.equalsIgnoreCase(d1);
        System.out.println(d2);

       String o="katraj";
       boolean o1=o.contains("ak");
        System.out.println(o1);

        String v=" ";
        boolean v1=v.isEmpty();
        System.out.println(v1);

        String n="  ";
        boolean n1=n.isBlank();
        System.out.println(n1);

        String p="velocity";
        char p1=p.charAt(7);
        System.out.println(p1);




    }

    }


