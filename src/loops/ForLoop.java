package loops;

public class ForLoop {
    static void main(String[] args) {
        //syntax of For loop is (initialization; condition ; updation)
        //if I want to write table of 10 then
        //initialization=10 ; condition <=100 ; updation= variable+10

        for(int a=10 ; a<=100 ; a=a+10)
        {
            System.out.println(a);
        }

        //table of 10 in reverse order
        //initialization=100 ; condition >=10 ; updation= variable-10
     for(int b=100 ; b>=10 ; b=b-10)
     {
         System.out.println(b);
     }
    }
}
