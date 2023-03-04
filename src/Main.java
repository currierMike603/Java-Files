import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String baseChar;
        String headChar;

        baseChar = scnr.nextLine();
        headChar = scnr.nextLine();

        System.out.println("     " + headChar);
        System.out.println("     " + headChar + headChar);
        System.out.print(baseChar + baseChar + baseChar + baseChar + baseChar);
        System.out.println(headChar + headChar + headChar);
        System.out.print(baseChar + baseChar + baseChar + baseChar + baseChar);
        System.out.println(headChar + headChar + headChar + headChar);
        System.out.print(baseChar + baseChar + baseChar + baseChar + baseChar);
        System.out.println(headChar + headChar + headChar);
        System.out.println("     " + headChar + headChar);
        System.out.println("     " + headChar);
    }
}