package starPatternStudy;

public class Butterfly {
    static void main(String[] args)
    {
 //   *         *
//    **       **
//    ***     ***
//    ****   ****
//    ***** *****
//    ****   ****
//    ***     ***
//    **       **
 //   *         *
 int row=9;
 int star1=1;
 int space1=4;
 int space2=5;
 int star2=1;
 for(int i=1;i<=row;i++)
 {
     for(int j=1;j<=star1;j++)
     {
         System.out.print("*");
     }
     for(int k=1;k<=space1;k++)
     {
         System.out.print(" ");
     }
     for(int m=1;m<=space2;m++)
     {
         System.out.print(" ");
     }
     for(int l=1;l<=star2;l++)
     {
         System.out.print("*");
     }
     System.out.println();
     if(i<5)
     {
         star1++;
         star2++;
         space1--;
         space2--;
     }
     else{
         star1--;
         star2--;
         space1++;
         space2++;
     }
 }

    }
}
