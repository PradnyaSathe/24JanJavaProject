package controlStatements;

public class NestedIfelse {
    static void main(String[] args) {
    //outer if username is correct-->enter password
    //inner if password is correct-->login successful-->inbox
    //inner else password incorrect-->enter valid password
    //outer else invalid username-->enter correct username
        String userName="pradnya";
        String password="pra@1234";
        if(userName=="pradnya")
        {
            System.out.println("enter password");
            if(password=="pra@1234")
            {
                System.out.println("login successful");
            }
            else
            {
                System.out.println("enter valid password");
            }
        }
        else
        {
            System.out.println("enter valid userName");
        }
    }
}
