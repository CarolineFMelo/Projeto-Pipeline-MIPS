package functions.stages;

import functions.generic.PC;

public class IF {
	
	public String[] readingInstruction(String line) {
		PC.setPc(PC.getPc()+1);
		String[] op = line.split("\\s");
		Integer aux = PC.getPc()-1;
		System.out.println("\nPC: " + aux);
		return op;
	}
	
}
