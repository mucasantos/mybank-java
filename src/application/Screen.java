package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Screen {

	private JFrame frame;
	private JTextField textFieldName;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen window = new Screen();
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
	public Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(32, 38, 300, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente2 = new Cliente(textFieldName.getText(), "Pinheiro", "555.456.456-89", "1195858-8977", "jojoca@gmail.com", 1971);
				
				Conta minhaConta = new Conta(123, cliente2,255, 0, 0, "15/08/2023");
				
				
				
				System.out.println(textFieldName.getText());
			}
		});
		btnNewButton.setBounds(335, 37, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setBounds(32, 13, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(102, 212, 129, -46);
		frame.getContentPane().add(table);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(32, 76, 300, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(32, 118, 300, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(32, 156, 300, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(32, 195, 300, 20);
		frame.getContentPane().add(textField_3);
	}
}
