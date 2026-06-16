package interfaceStudy;

public class Son implements Father,Mother {
    static void main(String[] args) {
        Son son = new Son();
        son.hardWork();
        son.honesty();
        son.look();
        son.nature();
    }
        @Override
        public void hardWork() {
            System.out.println("father hardwork");
        }
        @Override
        public void honesty() {
            System.out.println("father honesty");
        }
        @Override
        public void nature() {
            System.out.println("mother nature");
        }
        @Override
        public void look() {
            System.out.println("mother look");
        }
    }

