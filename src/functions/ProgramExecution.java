package functions;

import java.util.ArrayList;

import stages.*;

public class ProgramExecution {

	public static void main(String args[]) {
		
		Integer registers[] = new Integer[34];
		Integer memory[] = new Integer[1001];
		
		IF exe1 = new IF();
		ID exe2 = new ID();
		
		ArrayList<String> data = FileManager.stringReader("./resources/data/teste.txt");
		for(String line : data) {
			String[] stage1 = exe1.readingInstruction(line);
			exe2.decodingInstruction(stage1);
		}

	}
	
}
