package core.main;

import core.ascii.AsciiBase;
import core.ascii.AsciiDefault;

import java.util.ArrayList;
import java.util.Scanner;

public class Game
{
    /**
     * Launch program as Game
     *
     * @param args  the program's options if any
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> asciiTab = new ArrayList<>();
        System.out.print("Width: ");
        int width = in.nextInt();
        in.nextLine();
        System.out.print("Height: ");
        int height = in.nextInt();
        in.nextLine();
        System.out.print("Text: ");
        String text = in.nextLine().toUpperCase();

        text = transformText(text);
        if ((width == 4 && height == 5) || (width == 7 && height == 10)) {
            for (int i = 0; i < height; i++) {
                for (char c : text.toCharArray()) {
                    AsciiBase letter;
                    try {
                        if (c == '?')
                            letter = new AsciiDefault();
                        else
                            letter = (AsciiBase)Class.forName("core.ascii.Ascii" + c).newInstance();
                    } catch (Exception e) {
                        System.out.println("Can't load class");
                        return;
                    }
                    if (i >= asciiTab.size()) {
                        asciiTab.add(width == 4 ? letter.printAsciiPattern1().get(i) : letter.printAsciiPattern2().get(i));
                    } else {
                        asciiTab.set(i, asciiTab.get(i) + (width == 4 ? letter.printAsciiPattern1().get(i) : letter.printAsciiPattern2().get(i)));
                    }
                }
            }
            for (String line : asciiTab) {
                System.out.println(line);
            }
        } else {
            System.out.println("Incorrect width and/or height !");
        }

    }

    /**
     * Checks whether the string contains only letters or not and changes every non letter to a ?
     *
     * @param text  the string to test
     * @return      the modified string (replacing all characters that is not a letter by ?
     */
    public static String transformText(String text) {
        return text.replaceAll("[^A-Za-z]", "?");
    }
}
