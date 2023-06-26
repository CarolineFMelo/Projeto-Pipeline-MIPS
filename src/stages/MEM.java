package stages;

import functions.PC;

public class MEM {
	
	Integer memory[] = new Integer[1001];
	Integer registers[] = new Integer[34];
	// $hi: registers[33]; $lo: registers[34];
	
	int teste = 2;

	public void memoryAccess(Integer alu[]) {

		switch(alu[0]) {
		case 0:
			//noop
			break;
		case 1:
			//bne
			break;
		case 2:
			//beq
			if(teste == 2) {
				System.out.println(PC.getPc());
				PC.setPc(alu[3]);
				System.out.println(PC.getPc());
			}
			break;
		case 3:
			//lw
			registers[alu[1]] = memory[alu[2]];
			System.out.println("Salvando " + memory[alu[2]] + " no registrador $" + alu[1]);
			break;
		case 4:
			//sw
			break;
		case 5:
			//bltz
			break;
		case 6:
			//bgtz
			break;
		case 7:
			//add
			registers[alu[1]] = registers[alu[2]] + registers[alu[3]];
			System.out.println("Salvando a soma de " + registers[alu[2]] + " + " + registers[alu[3]] + " no registrador $" + alu[1]);
			break;
		case 8:
			//mult
			registers[32] = registers[alu[1]] * registers[alu[2]];
			registers[33] = registers[alu[1]] * registers[alu[2]];
			System.out.println("Salvando a multiplicação de " + registers[alu[1]] + " * " + registers[alu[2]] + " nos registradores $hi e $lo");
			break;
		case 9:
			//sub
			registers[alu[1]] = registers[alu[2]] - registers[alu[3]];
			System.out.println("Salvando a subtração de " + registers[alu[2]] + " - " + registers[alu[3]] + " no registrador $" + alu[1]);
			break;
		case 10:
			//div
			registers[32] = registers[alu[1]] % registers[alu[2]];
			registers[33] = registers[alu[1]] / registers[alu[2]];
			System.out.println("Salvando mod de " + registers[alu[1]] + " % " + registers[alu[2]] + " no registrador $hi e salvando o resultado da divisão de " + registers[alu[1]] + " / " + registers[alu[2]] + " no registrador $lo");
			break;
		case 11:
			//jr
			break;
		case 12:
			//j
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
