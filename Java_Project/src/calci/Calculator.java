package calci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secnum;
	double result;
	String operations;
	String Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 255, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(16, 6, 226, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		 final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(16, 123, 50, 50);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(72, 123, 50, 50);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(130, 123, 50, 50);
		frame.getContentPane().add(btn9);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(16, 185, 50, 50);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn5.setBounds(72, 185, 50, 50);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(130, 185, 50, 50);
		frame.getContentPane().add(btn6);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(16, 253, 50, 50);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(72, 253, 50, 50);
		frame.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(130, 253, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		minus.setBounds(192, 123, 50, 50);
		frame.getContentPane().add(minus);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btnNewButton_1.setBounds(192, 185, 50, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnNewButton_2.setBounds(192, 253, 50, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		final JButton btn0=new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBackground(SystemColor.textHighlight);
		btn0.setBounds(16, 315, 50, 50);
		frame.getContentPane().add(btn0);
		
		final JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btndot.getText());
		          }
			}
		});
		btndot.setBounds(72, 315, 50, 50);
		frame.getContentPane().add(btndot);
		
		JButton plusminus = new JButton("+-");
		plusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ops=0;
				firstnum=Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		plusminus.setBounds(130, 315, 50, 50);
		frame.getContentPane().add(plusminus);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secnum=Double.parseDouble(textField.getText());
				if(operations == "+") {
					result=firstnum+secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "-") {
					result=firstnum-secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "*") {
					result=firstnum*secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "%") {
					result=firstnum % secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result=firstnum/secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		equal.setBounds(193, 315, 50, 50);
		frame.getContentPane().add(equal);
		
		JButton btnNewButton_3 = new JButton("<-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder strb=new StringBuilder(textField.getText());
					strb.deleteCharAt(textField.getText().length() -1);
					backspace=strb.toString();
					textField.setText(backspace);
					
				}
				
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_3.setBounds(16, 61, 50, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		clear.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		clear.setBounds(72, 61, 50, 50);
		frame.getContentPane().add(clear);
		
		JButton percentage = new JButton("%");
		percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		percentage.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		percentage.setBounds(130, 61, 50, 50);
		frame.getContentPane().add(percentage);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		plus.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		plus.setBounds(193, 61, 50, 50);
		frame.getContentPane().add(plus);
		
		
		
		
	}
}
