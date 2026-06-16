package starPatternStudy;

public class Pattern1 {
    static void main(String[] args) {
      //  *****
      //  *****
      //  *****
        int row=3;
        int col=5;

        //outer loop====> row
        for(int i=1;i<=row;i++)
        {
            //inner loop for column
        for(int j=1;j<=col;j++)
        {
            System.out.print("*");
        }
            System.out.println();
        }
    }
}