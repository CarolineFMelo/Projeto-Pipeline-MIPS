package stages;

import instructions.Immediate;
import instructions.Jump;
import instructions.Register;
import instructions.TypeD;

public class ID {
	
	public void decodingInstruction(String[] op) {
		
		switch (op[0]) {
		
		case "add":
			Register add = new Register();
			add.add(op);
			break;
		case "mult":
			Register mult = new Register();
			mult.mult(op);
			break;
		case "bne":
			Immediate bne = new Immediate();
			bne.bne(op);
			break;
		case "sub":
			Register sub = new Register();
			sub.sub(op);
			break;
		case "div":
			Register div = new Register();
			div.div(op);
			break;
		case "beq":
			Immediate beq = new Immediate();
			beq.beq(op);
			break;
		case "lw":
			Immediate lw = new Immediate();
			lw.lw(op);
			break;
		case "bltz":
			Immediate bltz = new Immediate();
			bltz.bltz(op);
			break;
		case "j":
			Jump j = new Jump();
			j.j(op);
			break;
		case "sw":
			Immediate sw = new Immediate();
			sw.sw(op);
			break;
		case "bgtz":
			Immediate bgtz = new Immediate();
			bgtz.bgtz(op);
			break;
		case "jr":
			Register jr = new Register();
			jr.jr(op);
			break;
		case "get_tc":
			TypeD get = new TypeD();
			get.get_tc(op);
			break;
		case "noop":
			TypeD no = new TypeD();
			no.noop(op);
			break;
		default:
			System.out.println("Não encontrado");
			break;
		}
	}
}