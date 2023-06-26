package stages;

public class EX {
	
	Integer ALU[] = new Integer[4];
	
	IF pc = new IF();
	
	public Integer[] executeInstruction(Integer vet[]) {
		
		switch(vet[0]) {
		case 0:
			//noop
			System.out.println("Sem mais instruções");
			break;
		case 1:
			//bne
			//if(registers[vet[1]] != registers[vet[2]]) {
				//pc.incrementPc(vet[3]);
			//}
			break;
		case 2:
			//beq
			ALU[0] = vet[0];
			ALU[1] = vet[1];
			ALU[2] = vet[2];
			ALU[3] = vet[3];
			break;
		case 3:
			//lw
			ALU[0] = vet[0];
			ALU[1] = vet[2];
			ALU[2] = vet[3] + vet[1];
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
			ALU[0] = vet[0];
			ALU[1] = vet[1];
			ALU[2] = vet[2];
			ALU[3] = vet[3];
			break;
		case 8:
			//mult
			ALU[0] = vet[0];
			ALU[1] = vet[1];
			ALU[2] = vet[2];
			break;
		case 9:
			//sub
			ALU[0] = vet[0];
			ALU[1] = vet[1];
			ALU[2] = vet[2];
			ALU[3] = vet[3];
			break;
		case 10:
			//div
			ALU[0] = vet[0];
			ALU[1] = vet[1];
			ALU[2] = vet[2];
			break;
		case 11:
			//jr
			break;
		case 12:
			//j
			break;
		case 13:
			//get_tc
			ALU[0] = vet[0];
			ALU[1] = vet[1];
			ALU[2] = vet[2];
			break;
		default:
			break;
		}
		
		return ALU;
	}

}
