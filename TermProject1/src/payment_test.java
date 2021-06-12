import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class payment_test {

	private JFrame frame;
	private JTable List;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTable table;
	private JTextField ID_Input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment_test window = new payment_test();
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
	public payment_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Payment");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel main = new JPanel();
		main.setLayout(null);
		main.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(main);	
		
		JPanel Done = new JPanel();
		Done.setLayout(null);
		Done.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(Done);
		
		JButton HomeButton = new JButton("Home");
		HomeButton.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		HomeButton.setBounds(269, 479, 252, 43);
		Done.add(HomeButton);
		
		JTextArea txtrYourPayment = new JTextArea();
		txtrYourPayment.setText("Your payment has been completed!");
		txtrYourPayment.setFont(new Font("Dubai Medium", Font.PLAIN, 35));
		txtrYourPayment.setEditable(false);
		txtrYourPayment.setBounds(110, 64, 519, 64);
		Done.add(txtrYourPayment);
		

		
		JButton BankButton = new JButton("BankTransferPayment");
		BankButton.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		BankButton.setBounds(425, 470, 279, 43);
		main.add(BankButton);
		
		JButton CreditButton = new JButton("CreditPayment");
		CreditButton.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		CreditButton.setBounds(82, 470, 279, 43);
		main.add(CreditButton);
		
		JTextArea Payment = new JTextArea();
		Payment.setText("Payment");
		Payment.setFont(new Font("Dubai Medium", Font.PLAIN, 40));
		Payment.setEditable(false);
		Payment.setBounds(313, 36, 152, 64);
		main.add(Payment);
		

		
		JPanel Bank = new JPanel();
		Bank.setLayout(null);
		Bank.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(Bank);
		
		JTextArea txtrEnterTheInforamtion_1 = new JTextArea();
		txtrEnterTheInforamtion_1.setText("Enter the inforamtion below");
		txtrEnterTheInforamtion_1.setFont(new Font("Dubai Medium", Font.PLAIN, 35));
		txtrEnterTheInforamtion_1.setEditable(false);
		txtrEnterTheInforamtion_1.setBounds(175, 23, 434, 59);
		Bank.add(txtrEnterTheInforamtion_1);
		
		JButton DoneButton1 = new JButton("Done!");
		DoneButton1.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		DoneButton1.setBounds(264, 495, 252, 43);
		Bank.add(DoneButton1);
		
		JTextArea txtrEnterTheName = new JTextArea();
		txtrEnterTheName.setText("Enter the bank name of the account ");
		txtrEnterTheName.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheName.setEditable(false);
		txtrEnterTheName.setBounds(43, 100, 476, 43);
		Bank.add(txtrEnterTheName);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(41, 161, 434, 33);
		Bank.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(39, 278, 434, 33);
		Bank.add(textField_3);
		
		JTextArea txtrEnterTheBank = new JTextArea();
		txtrEnterTheBank.setText("Enter the bank account number ");
		txtrEnterTheBank.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheBank.setEditable(false);
		txtrEnterTheBank.setBounds(41, 217, 476, 43);
		Bank.add(txtrEnterTheBank);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(39, 397, 434, 33);
		Bank.add(textField_5);
		
		JTextArea txtrEnterTheBank_2 = new JTextArea();
		txtrEnterTheBank_2.setText("Enter the bank account password");
		txtrEnterTheBank_2.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheBank_2.setEditable(false);
		txtrEnterTheBank_2.setBounds(41, 336, 476, 43);
		Bank.add(txtrEnterTheBank_2);

		
		JPanel Credit = new JPanel();
		Credit.setLayout(null);
		Credit.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(Credit);
		

		

		
		JTextArea txtrEnterYourId = new JTextArea();
		txtrEnterYourId.setText("Enter Your ID");
		txtrEnterYourId.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		txtrEnterYourId.setEditable(false);
		txtrEnterYourId.setBounds(80, 110, 315, 33);
		main.add(txtrEnterYourId);
		
		ID_Input = new JTextField();
		ID_Input.setColumns(10);
		ID_Input.setBounds(78, 153, 258, 21);
		main.add(ID_Input);
		
		JButton EnterButton = new JButton("Enter");
		EnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		EnterButton.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		EnterButton.setBounds(348, 153, 123, 21);
		main.add(EnterButton);
		
		
		
		JTextArea txtrEnterTheInforamtion = new JTextArea();
		txtrEnterTheInforamtion.setEditable(false);
		txtrEnterTheInforamtion.setText("Enter the inforamtion below");
		txtrEnterTheInforamtion.setFont(new Font("Dubai Medium", Font.PLAIN, 35));
		txtrEnterTheInforamtion.setBounds(185, 28, 434, 59);
		Credit.add(txtrEnterTheInforamtion);
		
		JButton DoneButton = new JButton("Done!");
		DoneButton.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		DoneButton.setBounds(255, 457, 252, 43);
		Credit.add(DoneButton);
		
		JTextArea txtrEnterTheCards = new JTextArea();
		txtrEnterTheCards.setEditable(false);
		txtrEnterTheCards.setText("Enter the name of the card ");
		txtrEnterTheCards.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheCards.setBounds(45, 111, 434, 43);
		Credit.add(txtrEnterTheCards);
		
		textField = new JTextField();
		textField.setBounds(45, 174, 434, 33);
		Credit.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrEnterThePassword = new JTextArea();
		txtrEnterThePassword.setEditable(false);
		txtrEnterThePassword.setText("Enter the password of the card ");
		txtrEnterThePassword.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterThePassword.setBounds(45, 226, 434, 43);
		Credit.add(txtrEnterThePassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(45, 289, 434, 33);
		Credit.add(textField_1);
		
		JTextArea txtrEnterTheNumber = new JTextArea();
		txtrEnterTheNumber.setEditable(false);
		txtrEnterTheNumber.setText("Enter the number of the card ");
		txtrEnterTheNumber.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheNumber.setBounds(45, 339, 434, 43);
		Credit.add(txtrEnterTheNumber);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 402, 434, 33);
		Credit.add(textField_2);
		
		Credit.setVisible(false);
		Bank.setVisible(false);
		main.setVisible(true);
		Done.setVisible(false);
		
		CreditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				Done.setVisible(false);
				Credit.setVisible(true);
				Bank.setVisible(false);
			}
		});
		
		BankButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				Done.setVisible(false);
				Credit.setVisible(false);
				Bank.setVisible(true);
			}
		});
		
		DoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				Done.setVisible(true);
				Credit.setVisible(false);
				Bank.setVisible(false);
			}
		});

		
		DoneButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Done.setVisible(true);				
				main.setVisible(false);
				Credit.setVisible(false);
				Bank.setVisible(false);
			}
		});
		
		String header[] = {"No.", "Product name", "Price"};
		String content[][] = 
			{				
					{"1", "Bag", "$100,000"},
					{"2", "Pants", "$50,000"},
		};
		
		table = new JTable(content, header);
		table.setBounds(82, 199, 622, 210);
		
		table.setVisible(false);	
	
		main.add(table);

		
		EnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ID = ID_Input.getText();
				String id = "kim";
				
				if(id.equals(ID))
				{
					main.setVisible(true);
					table.setVisible(true);
				}
				
				else
				{
					JOptionPane error = new JOptionPane();
					JOptionPane.showMessageDialog(null, "Error ", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
	}
}
