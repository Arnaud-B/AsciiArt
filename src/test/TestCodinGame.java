package test;

import main.ascii.AsciiBase;
import main.core.Game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * The Class TestCodinGame.
 */
public class TestCodinGame
{
    private ArrayList<String> expectedAsciiManhattan = new ArrayList<>();

    /**
	 * Sets the program to use the first pattern.
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
     * Sets the expected ASCII Art for CodinGame's testing string "MANHATTAN" with the first pattern (4 by 5)
     */
    public void generateExpectedAsciiManhattan() {
        this.expectedAsciiManhattan.clear();
        this.expectedAsciiManhattan.add("# #  #  ### # #  #  ### ###  #  ### ");
        this.expectedAsciiManhattan.add("### # # # # # # # #  #   #  # # # # ");
        this.expectedAsciiManhattan.add("### ### # # ### ###  #   #  ### # # ");
        this.expectedAsciiManhattan.add("# # # # # # # # # #  #   #  # # # # ");
        this.expectedAsciiManhattan.add("# # # # # # # # # #  #   #  # # # # ");
    }

    /**
     * Tests only one letter: E
     */
    @Test
    public void testLetterE() {
        ArrayList<String> letterE = new ArrayList<>();
        letterE.add("### ");
        letterE.add("#   ");
        letterE.add("##  ");
        letterE.add("#   ");
        letterE.add("### ");
        assertEquals(letterE, Game.generateAsciiArt("E"));
    }

    /**
	 * Tests "MANHATTAN" all uppercase.
	 */
    @Test
    public void testManhattanUppercase() {
        generateExpectedAsciiManhattan();
        assertEquals(this.expectedAsciiManhattan, Game.generateAsciiArt("MANHATTAN"));
    }

    /**
     * Tests "ManhAtTan" uppercase and lowercase mixed
     */
    @Test
    public void testManhattanUpperLower() {
        generateExpectedAsciiManhattan();
        assertEquals(this.expectedAsciiManhattan, Game.generateAsciiArt("ManhAtTan"));
    }

    /**
     * Tests "M@NH@TT@N" using special characters that should be replaced by "?"
     */
    @Test
    public void testManhattanSpecialChar() {
        this.expectedAsciiManhattan.clear();
        this.expectedAsciiManhattan.add("# # ### ### # # ### ### ### ### ### ");
        this.expectedAsciiManhattan.add("###   # # # # #   #  #   #    # # # ");
        this.expectedAsciiManhattan.add("###  ## # # ###  ##  #   #   ## # # ");
        this.expectedAsciiManhattan.add("# #     # # # #      #   #      # # ");
        this.expectedAsciiManhattan.add("# #  #  # # # #  #   #   #   #  # # ");
        assertEquals(this.expectedAsciiManhattan, Game.generateAsciiArt("M@NH@TT@N"));
    }

    /**
     * Tests "MANHATTAN" using the second pattern (7 by 10)
     */
    @Test
    public void testManhattanPattern2() {
        AsciiBase.setWidth(7);
        AsciiBase.setHeight(10);
        this.expectedAsciiManhattan.clear();
        this.expectedAsciiManhattan.add("#    #   ##   ###### #    #   ##   ###### ######   ##   ###### ");
        this.expectedAsciiManhattan.add("##  ##  #  #  #    # #    #  #  #  ###### ######  #  #  #    # ");
        this.expectedAsciiManhattan.add("# ## # #    # #    # #    # #    #   ##     ##   #    # #    # ");
        this.expectedAsciiManhattan.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
        this.expectedAsciiManhattan.add("#    # ###### #    # ###### ######   ##     ##   ###### #    # ");
        this.expectedAsciiManhattan.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
        this.expectedAsciiManhattan.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
        this.expectedAsciiManhattan.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
        this.expectedAsciiManhattan.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
        this.expectedAsciiManhattan.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
        assertEquals(this.expectedAsciiManhattan, Game.generateAsciiArt("MANHATTAN"));
    }
}