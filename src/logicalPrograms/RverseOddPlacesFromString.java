package logicalPrograms;

public class RverseOddPlacesFromString {
    static void main(String[] args) {
        String s="java selenium testing course";
        String[] a=s.split(" ");
        String rev="";
        for(int i=a.length-1;i>=0;i--)
        {
            if(i%2!=0)
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
