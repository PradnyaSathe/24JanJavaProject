package PracticePrograms12;

public class RverseOddEvenPlacecFromString {
    static void main(String[] args) {
        String a="java selenium testing course";
        String[] a1=a.split(" ");
        String rev="";
        for(int i=0;i<=a1.length-1;i++)
        {
            if(i%2==0 && i!=0)
            {
                String temp=a1[i];
                for(int j=temp.length()-1;j>=0;j--)
                {
                    char t=temp.charAt(j);
                    rev= rev+t;
                }
                a1[i]=rev;
                rev="";
            }
        }
        for(int k=0;k<=a1.length-1;k++)
        {
            System.out.print(a1[k]+" ");
        }
    }
}
