package main.core;

//import java.util.Scanner;
import java.util.Random;


// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
public class User
{
    
    /**
	 * Launch program as User.
	 *
	 * @param args
	 *            the program's options if any
	 */
    public static void main(String[] args) { 
    	//Scanner in = new Scanner(System.in);
    	//System.out.print("Text: ");
    	//String text = in.nextLine();
    	String text = GenerateRandStr(); 	
        Game.getRandomPattern();
        Game.printPattern();
        System.out.println(text);
        Game.generateAsciiArt(Game.alphabet);
        Game.printAsciiArt();
        Game.generateAsciiArt(text);
        Game.printAsciiArt();
    }
    
    
    /**
	 * Generate rand string.
	 *
	 * @return string
	 */
    public static String GenerateRandStr() {
    	char[] chars = "abcdefghijklmnopqrstuvwxyz@יטאש.,;:!?".toCharArray();
    	StringBuilder sb = new StringBuilder();
    	Random random = new Random();
    	Random rn = new Random();
    	int numStr = rn.nextInt(20) + 1;
    	for (int i = 0; i < numStr; i++) {
    	    char c = chars[random.nextInt(chars.length)];
    	    sb.append(c);
    	}
    	String text = sb.toString();
		return text;
    }
    
}
