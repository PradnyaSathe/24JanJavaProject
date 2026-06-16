package PracticePrograms12;

public class FindDuplicateElementsInArray {
    static void main(String[] args) {

        int ar[] = {1, 2, 2, 1, 3, 4, 5, 5, 6, 7, 8};
        int count = 0;
        for (int i=0;i<=ar.length-1;i++)
        {
            for(int j=i+1;j<=ar.length-1;j++)
            {
                if(ar[i]==ar[j])
                {
                    System.out.println(ar[i]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}