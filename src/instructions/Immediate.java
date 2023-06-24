package instructions;

import functions.Conversion;

public class Immediate {
	
	public Integer[] bne(String[] ins) {
		String op = ins[0];
		Integer rs = Integer.parseInt(ins[1].substring(1, ins[1].length()-1));
		Integer rt = Integer.parseInt(ins[2].substring(1, ins[2].length()-1));
		Integer off = Integer.parseInt(ins[3]);
		//System.out.println("op: " + op + " rs: " + rs + " rt: " + rt + " offset: " + off);
		
		String opBinary = "000101";
		String rsBinary = Conversion.intToBinaryString(rs, 5);
		String rtBinary = Conversion.intToBinaryString(rt, 5);
		String offBinary = Conversion.intToBinaryString(off, 16);
		System.out.println("Opcode instruction: " + opBinary + " " + rsBinary + " " + rtBinary + " " + offBinary);
		
		Integer values[] = {1, rs, rt, off};
		
		return values;
	}

	public Integer[] beq(String[] ins) {
		String op = ins[0];
		Integer rs = Integer.parseInt(ins[1].substring(1, ins[1].length()-1));
		Integer rt = Integer.parseInt(ins[2].substring(1, ins[2].length()-1));
		Integer off = Integer.parseInt(ins[3]);
		//System.out.println("op: " + op + " rs: " + rs + " rt: " + rt + " offset: " + off);
		
		String opBinary = "000100";
		String rsBinary = Conversion.intToBinaryString(rs, 5);
		String rtBinary = Conversion.intToBinaryString(rt, 5);
		String offBinary = Conversion.intToBinaryString(off, 16);
		System.out.println("Opcode instruction: " + opBinary + " " + rsBinary + " " + rtBinary + " " + offBinary);
		
		Integer values[] = {2, rs, rt, off};
		
		return values;
	}
	
	public Integer[] lw(String[] ins) {
		String op = ins[0];
		Integer rt = Integer.parseInt(ins[1].substring(1, ins[1].length()-1));
		Integer off = Integer.parseInt(ins[2].substring(0, ins[2].indexOf('(')));
		Integer rs = Integer.parseInt(ins[2].substring(ins[2].indexOf('$')+1, ins[2].length()-1));
		//System.out.println("op: " + op + " rt: " + rt + " offset: " + off + " rs: " + rs);
		
		String opBinary = "100011";
		String rsBinary = Conversion.intToBinaryString(rs, 5);
		String rtBinary = Conversion.intToBinaryString(rt, 5);
		String offBinary = Conversion.intToBinaryString(off, 16);
		System.out.println("Opcode instruction: " + opBinary + " " + rsBinary + " " + rtBinary + " " + offBinary);
		
		Integer values[] = {3, rs, rt, off};
		
		return values;
	}
	
	public Integer[] sw(String[] ins) {
		String op = ins[0];
		Integer rt = Integer.parseInt(ins[1].substring(1, ins[1].length()-1));
		Integer off = Integer.parseInt(ins[2].substring(0, ins[2].indexOf('(')));
		Integer rs = Integer.parseInt(ins[2].substring(ins[2].indexOf('$')+1, ins[2].length()-1));
		//System.out.println("op: " + op + " rt: " + rt + " offset: " + off + " rs: " + rs);
		
		String opBinary = "101011";
		String rsBinary = Conversion.intToBinaryString(rs, 5);
		String rtBinary = Conversion.intToBinaryString(rt, 5);
		String offBinary = Conversion.intToBinaryString(off, 16);
		System.out.println("Opcode instruction: " + opBinary + " " + rsBinary + " " + rtBinary + " " + offBinary);
		
		Integer values[] = {4, rs, rt, off};
		
		return values;
	}
	
	public Integer[] bltz(String[] ins) {
		String op = ins[0];
		Integer rs = Integer.parseInt(ins[1].substring(1, ins[1].length()-1));
		Integer off = Integer.parseInt(ins[2]);
		//System.out.println("op: " + op + " rs: " + rs + " offset: " + off);
		
		String opBinary = "000001";
		String rsBinary = Conversion.intToBinaryString(rs, 5);
		String rtBinary = "00000";
		String offBinary = Conversion.intToBinaryString(off, 16);
		System.out.println("Opcode instruction: " + opBinary + " " + rsBinary + " " + rtBinary + " " + offBinary);
		
		Integer values[] = {5, rs, off};
		
		return values;
	}
	
	public Integer[] bgtz(String[] ins) {
		String op = ins[0];
		Integer rs = Integer.parseInt(ins[1].substring(1, ins[1].length()-1));
		Integer off = Integer.parseInt(ins[2]);
		//System.out.println("op: " + op + " rs: " + rs + " offset: " + off);
		
		String opBinary = "000111";
		String rsBinary = Conversion.intToBinaryString(rs, 5);
		String rtBinary = "00000";
		String offBinary = Conversion.intToBinaryString(off, 16);
		System.out.println("Opcode instruction: " + opBinary + " " + rsBinary + " " + rtBinary + " " + offBinary);
		
		Integer values[] = {6, rs, off};
		
		return values;
	}
	
}
