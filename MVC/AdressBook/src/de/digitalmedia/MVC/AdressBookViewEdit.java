package de.digitalmedia.MVC;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.digitalmedia.DAO.Contact;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdressBookViewEdit extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnOK;
	private JButton btnAbort;
	
	// Contact
	private JTextField textFieldContactId;
	private JTextField textFieldName;
	private JTextField textFieldLastName;
	private JTextField textFieldStreet;
	private JTextField textFieldPostalCode;
	private JTextField textFieldEmail;
	private JTextField textFieldPhone;
	private JTextField textFieldBorn;
	//private JTextField textFieldBankAccountId;
	
	//BankAccount
	private JTextField textFieldBankAccountIdBa;
	private JTextField textFieldBank;
	private JTextField textFieldBankAccountNumber;
	private JTextField textFieldSortCode;
	private JTextField textFieldOther;
	
	//Custom
	private JTextField textFieldCustomOne;
	private JTextField textFieldCustomTwo;
	private JTextField textFieldCustomThree;
	private JTextField textFieldCustomFour;
	

	/**
	 * Create the frame.
	 */
	public AdressBookViewEdit() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 531, 363);
		setLocationRelativeTo(null);
		setTitle("Kontakt bearbeiten");
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 11, 523, 280);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		tabbedPane.addTab("Kontakt", null, panel, null);
		panel.setLayout(null);
		
		textFieldContactId = new JTextField();
		textFieldContactId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Vorname:");
		lblNewLabel_1.setBounds(10, 11, 79, 14);
		panel.add(lblNewLabel_1);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(116, 11, 236, 20);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNachname = new JLabel("Nachname:");
		lblNachname.setBounds(10, 42, 79, 14);
		panel.add(lblNachname);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(116, 42, 236, 20);
		panel.add(textFieldLastName);
		
		JLabel lblStrae = new JLabel("Stra\u00DFe:");
		lblStrae.setBounds(10, 73, 79, 14);
		panel.add(lblStrae);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setColumns(10);
		textFieldStreet.setBounds(116, 73, 236, 20);
		panel.add(textFieldStreet);
		
		JLabel lblPostleitzahl = new JLabel("Postleitzahl:");
		lblPostleitzahl.setBounds(10, 104, 79, 14);
		panel.add(lblPostleitzahl);
		
		textFieldPostalCode = new JTextField();
		textFieldPostalCode.setColumns(10);
		textFieldPostalCode.setBounds(116, 104, 236, 20);
		panel.add(textFieldPostalCode);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(10, 135, 79, 14);
		panel.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(116, 135, 236, 20);
		panel.add(textFieldEmail);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(10, 166, 79, 14);
		panel.add(lblTelefon);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(116, 166, 236, 20);
		panel.add(textFieldPhone);
		
		JLabel lblGeboren = new JLabel("Geboren:");
		lblGeboren.setBounds(10, 197, 79, 14);
		panel.add(lblGeboren);
		
		textFieldBorn = new JTextField();
		textFieldBorn.setColumns(10);
		textFieldBorn.setBounds(116, 197, 236, 20);
		panel.add(textFieldBorn);
		
		//textFieldBankAccountId = new JTextField();
		//textFieldBankAccountId.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Bankverbindung", null, panel_1, null);
		panel_1.setLayout(null);
		
		textFieldBankAccountIdBa = new JTextField();
		textFieldBankAccountIdBa.setColumns(10);
		textFieldBankAccountIdBa.setBounds(116, 11, 236, 20);
		panel_1.add(textFieldBankAccountIdBa);
		
		JLabel lblKreditinstitut = new JLabel("Kreditinstitut:");
		lblKreditinstitut.setBounds(10, 11, 96, 14);
		panel_1.add(lblKreditinstitut);
		
		textFieldBank = new JTextField();
		textFieldBank.setColumns(10);
		textFieldBank.setBounds(116, 11, 236, 20);
		panel_1.add(textFieldBank);
		
		JLabel lblKontonummer = new JLabel("Kontonummer:");
		lblKontonummer.setBounds(10, 42, 96, 14);
		panel_1.add(lblKontonummer);
		
		textFieldBankAccountNumber = new JTextField();
		textFieldBankAccountNumber.setColumns(10);
		textFieldBankAccountNumber.setBounds(116, 42, 236, 20);
		panel_1.add(textFieldBankAccountNumber);
		
		JLabel lblBankleitzahl = new JLabel("Bankleitzahl:");
		lblBankleitzahl.setBounds(10, 72, 96, 14);
		panel_1.add(lblBankleitzahl);
		
		textFieldSortCode = new JTextField();
		textFieldSortCode.setColumns(10);
		textFieldSortCode.setBounds(116, 72, 236, 20);
		panel_1.add(textFieldSortCode);
		
		JLabel lblSonstiges = new JLabel("Zusatz:");
		lblSonstiges.setBounds(10, 103, 96, 14);
		panel_1.add(lblSonstiges);
		
		textFieldOther = new JTextField();
		textFieldOther.setColumns(10);
		textFieldOther.setBounds(116, 103, 236, 20);
		panel_1.add(textFieldOther);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Sonstiges", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblBenutzerdef = new JLabel("Benutzerdef.1:");
		lblBenutzerdef.setBounds(10, 11, 96, 14);
		panel_2.add(lblBenutzerdef);
		
		textFieldCustomOne = new JTextField();
		textFieldCustomOne.setColumns(10);
		textFieldCustomOne.setBounds(116, 11, 236, 20);
		panel_2.add(textFieldCustomOne);
		
		JLabel lblBenutzerdef_1 = new JLabel("Benutzerdef.2:");
		lblBenutzerdef_1.setBounds(10, 42, 96, 14);
		panel_2.add(lblBenutzerdef_1);
		
		textFieldCustomTwo = new JTextField();
		textFieldCustomTwo.setColumns(10);
		textFieldCustomTwo.setBounds(116, 42, 236, 20);
		panel_2.add(textFieldCustomTwo);
		
		JLabel lblBenutzerdef_2 = new JLabel("Benutzerdef.3:");
		lblBenutzerdef_2.setBounds(10, 73, 96, 14);
		panel_2.add(lblBenutzerdef_2);
		
		textFieldCustomThree = new JTextField();
		textFieldCustomThree.setColumns(10);
		textFieldCustomThree.setBounds(116, 73, 236, 20);
		panel_2.add(textFieldCustomThree);
		
		JLabel lblBenutzerdef_3 = new JLabel("Benutzerdef.4:");
		lblBenutzerdef_3.setBounds(10, 104, 96, 14);
		panel_2.add(lblBenutzerdef_3);
		
		textFieldCustomFour = new JTextField();
		textFieldCustomFour.setColumns(10);
		textFieldCustomFour.setBounds(116, 104, 236, 20);
		panel_2.add(textFieldCustomFour);
		
		btnOK = new JButton("OK");
		btnOK.setBounds(321, 302, 91, 23);
		contentPane.add(btnOK);
		
		btnAbort = new JButton("Abbrechen");
		btnAbort.setBounds(422, 302, 91, 23);
		contentPane.add(btnAbort);
	}
	
	public int getTextFieldContactId() {
		return Integer.parseInt(textFieldContactId.getText());
	}

	public void setTextFieldContactId(JTextField textFieldContactId) {
		this.textFieldContactId = textFieldContactId;
	}

	public String getTextFieldName() {
		System.out.println("Hallo");
		return textFieldName.getText();
	}

	public void setTextFieldName(JTextField textFieldName) {
		
		this.textFieldName = textFieldName;
	}

	public String getTextFieldLastName() {
		return textFieldLastName.getText();
	}

	public void setTextFieldLastName(JTextField textFieldLastName) {
		this.textFieldLastName = textFieldLastName;
	}

	public String getTextFieldStreet() {
		return textFieldStreet.getText();
	}

	public void setTextFieldStreet(JTextField textFieldStreet) {
		this.textFieldStreet = textFieldStreet;
	}

	public String getTextFieldPostalCode() {
		return textFieldPostalCode.getText();
	}

	public void setTextFieldPostalCode(JTextField textFieldPostalCode) {
		this.textFieldPostalCode = textFieldPostalCode;
	}

	public String getTextFieldEmail() {
		return textFieldEmail.getText();
	}

	public void setTextFieldEmail(JTextField textFieldEmail) {
		this.textFieldEmail = textFieldEmail;
	}

	public String getTextFieldPhone() {
		return textFieldPhone.getText();
	}

	public void setTextFieldPhone(JTextField textFieldPhone) {
		this.textFieldPhone = textFieldPhone;
	}

	public String getTextFieldBorn() {
		return textFieldBorn.getText();
		
	}

	public void setTextFieldBorn(JTextField textFieldBorn) {
		this.textFieldBorn = textFieldBorn;
	}
	
	//public int getTextFieldBankAccountId() {
		
		//return Integer.parseInt(textFieldBankAccountId.getText());
	//}

	public int getTextFieldBankAccountIdBa() {
		return Integer.parseInt(textFieldBankAccountIdBa.getText());
	}

	public void setTextFieldBankAccountIdBa(JTextField textFieldBankAccountIdBa) {
		this.textFieldBankAccountIdBa = textFieldBankAccountIdBa;
	}

	public String getTextFieldBank() {
		
		return textFieldBank.getText();
	}

	public void setTextFieldBank(JTextField textFieldBank) {
		
		this.textFieldBank = textFieldBank;
	}

	public String getTextFieldBankAccountNumber() {
	
		return textFieldBankAccountNumber.getText();
	}

	public void setTextFieldBankAccountNumber(JTextField textFieldBankAccountNumber) {
		this.textFieldBankAccountNumber = textFieldBankAccountNumber;
	}

	public String getTextFieldSortCode() {
		return textFieldSortCode.getText();
	}

	public void setTextFieldSortCode(JTextField textFieldSortCode) {
		this.textFieldSortCode = textFieldSortCode;
	}

	//public void setTextFieldBankAccountId(JTextField textFieldBankAccountId) {
		//this.textFieldBankAccountId = textFieldBankAccountId;
	//}
	
	public String getTextFieldOther() {
		return textFieldOther.getText();
	}

	public void setTextFieldOther(JTextField textFieldOther) {
		this.textFieldOther = textFieldOther;
	}
	
	public String getTextFieldCustomOne() {
		return textFieldCustomOne.getText();
	}

	public void setTextFieldCustomOne(JTextField textFieldCustomOne) {
		this.textFieldCustomOne = textFieldCustomOne;
	}

	public String getTextFieldCustomTwo() {
		return textFieldCustomTwo.getText();
	}

	public void setTextFieldCustomTwo(JTextField textFieldCustomTwo) {
		this.textFieldCustomTwo = textFieldCustomTwo;
	}

	public String getTextFieldCustomThree() {
		return textFieldCustomThree.getText();
	}

	public void setTextFieldCustomThree(JTextField textFieldCustomThree) {
		this.textFieldCustomThree = textFieldCustomThree;
	}

	public String getTextFieldCustomFour() {
		return textFieldCustomFour.getText();
	}

	public void setTextFieldCustomFour(JTextField textFieldCustomFour) {
		this.textFieldCustomFour = textFieldCustomFour;
	}
	
	
	public JButton getBtnOK() {
		return btnOK;
	}
	
	public JButton getBtnAbort() {
		return btnAbort;
	}
	
	public void editContactData(Contact contact) {
		
		textFieldName.setText(contact.getName());
		textFieldLastName.setText(contact.getLastName());
		textFieldStreet.setText(contact.getStreet());
		textFieldPostalCode.setText(contact.getPostalCode());
		textFieldEmail.setText(contact.getEmail());
		textFieldPhone.setText(contact.getPhone());
		textFieldBorn.setText(contact.getBorn());
		
		
	}
	
	public void updateContactData(Contact contact) {
		
	}
}
