package stages;

import instructions.Immediate;
import instructions.Jump;
import instructions.Register;
import instructions.TypeD;

public class ID {
	
	public Integer[] decodeInstruction(String[] op) {
		
		Integer values[];
		
		switch (op[0]) {
		case "add":
			Register add = new Register();
			values = add.add(op);
			break;
		case "mult":
			Register mult = new Register();
			values = mult.mult(op);
			break;
		case "bne":
			Immediate bne = new Immediate();
			values = bne.bne(op);
			break;
		case "sub":
			Register sub = new Register();
			values = sub.sub(op);
			break;
		case "div":
			Register div = new Register();
			values = div.div(op);
			break;
		case "beq":
			Immediate beq = new Immediate();
			values = beq.beq(op);
			break;
		case "lw":
			Immediate lw = new Immediate();
			values = lw.lw(op);
			break;
		case "bltz":
			Immediate bltz = new Immediate();
			values = bltz.bltz(op);
			break;
		case "j":
			Jump j = new Jump();
			values = j.j(op);
			break;
		case "sw":
			Immediate sw = new Immediate();
			values = sw.sw(op);
			break;
		case "bgtz":
			Immediate bgtz = new Immediate();
			values = bgtz.bgtz(op);
			break;
		case "jr":
			Register jr = new Register();
			values = jr.jr(op);
			break;
		case "get_tc":
			TypeD get = new TypeD();
			values = get.get_tc(op);
			break;
		case "noop":
			TypeD no = new TypeD();
			values = no.noop(op);
			break;
		default:
			System.out.println("Não encontrado");
			values = null;
			break;
		}
		return values;
	}
}