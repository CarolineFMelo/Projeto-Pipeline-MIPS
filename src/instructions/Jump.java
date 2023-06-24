package instructions;

import functions.Conversion;

public class Jump {

	public void j(String[] ins) {
		String op = ins[0];
		Integer target = Integer.parseInt(ins[1]);
		//System.out.println("op: " + op + " target: " + target );
		
		String opBinary = "000010";
		String targetBinary = Conversion.intToBinaryString(target, 26);
		System.out.println("Opcode instruction: " + opBinary + " " + targetBinary);
	}
	
}
