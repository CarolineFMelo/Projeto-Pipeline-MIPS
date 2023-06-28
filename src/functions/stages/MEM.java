package functions.stages;

import functions.generic.PC;

public class MEM {
	
	// $hi: registers[32]; $lo: registers[33];
	
	Integer registers[] = new Integer[34];
	Integer memory[] = new Integer[1001];

	public void memoryAccess(Integer alu[]) {
		
		registers[0] = 0;

		switch(alu[0]) {
		case 0:
			//noop
			break;
		case 1:
			//bne
			if(registers[alu[1]] != registers[alu[2]]) {
				PC.setPc(alu[3]);
				System.out.println(registers[alu[1]] + " é diferente de " + registers[alu[2]] + ", então PC é setado como " + alu[3]);
			}
			break;
		case 2:
			//beq
			if(registers[alu[1]] == registers[alu[2]]) {
				PC.setPc(alu[3]);
				System.out.println(registers[alu[1]] + " é igual a " + registers[alu[2]] + ", então PC é setado como " + alu[3]);
			}
			break;
		case 3:
			//lw
			registers[alu[1]] = memory[alu[2]];
			System.out.println("Salvando " + memory[alu[2]] + " no registrador $" + alu[1]);
			break;
		case 4:
			//sw
			memory[alu[2]] = registers[alu[1]];
			System.out.println("Salvando o conteúdo do registrador " + alu[1] + " na posição de memória " + alu[2]);	
			break;
		case 5:
			//bltz
			if(registers[alu[1]] < 0) {
				PC.setPc(alu[2]);
				System.out.println(registers[alu[1]] + " é menor que 0, então PC é setado como " + alu[2]);
			}
			break;
		case 6:
			//bgtz
			if(registers[alu[1]] > 0) {
				PC.setPc(alu[2]);
				System.out.println(registers[alu[1]] + " é maior que 0, então PC é setado como " + alu[2]);
			}
			break;
		case 7:
			//add
			System.out.println("Salvando a soma de " + registers[alu[2]] + " + " + registers[alu[3]] + " no registrador $" + alu[1]);
			registers[alu[1]] = registers[alu[2]] + registers[alu[3]];
			System.out.println("Resultado da soma = " + registers[alu[1]]);
			break;
		case 8:
			//mult
			System.out.println("Salvando a multiplicação de " + registers[alu[1]] + " * " + registers[alu[2]] + " nos registradores $hi e $lo");
			registers[32] = registers[alu[1]] * registers[alu[2]];
			registers[33] = registers[alu[1]] * registers[alu[2]];
			System.out.println("Resultado da multiplicação = " + registers[33]);
			break;
		case 9:
			//sub
			System.out.println("Salvando a subtração de " + registers[alu[2]] + " - " + registers[alu[3]] + " no registrador $" + alu[1]);
			registers[alu[1]] = registers[alu[2]] - registers[alu[3]];
			System.out.println("Resultado da subtração = " + registers[alu[1]]);
			break;
		case 10:
			//div
			System.out.println("Salvando mod de " + registers[alu[1]] + " % " + registers[alu[2]] + " no registrador $hi e salvando o resultado da divisão de " + registers[alu[1]] + " / " + registers[alu[2]] + " no registrador $lo");
			registers[32] = registers[alu[1]] % registers[alu[2]];
			registers[33] = registers[alu[1]] / registers[alu[2]];
			System.out.println("Resultado do mod = " + registers[32]);
			System.out.println("Resultado da divisão = " + registers[33]);
			break;
		case 11:
			//jr
			PC.setPc(registers[alu[1]]);
			System.out.println("PC é setado como " + registers[alu[1]]);
			break;
		case 12:
			//j
			PC.setPc(alu[1]);
			System.out.println("PC é setado como " + alu[1]);
			break;
		case 13:
			//get_tc
			memory[alu[1]] = alu[2];
			System.out.println("Salvando " + alu[2] + " na posição de memória " + alu[1]);			
			break;
		default:
			break;
		}
	}
	
}
