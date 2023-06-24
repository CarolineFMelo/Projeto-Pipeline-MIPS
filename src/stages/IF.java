package stages;

public class IF {
	
	Integer pc = -1;
	
	public String[] readingInstruction(String line) {
		pc++;
		String[] op = line.split("\\s");
		System.out.println("PC: " + pc);
		return op;
	}
	
}
