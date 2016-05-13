package core.ascii;

import java.util.ArrayList;

public class AsciiBase {
	
    protected char realName;
    protected int height;
    protected int width;
    protected ArrayList<String> pattern1;
    protected ArrayList<String> pattern2;

    public ArrayList<String> printAsciiPattern1() {
        return pattern1;
    }

    public ArrayList<String> printAsciiPattern2() {
        return pattern2;
    }
}
