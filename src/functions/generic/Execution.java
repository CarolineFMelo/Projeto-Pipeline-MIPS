package functions.generic;

import java.util.ArrayList;
import functions.stages.EX;
import functions.stages.ID;
import functions.stages.IF;
import functions.stages.MEM;

public class Execution {
	
	IF exe1 = new IF();
	ID exe2 = new ID();
	EX exe3 = new EX();
	MEM exe4 = new MEM();
	
	ArrayList<String> instructions = new ArrayList<String>();
	
	public void execution() {
		ArrayList<String> data = FileManager.stringReader("./resources/data/archive.txt");
		
		while(PC.getPc() < data.size()) {
			data.set(PC.getPc(),data.get(PC.getPc()).replace("$lo", "$33"));
			data.set(PC.getPc(),data.get(PC.getPc()).replace("$hi", "$32"));
			
			String[] stage1 = exe1.readingInstruction(data.get(PC.getPc()));
			Integer[] stage2 = exe2.decodeInstruction(stage1);
			Integer[] stage3 = exe3.executeInstruction(stage2);
			if(PC.getPc() == data.size()) break;
			exe4.memoryAccess(stage3);
		}
	}
	
}
