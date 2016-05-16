package test;

import main.ascii.AsciiBase;
import main.core.Game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class TestUnit
{
    private ArrayList<String> asciiArray = new ArrayList<>();

    /**
     * Sets the program to use the first pattern
     */
    @Before
    public void testPrintPattern() {
        AsciiBase.setWidth(4);
        AsciiBase.setHeight(5);
    }

    /**
     * Clears the Game's ASCII ArrayList for the next test
     */
    @After
    public void testClearAscii() {
        Game.clearAsciiTab();
    }
    
    /**
     * Sets the expected ASCII Art for string "UPPERCASE" with the first pattern (4 by 5)
     */
    public void generateAsciiUppercase() {
	    this.asciiArray.add("# # ##  ##  ### ##   ##  #   ## ### ");
	    this.asciiArray.add("# # # # # # #   # # #   # # #   #   ");
	    this.asciiArray.add("# # ##  ##  ##  ##  #   ###  #  ##  ");
	    this.asciiArray.add("# # #   #   #   # # #   # #   # #   ");
	    this.asciiArray.add("### #   #   ### # #  ## # # ##  ### ");
    }

    /**
     * Tests only one specialChar
     */
    @Test
    public void testSpecialChar() {
        ArrayList<String> specialChar = new ArrayList<>();
        specialChar.add("### ");
        specialChar.add("  # ");
        specialChar.add(" ## ");
        specialChar.add("    ");
        specialChar.add(" #  ");
        assertEquals(specialChar, Game.generateAsciiArt(","));
    }

    /**
     * Tests uppercase
     */
    @Test
    public void testUppercase1() {
    	generateAsciiUppercase();
        assertEquals(this.asciiArray, Game.generateAsciiArt("UppERcASe"));
    }
    
    /**
     * Tests uppercase
     */
    @Test
    public void testUppercase2() {
    	generateAsciiUppercase();
        assertEquals(this.asciiArray, Game.generateAsciiArt("UPPERCASE"));
    }

    /**
     * Tests "ùpµ€rc@sé" using special characters that should be replaced by "?"
     */
    @Test
    public void testWordSpecialChar() {
        this.asciiArray.clear();
        this.asciiArray.add("### ##  ### ### ##   ## ###  ## ### ");
        this.asciiArray.add("  # # #   #   # # # #     # #     # ");
        this.asciiArray.add(" ## ##   ##  ## ##  #    ##  #   ## ");
        this.asciiArray.add("    #           # # #         #     ");
        this.asciiArray.add(" #  #    #   #  # #  ##  #  ##   #  ");
        assertEquals(this.asciiArray, Game.generateAsciiArt("ùpµ€rc@sé"));
    }

    /**
     * Tests "ùpµ€rc@sé" using special characters that should be replaced by "?" with the second pattern (7 by 10)
     */
    @Test
    public void testWordPattern2() {
        AsciiBase.setWidth(7);
        AsciiBase.setHeight(10);
        this.asciiArray.clear();
        this.asciiArray.add("###### ####   ###### ###### ###      #### ######  ##### ###### ");
        this.asciiArray.add("     # #   #       #      # #  #    #          # #           # ");
        this.asciiArray.add("     # #    #      #      # #   #  #           # #           # ");
        this.asciiArray.add("     # #    #      #      # #    # #           #  #          # ");
        this.asciiArray.add("     # #   #       #      # #   #  #           #   #         # ");
        this.asciiArray.add("  #### ####     ####   #### ####   #        ####    #     #### ");
        this.asciiArray.add("  #    #        #      #    #   #  #        #        #    #    ");
        this.asciiArray.add("  #    #        #      #    #    # #        #         #   #    ");
        this.asciiArray.add("       #                    #    #  #                 #        ");
        this.asciiArray.add("  #    #        #      #    #    #   ####   #     ####    #    ");
        assertEquals(this.asciiArray, Game.generateAsciiArt("ùpµ€rc@sé"));
    }
    
}
