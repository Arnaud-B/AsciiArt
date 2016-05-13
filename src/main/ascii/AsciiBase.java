package main.ascii;

import java.util.ArrayList;

public class AsciiBase {
	
    protected char realName;
    protected static int height;
    protected static int width;
    protected ArrayList<String> pattern1;
    protected ArrayList<String> pattern2;

    public ArrayList<String> printAsciiPattern1() {
        return pattern1;
    }

    public ArrayList<String> printAsciiPattern2() {
        return pattern2;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        AsciiBase.height = height;
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        AsciiBase.width = width;
    }
}
