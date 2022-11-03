package task_1;

/**
 * Assignment task 1: Formatted Output
 * Author: Aadil Imran, 2022
 */

import static java.lang.System.*;

public class Main {

	public static void main(String[] args) { 	
		String fmt1 = "%-20s%-30s\n"; //negative indicates left alignment. Numbers indicate min width of chars.
		out.printf(fmt1,"Escape sequence", "Description");
		out.println("-".repeat(35));
		String fmt2 = "%-20s%-15s\n";
		out.printf(fmt2,"\\n", "New line character");
		out.printf(fmt2,"\\t", "Horozontal tab character");
		out.printf(fmt2, "\\\"", "Double quote character");
		out.printf(fmt2, "\\b", "Backspace character");
	}
}
