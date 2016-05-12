package core.main;

import java.util.ArrayList;

public class Game
{
    private int width;
    private int height;
    private ArrayList<String> asciiTab;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0 && width < 30) {
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0 && height < 30) {
            this.height = height;
        }
    }

    public ArrayList<String> getAsciiTab() {
        return asciiTab;
    }

    public void setAsciiTab(ArrayList<String> asciiTab) {
        this.asciiTab = asciiTab;
    }
}
