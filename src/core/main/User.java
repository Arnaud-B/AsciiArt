package core.main;

import java.util.Scanner;

public class User
{

    /**
     * Launch program as User
     *
     * @param args  the program's options if any
     */
    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
         System.out.print("Text: ");
         String text = in.nextLine().toUpperCase();
         Game.getRandomPattern();
         Game.printPattern();
         System.out.println(text);
         Game.printAsciiArt(Game.alphabet);   
         Game.printAsciiArt(text);
    }
}
