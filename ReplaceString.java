package week6.day11and12;

public class ReplaceString {

	public static void main(String[] args) {
		String txt = " aa  bbbbb   cc   d   ";
		System.out.println(txt.replaceAll("\\s+", " ").replaceAll("\\s+$", ""));
		//("\\s+", " ") replaces all spaces(1 or more) with only one space
		//("\\s+$", "") removes the trailing spaces.
	}

}
