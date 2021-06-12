import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class Shipment {

	private JFrame Shipment;
	private JTextField txtEnterTheId;
	private JTextField ID;
	private JTextField txtYourId;
	private JTextArea PrintId;
	private JTextField txtName;
	private JTextArea PrintName;
	private JTextField txtPhoneNumber;
	private JTextArea PrintNum;
	private JTextField txtAddress;
	private JTextArea PrintAddress;
	private JTextField txtCheckYourInformation;
	private JTextField txtIfIt;
	private JButton ConfirmedButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shipment window = new Shipment();
					window.Shipment.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Shipment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Shipment = new JFrame();
		Shipment.setBounds(100, 100, 1133, 723);
		Shipment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Shipment.getContentPane().setLayout(null);
		
		JPanel main = new JPanel();
		main.setBounds(0, 0, 1119, 686);
		Shipment.getContentPane().add(main);
		main.setLayout(null);
		
		
		
		JPanel info = new JPanel();
		info.setBounds(0, 0, 1119, 686);
		Shipment.getContentPane().add(info);
		info.setLayout(null);
		
		txtYourId = new JTextField();
		txtYourId.setBackground(Color.WHITE);
		txtYourId.setEditable(false);
		txtYourId.setText("ID");
		txtYourId.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		txtYourId.setColumns(10);
		txtYourId.setBounds(46, 172, 257, 57);
		info.add(txtYourId);
		
		PrintId = new JTextArea();
		PrintId.setEditable(false);
		PrintId.setBounds(46, 250, 257, 35);
		info.add(PrintId);
		
		txtName = new JTextField();
		txtName.setBackground(Color.WHITE);
		txtName.setEditable(false);
		txtName.setText("Name");
		txtName.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		txtName.setColumns(10);
		txtName.setBounds(46, 320, 257, 57);
		info.add(txtName);
		
		PrintName = new JTextArea();
		PrintName.setEditable(false);
		PrintName.setBounds(46, 398, 257, 35);
		info.add(PrintName);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBackground(Color.WHITE);
		txtPhoneNumber.setForeground(Color.BLACK);
		txtPhoneNumber.setEditable(false);
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(395, 172, 257, 57);
		info.add(txtPhoneNumber);
		
		PrintNum = new JTextArea();
		PrintNum.setEditable(false);
		PrintNum.setBounds(395, 250, 257, 35);
		info.add(PrintNum);
		
		txtAddress = new JTextField();
		txtAddress.setBackground(Color.WHITE);
		txtAddress.setEditable(false);
		txtAddress.setText("Address");
		txtAddress.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		txtAddress.setColumns(10);
		txtAddress.setBounds(395, 320, 257, 57);
		info.add(txtAddress);
		
		PrintAddress = new JTextArea();
		PrintAddress.setEditable(false);
		PrintAddress.setBounds(395, 398, 257, 35);
		info.add(PrintAddress);
		
		txtCheckYourInformation = new JTextField();
		txtCheckYourInformation.setBackground(Color.WHITE);
		txtCheckYourInformation.setEditable(false);
		txtCheckYourInformation.setText("Check your Information");
		txtCheckYourInformation.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtCheckYourInformation.setColumns(10);
		txtCheckYourInformation.setBounds(438, 35, 324, 74);
		info.add(txtCheckYourInformation);
		
		txtIfIt = new JTextField();
		txtIfIt.setBackground(Color.WHITE);
		txtIfIt.setEditable(false);
		txtIfIt.setText("If all is correct, press the confirmed button");
		txtIfIt.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		txtIfIt.setColumns(10);
		txtIfIt.setBounds(46, 461, 452, 30);
		info.add(txtIfIt);
		
		ConfirmedButton = new JButton("Confirmed!");
		ConfirmedButton.setFont(new Font("Dubai Medium", Font.PLAIN, 15));
		ConfirmedButton.setBounds(521, 609, 103, 35);
		info.add(ConfirmedButton);
		
		
		
		txtEnterTheId = new JTextField();
		txtEnterTheId.setEditable(false);
		txtEnterTheId.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtEnterTheId.setText("Enter the ID");
		txtEnterTheId.setBounds(32, 66, 257, 74);
		main.add(txtEnterTheId);
		txtEnterTheId.setColumns(10);
		
		
		ID = new JTextField();
		ID.setBounds(32, 167, 280, 34);
		main.add(ID);
		ID.setColumns(10);
		
		JButton DoneButton = new JButton("Done!");
		DoneButton.setFont(new Font("Dubai Medium", Font.PLAIN, 15));
		DoneButton.setBounds(32, 236, 95, 23);
		main.add(DoneButton);
		
		
		
		DoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IDinput = ID.getText();
				String id = "kim";
				String name = "min";
				String Num = "010-1234-5678";
				String address = "Gachon University";
				
				if(id.equals(IDinput))
				{
					PrintId.append(id + "\n");
					PrintName.append(name + "\n");
					PrintNum.append(Num + "\n");
					PrintAddress.append(address + "\n");
					
					main.setVisible(false);
					info.setVisible(true);
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
