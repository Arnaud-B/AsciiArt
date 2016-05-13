package test;

import core.ascii.AsciiBase;
import core.ascii.AsciiE;
import core.main.Game;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestAsciiArt
{
    @Before
    public void testPrintPattern() {
        Game.getRandomPattern();
        Game.printPattern();
    }

    @Test
    public void testLetterE() {
        AsciiE e = new AsciiE();
        ArrayList<String> letterE;
        if (AsciiBase.getWidth() == 4) {
            letterE = e.printAsciiPattern1();
        } else {
            letterE = e.printAsciiPattern2();
        }
        Assert.assertEquals(letterE, Game.generateAsciiArt("E"));
    }
}