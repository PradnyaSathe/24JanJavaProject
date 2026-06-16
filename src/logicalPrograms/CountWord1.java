package logicalPrograms;

public class CountWord1 {
    static void main(String[] args) {
        String r="java is easy";
        int count=0;

            if(r.length()!=0)
            {
                count=1;
                for(int i=0;i<=r.length()-1;i++)
                {
                    char t=r.charAt(i);
                    if(t==' ')
                    {
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
}
