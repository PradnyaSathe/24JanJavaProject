package logicalPrograms;

public class ReversOddPlacesFromString12 {
    static void main(String[] args) {
        String s1="never lose your hope be patient";
        String[] a=s1.split(" ");
        System.out.println(a[3]);
        String rev="";

        for(int i=0;i<=a.length-1;i++)
        {
            if(i%2==0 && i!=0)
            {
               String temp=a[i];
               for(int j=temp.length()-1;j>=0;j--)
               {
                   char t=temp.charAt(j);
                   rev=rev+t;
               }
               a[i]=rev;
               rev="";
            }
        }
        for(int k=0;k<=a.length-1;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
