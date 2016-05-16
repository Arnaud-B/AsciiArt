package main.ascii;


import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class AsciiI.
 */
public class AsciiI extends AsciiBase
{
    
    /**
	 * Instantiates a new ascii i.
	 */
    public AsciiI() {
        this.realName = 'I';
        this.pattern1 = generatePattern1();
        this.pattern2 = generatePattern2();
    }

    /**
	 * Generate pattern1.
	 *
	 * @return the array list
	 */
    public ArrayList<String> generatePattern1() {
        ArrayList<String> result = new ArrayList<>();
        result.add("### ");
        result.add(" #  ");
        result.add(" #  ");
        result.add(" #  ");
        result.add("### ");
        return result;
    }

    /**
	 * Generate pattern2.
	 *
	 * @return the array list
	 */
    public ArrayList<String> generatePattern2() {
        ArrayList<String> result = new ArrayList<>();
        result.add("###### ");
        result.add("  ##   ");
        result.add("  ##   ");
        result.add("  ##   ");
        result.add("  ##   ");
        result.add("  ##   ");
        result.add("  ##   ");
        result.add("  ##   ");
        result.add("  ##   ");
        result.add("###### ");
        return result;
    }
}
