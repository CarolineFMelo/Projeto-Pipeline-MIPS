package stages;

import functions.PC;

public class IF {
	
	public static String[] readingInstruction(String line) {
		PC.setPc(PC.getPc()+1);
		String[] op = line.split("\\s");
		System.out.println("PC: " + PC.getPc());
		return op;
	}
	
}
