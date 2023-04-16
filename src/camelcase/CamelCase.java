package camelcase;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println("Введите произвольну фразу: ");
        Scanner sc = new Scanner(System.in);
        String desc = sc.nextLine();
        desc = desc.toLowerCase();
        String camelCase = "" + desc.charAt(0);
        for (int i = 1; i < desc.length(); i++) {
            char letter = desc.charAt(i);
            if (letter == ' ') {
                continue;
            } else if (desc.charAt(i - 1) == ' ') {
                camelCase = camelCase + Character.toUpperCase(letter);
            } else {
                camelCase = camelCase + letter;
            }
        }
        System.out.println("Фраза camelCase: " );
        System.out.println(camelCase);
    }
}
