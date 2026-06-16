package logicalPrograms;

public class CountWorld2 {
    static void main(String[] args) {
        String r="software testing selenium java 2026";
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

