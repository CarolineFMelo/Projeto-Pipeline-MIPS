package functions;

import java.util.ArrayList;

import stages.*;

public class ProgramExecution {

	public static void main(String args[]) {
		
		IF exe1 = new IF();
		ID exe2 = new ID();
		EX exe3 = new EX();
		MEM exe4 = new MEM();
		
		ArrayList<String> instruction = new ArrayList<String>();
		
		ArrayList<String> data = FileManager.stringReader("./resources/data/teste.txt");
		for(int i = PC.getPc(); i < data.size(); i++) {
			String[] stage1 = exe1.readingInstruction(data.get(i));
			Integer[] stage2 = exe2.decodeInstruction(stage1);
			Integer[] stage3 = exe3.executeInstruction(stage2);
			exe4.memoryAccess(stage3);
		}

	}
	
}
