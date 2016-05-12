package core.ascii;


import java.util.ArrayList;

public class AsciiL extends AsciiBase
{
    public AsciiL() {
        this.realName = 'L';
        this.pattern1 = generatePattern1();
        this.pattern2 = generatePattern2();
    }

    public ArrayList<String> generatePattern1() {
        ArrayList<String> result = new ArrayList<>();
        result.add("#   ");
        result.add("#   ");
        result.add("#   ");
        result.add("#   ");
        result.add("### ");
        return result;
    }

    public ArrayList<String> generatePattern2() {
        ArrayList<String> result = new ArrayList<>();
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("###### ");
        return result;
    }
}
