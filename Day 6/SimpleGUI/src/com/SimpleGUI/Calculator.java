package com.SimpleGUI;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	
	Frame frame;
	Label enter_num_label, resultLabel;
	TextField input, result;
	Button factorialButton, ClearButton;
	
	Calculator(){
		
		frame = new Frame("Calculator");
		
		enter_num_label = new Label("Enter the Number");
		//enter_num_label.setBounds(5, 10, 100, 100);
		frame.add(enter_num_label);
		
		input = new TextField(20);
		//input.setBounds(20, 100, 80, 30); 
		frame.add(input);
		
		factorialButton  = new Button("Generate Factorial");
		frame.add(factorialButton);
		
		ClearButton = new Button("Clear Textfield");
		frame.add(ClearButton);
		
		resultLabel = new Label("Result: ");
		frame.add(resultLabel);
		
		result = new TextField(20);
		frame.add(result);
		
		frame.setSize(800, 400);
		frame.setLayout(new FlowLayout()); 
		frame.setVisible(true);
		
		ClearButton.addActionListener(this);
		factorialButton.addActionListener(this);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ClearButton) {
			input.setText("");
			result.setText("");
		}
		if (e.getSource() == factorialButton) {
			int num, factorial = 1;
			String factorial_result;
			num = Integer.parseInt(input.getText());
			
			for (int i = num; i > 0; i--) {
				factorial = factorial * i;
			}
			
			factorial_result = Integer.toString(factorial);
			result.setText(factorial_result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
	}

	

}
