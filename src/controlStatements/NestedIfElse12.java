package controlStatements;

public class NestedIfElse12 {
    static void main(String[] args) {
        //outer if username is correct-->enter password
        //if password is correct-->login successful-->inbox
        //else password is incorrect-->enter valid password
        //outer else username is incorrect-->enter valid userName
        String userName="pradnya";
        String password="pra@1231";
        if(userName=="pradnya")
        {
            System.out.println("enter password");
            if(password=="pra@123")
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
            System.out.println("enter valid username");
        }
    }
}
