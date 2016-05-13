package main.core;

import java.util.ArrayList;

import main.ascii.AsciiBase;
import main.ascii.AsciiDefault;

public class Game
{
    static ArrayList<String> asciiTab = new ArrayList<>();
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    /**
     * Launch program as Game
     *
     * @param args  the program's options if any
     */
    public static void main(String[] args) {
        getRandomPattern();
        printPattern();
        System.out.println(alphabet);
        generateAsciiArt(alphabet);
        printAsciiArt();
    }

    public static void getRandomPattern() {
        if ((int)(Math.random() + 0.5) == 0) {
            AsciiBase.setWidth(4);
            AsciiBase.setHeight(5);
        } else {
            AsciiBase.setWidth(7);
            AsciiBase.setHeight(10);
        }
    }

    public static void printPattern() {
    	System.out.println("Width : " + AsciiBase.getWidth());
    	System.out.println("Height : " + AsciiBase.getHeight());
    }

    public static ArrayList<String> generateAsciiArt(String text) {
        text = transformText(text);
        for (int i = 0; i < AsciiBase.getHeight(); i++) {
            for (char c : text.toCharArray()) {
                AsciiBase letter;
                try {
                    if (c == '?')
                        letter = new AsciiDefault();
                    else
                        letter = (AsciiBase)Class.forName("core.ascii.Ascii" + c).newInstance();
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

    public static void printAsciiArt() {
        for (String line : asciiTab) {
            System.out.println(line);
        }
        System.out.println();
        asciiTab.clear();
    }

    /**
     * Checks whether the string contains only letters or not and changes every non letter to a ?
     *
     * @param text  the string to test
     * @return      the modified string (replacing all characters that is not a letter by ?
     */
    public static String transformText(String text) {
        return text.replaceAll("[^A-Z]", "?");
    }
}
