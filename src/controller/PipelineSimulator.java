package controller;

import view.*;

public class PipelineSimulator {

	private static InstructionView instructionView = new InstructionView();
	private static ExecutionView executionView = new ExecutionView();
	
	public static InstructionView getInstructionView() {
		return instructionView;
	}
	
	public static ExecutionView getExecutionView() {
		return executionView;
	}
	
	public static void main(String[] args) {
		instructionView.callInstructionFrame();
	}
	
}
