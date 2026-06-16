package arrayStudy;

public class Sample1 {
    static void main(String[] args) {
        int test[][] = new int[2][2]; //declaration part
        //initialization part
        test[0][0] = 10;
        test[0][1] = 15;
        test[1][0] = 20;
        test[1][1] = 25;
        //System.out.println(test[1][0]);
        //outer for loop for rows
        for (int i = 0; i <= 1; i++)
        {
            //inner for loop for column
            for (int j = 0; j <= 1; j++)
            {
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("============demo 2 by 4 matrix============");

        int demo[][]={{2,3,4,5},{6,7,8,9}};
        //outher loop for rows
        for(int i=0;i<=demo.length-1;i++)
        {
            for(int j=0;j<=demo[i].length-1;j++)
            {
                System.out.print(demo[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===========subject 2 by 4 matrix==============");


        String subject[][]={{"eng","maths","marathi","pe"},{"evs","cca","be","gk"}};
        for(int i=0;i<=subject.length-1;i++)
        {
            for(int j=0;j<=subject[i].length-1;j++)
            {
                System.out.print(subject[i][j]+" ");
            }
            System.out.println();
        }

    }
}