package console;

public class Task15 {
    public static void main(String[] args) {
        String source =  "+!?";
        for (int i = 0; i < source.length(); i++) {
            for (int j = 0; j < source.length(); j++) {
                System.out.print(source.charAt(0));
            }
            System.out.print(source.charAt(0));
            System.out.print(source.charAt(1));
        }
    }
}
