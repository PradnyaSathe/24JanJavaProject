package castingStudy;

public class ClassCstingStudy {
    static void main(String[] args) {
        Father father=new Father();
        father.car();
        father.bike();

        Son son=new Son();
        son.bike();
        son.car();
        son.education();
    }
}
