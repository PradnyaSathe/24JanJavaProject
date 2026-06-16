package logicalPrograms;

public class Nested123 {
    static void main(String[] args) {
        //outer if username is correct-->enter password
        //inner if password is correct-->login successful
        //inner else  password incorrect-->enter correct password
        //outer else-->enter correct username
        String username="pradnya";
        String password="pra123";
        if(username=="pradnya")
        {
            System.out.println("enter password");
            if(password=="pra123")
            {
                System.out.println("login successful");
            }
            else
            {
                System.out.println("enter correct password");
            }
        }
        else
        {
            System.out.println("enetr correct username");
        }
    }
}
