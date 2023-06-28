package functions.instructions;

import java.util.Scanner;

public class TypeD {

	public Integer[] get_tc(String[] ins) {
		String op = ins[0];
		Integer mem = Integer.parseInt(ins[1]);
		//System.out.println("op: " + op + " mem: " + mem);
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter an integer value:");
		Integer value = read.nextInt();
		
		Integer values[] = {13, mem, value};
		
		return values;
	}
	
	public Integer[] noop(String[] ins) {
		Integer values[] = {0, 0};
		
		return values;
	}
	
}
