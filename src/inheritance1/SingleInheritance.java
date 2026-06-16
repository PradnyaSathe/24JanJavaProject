package inheritance1;

public class SingleInheritance {
    static void main(String[] args) {
        Mother mother=new Mother();
        mother.property();
        Mother.nature();
        Son son=new Son();
        son.weight();
        Son.hobbies();
        Son.nature();
    }
}
