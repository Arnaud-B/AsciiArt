package main.core;

import java.util.ArrayList;

import main.ascii.AsciiBase;
import main.ascii.AsciiDefault;

// TODO: Auto-generated Javadoc
/**
 * The Class Game.
 */
public class Game
{
    
    /** The ascii tab. */
    static ArrayList<String> asciiTab = new ArrayList<>();
    
    /** The alphabet. */
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    /**
	 * Launch program as Game.
	 *
	 * @param args
	 *            the program's options if any
	 */
    public static void main(String[] args) {
        getRandomPattern();
        printPattern();
        System.out.println(alphabet);
        generateAsciiArt(alphabet);
        printAsciiArt();
    }

    /**
	 * Sets a pattern randomly (4 by 5 or 7 by 10).
	 *
	 * @return the random pattern
	 */
    public static void getRandomPattern() {
        if ((int)(Math.random() + 0.5) == 0) {
            AsciiBase.setWidth(4);
            AsciiBase.setHeight(5);
        } else {
            AsciiBase.setWidth(7);
            AsciiBase.setHeight(10);
        }
    }

    /**
	 * Prints the pattern used to the screen.
	 */
    public static void printPattern() {
    	System.out.println("Width : " + AsciiBase.getWidth());
    	System.out.println("Height : " + AsciiBase.getHeight());
    }

    /**
	 * Generates The ASCII Art of the string passed.
	 *
	 * @param text
	 *            the string used to generate the ASCII Art
	 * @return the generated ASCII Art
	 */
    public static ArrayList<String> generateAsciiArt(String text) {
        text = transformText(text);
        for (int i = 0; i < AsciiBase.getHeight(); i++) {
            for (char c : text.toCharArray()) {
                AsciiBase letter;
                try {
                    if (c == '?')
                        letter = new AsciiDefault();
                    else
                        letter = (AsciiBase)Class.forName("main.ascii.Ascii" + c).newInstance();
                    if (i >= asciiTab.size()) {
                        asciiTab.add(AsciiBase.getWidth() == 4 ? letter.printAsciiPattern1().get(i) : letter.printAsciiPattern2().get(i));
                    } else {
                        asciiTab.set(i, asciiTab.get(i) + (AsciiBase.getWidth() == 4 ? letter.printAsciiPattern1().get(i) : letter.printAsciiPattern2().get(i)));
                    }
                } catch (Exception e) {
                    System.out.println("Can't load class");
                }
            }
        }
        return asciiTab;
    }

    /**
	 * Prints the ASCII Art generated to the screen.
	 */
    public static void printAsciiArt() {
        for (String line : asciiTab) {
            System.out.println(line);
        }
        System.out.println();
        clearAsciiTab();
    }

    /**
	 * Clears the last generated ASCII Art.
	 */
    public static void clearAsciiTab() {
        asciiTab.clear();
    }

    /**
	 * Checks whether the string contains only letters or not and changes every
	 * non letter to a "?".
	 *
	 * @param text
	 *            the string to test
	 * @return the modified string (replacing all characters that is not a
	 *         letter by "?")
	 */
    public static String transformText(String text) {
        text = text.toUpperCase();
        return text.replaceAll("[^A-Z]", "?");
    }
}
