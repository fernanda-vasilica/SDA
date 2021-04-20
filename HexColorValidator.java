package Tema3_p1;

public abstract class HexColorValidator {

	public static Boolean validate(String colorHex) {

		if ((colorHex.charAt(0) == '#' && colorHex.length() == 7) == false) {
			return false;
		}
		for (int i = 1; i < colorHex.length(); i++) {

			if (((Character.getNumericValue(colorHex.charAt(i)) >= 0
					&& Character.getNumericValue(colorHex.charAt(i)) <= 9)
					|| (colorHex.charAt(i) >= 'a' && colorHex.charAt(i) <= 'f')) == false) {
				return false;
			}
		}

		return true;
	}
}
