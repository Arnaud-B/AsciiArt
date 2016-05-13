package main.ascii;


import java.util.ArrayList;

public class AsciiC extends AsciiBase
{
    public AsciiC() {
        this.realName = 'C';
        this.pattern1 = generatePattern1();
        this.pattern2 = generatePattern2();
    }

    public ArrayList<String> generatePattern1() {
        ArrayList<String> result = new ArrayList<>();
        result.add(" ## ");
        result.add("#   ");
        result.add("#   ");
        result.add("#   ");
        result.add(" ## ");
        return result;
    }

    public ArrayList<String> generatePattern2() {
        ArrayList<String> result = new ArrayList<>();
        result.add("  #### ");
        result.add(" #     ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add(" #     ");
        result.add("  #### ");
        return result;
    }
}
