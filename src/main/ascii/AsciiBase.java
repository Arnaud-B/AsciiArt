package main.ascii;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class AsciiBase.
 */
public class AsciiBase {
	
    /** The real name. */
    protected char realName;
    
    /** The height. */
    protected static int height;
    
    /** The width. */
    protected static int width;
    
    /** The pattern1. */
    protected ArrayList<String> pattern1;
    
    /** The pattern2. */
    protected ArrayList<String> pattern2;

    /**
	 * Prints the ascii pattern1.
	 *
	 * @return Ascii Pattern1
	 */
    public ArrayList<String> printAsciiPattern1() {
        return pattern1;
    }
    
    /**
	 * Prints the ascii pattern2.
	 *
	 * @return Ascii Pattern2
	 */
    public ArrayList<String> printAsciiPattern2() {
        return pattern2;
    }
    
    /**
	 * Gets the height.
	 *
	 * @return the height
	 */
    public static int getHeight() {
        return height;
    }

    
    /**
	 * Sets the height.
	 *
	 * @param height
	 *            the new height
	 */
    public static void setHeight(int height) {
        AsciiBase.height = height;
    }

    /**
	 * Gets the width.
	 *
	 * @return the width
	 */
    public static int getWidth() {
        return width;
    }

    /**
	 * Sets the width.
	 *
	 * @param width
	 *            the new width
	 */
    public static void setWidth(int width) {
        AsciiBase.width = width;
    }
}
