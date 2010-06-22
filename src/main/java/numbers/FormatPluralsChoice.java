package numbers;

import java.text.*;

/**
 * Format a plural correctly, using a ChoiceFormat.
 * @author Ian F. Darwin, http://www.darwinsys.com/
 * @version $Id$
 */
public class FormatPluralsChoice extends FormatPlurals {

	// ChoiceFormat to just give pluralized word
	static double[] limits = { 0, 1, 2 };
	static String[] formats = { "items", "item", "items"};
	static ChoiceFormat pluralizedFormat = new ChoiceFormat(limits, formats);

	// ChoiceFormat to give English text version, quantified
	static ChoiceFormat quantizedFormat = new ChoiceFormat(
		"0#no reviews|1#one review|1<many reviews");

	// Test data
	static int[] data = { -1, 0, 1, 2, 3 };

	public static void main(String[] argv) {
		System.out.println("Pluralized Format");
		for (int i : data) {
			System.out.println("Found " + i + " " + pluralizedFormat.format(i));
		}
		
		System.out.println("Quanitzed Format");
		for (int i : data) {
			System.out.println("Found " + quantizedFormat.format(i));
		}
	}
}
