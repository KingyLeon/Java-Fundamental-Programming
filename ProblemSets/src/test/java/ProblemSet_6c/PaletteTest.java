package ProblemSet_6c;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaletteTest {

    @Test
    public void testAddColourMix() {
	Palette p1 = new Palette();
	p1.addColour(P_COLOUR.RED);
	p1.addColour(P_COLOUR.YELLOW);
	assertEquals("ORANGE", p1.mixColours());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPalette() {
	P_COLOUR[] colourArray = new P_COLOUR[] { P_COLOUR.BLUE, P_COLOUR.YELLOW, P_COLOUR.RED, null };
	Palette p2 = new Palette(colourArray);

    }

    @Test
    public void testPaletteColourArrayMix() {
	P_COLOUR[] colourArray = new P_COLOUR[] { P_COLOUR.BLUE, P_COLOUR.YELLOW, null };
	Palette p2 = new Palette(colourArray);
	assertEquals("GREEN", p2.mixColours());
    }

    @Test
    public void testPaletteDisplay() {
	P_COLOUR[] colourArray = new P_COLOUR[] { P_COLOUR.BLUE, P_COLOUR.YELLOW, null };
	Palette p2 = new Palette(colourArray);
	assertEquals("BLUE, YELLOW = GREEN", p2.display());
    }

    @Test
    public void testPaletteMix() {
	Palette p1 = new Palette();
	assertEquals("", p1.mixColours());
    }

}
