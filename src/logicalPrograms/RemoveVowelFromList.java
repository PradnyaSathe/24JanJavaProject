package logicalPrograms;

import java.util.Scanner;

public class RemoveVowelFromList {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter given string");
        String a1 = scanner.next();
        String output = "";
        int count = 0;
        String a = a1.toLowerCase();

        for (int i = 0; i <= a.length() - 1; i++) {
            char t = a.charAt(i);
            if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
                //count++;
                // System.out.println(t);
                continue;
            }
            output = output + t;
        }

        System.out.println(output);
    }
}


