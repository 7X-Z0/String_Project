import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner userName = new Scanner(System.in);
        System.out.println("You must enter a username to continue...");

        String Name = userName.nextLine();
        System.out.println("User " + Name + " is valid !");

        String theory = "  I love Java coding  ";

        System.out.println("=====================================================");
        System.out.println("LETS CREATE SOME STRING THEORY FUN!!!!");
        System.out.println(theory.charAt (9));
        System.out.println(theory.substring (21,28));
        System.out.println(theory.length());
        System.out.println(theory.indexOf('i'));
        System.out.println(theory.toUpperCase());
        System.out.println(theory.toLowerCase());
        System.out.println(theory.contains("The"));
        System.out.println(theory.trim());
        System.out.println("=====================================================");

        userName.close();
    }
}
