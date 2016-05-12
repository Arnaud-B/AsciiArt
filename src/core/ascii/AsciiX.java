package core.ascii;


import java.util.ArrayList;

public class AsciiX extends AsciiBase
{
    public AsciiX() {
        this.realName = 'X';
        this.pattern1 = generatePattern1();
    }

    public ArrayList<String> generatePattern1() {
        ArrayList<String> result = new ArrayList<>();
        result.add("# # ");
        result.add("# # ");
        result.add(" #  ");
        result.add("# # ");
        result.add("# # ");
        return result;
    }

    public ArrayList<String> generatePattern2() {
        ArrayList<String> result = new ArrayList<>();
        result.add("#    # ");
        result.add("#    # ");
        result.add("#    # ");
        result.add(" #  # ");
        result.add("  ##  ");
        result.add("  ##   ");
        result.add(" #  #  ");
        result.add("#    # ");
        result.add("#    # ");
        result.add("#    # ");
        return result;
    }
}
