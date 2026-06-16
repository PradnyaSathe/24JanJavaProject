package controlStatements;

public class ElesIfStudy34 {
    static void main(String[] args) {
        //A,E,I,O,U--->vowels
        //non of above-->consonants
        char input='Z';
        if(input=='A' || input=='E' || input=='I' || input=='O' || input=='U')
        {
            System.out.println("given characters is vowels");
        }
        else
        {
            System.out.println("given characters are consonants");
        }
    }
}
