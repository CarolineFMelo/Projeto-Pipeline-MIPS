package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import functions.generic.Execution;

public class ExecutionView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static String rowsPerSet;
	private static boolean set = false;
	
	public void callExecutionFrame() {
		this.setVisible(true);
	}
	
	public String getRowsPerSet() {
		return rowsPerSet;
	}
	
	public void setRowsPerSet(String nRows) {
		ExecutionView.rowsPerSet = nRows;
		ExecutionView.set = true;
	}
	
	public ExecutionView() {
		setTitle("Pipeline Simulator");
		setResizable(false);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 617, 550);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Execution exe = new Execution();
		exe.execution();
		
		JLabel lblExecution = new JLabel("Execução Iniciada");
		lblExecution.setBounds(10, 11, 416, 22);
		contentPane.add(lblExecution);
	}
	
}