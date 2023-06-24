package instructions;

import java.util.Scanner;

public class TypeD {

	public void get_tc(String[] ins) {
		String op = ins[0];
		Integer mem = Integer.parseInt(ins[1]);
		//System.out.println("op: " + op + " mem: " + mem);
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter an integer value:");
		Integer value = read.nextInt();
	}
	
	public void noop(String[] ins) {
		System.out.println("execução finalizada");
	}
	
}
