package de.digitalmedia.MVC;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import de.digitalmedia.DAO.Contact;
import de.digitalmedia.DAO.Employee;
import de.digitalmedia.DAO.EmployeeDAO;
import de.digitalmedia.DAO.EmployeeDAOImpl;

public class AdressBookController {
	
	private AdressBookView theView;
	private AdressBookViewNC theViewNewContact;
	AdressBookViewEdit theViewNewContactEdit;
	private int id;
	
	
	public AdressBookController(AdressBookView theView, AdressBookViewNC theViewNewContact, AdressBookViewEdit theViewNewContactEdit ) {
		
		this.theView = theView;
		this.theViewNewContact = theViewNewContact;
		this.theViewNewContactEdit = theViewNewContactEdit;
		
		initialise();
		loadData();
	}
	
	// Load Data from DB in JTable
	// Daten müssen an die View gegeben werden!
	private void loadData() {
		
		theView.setJTableData(new EmployeeDAOImpl().getAllEmployee());
		
	}
	
	private void initialise() {
		
		// Delete Data
		theView.getDeleteDataJButton().addActionListener(new ActionListener() {
					
			public void actionPerformed(ActionEvent e) {
				
				int action = JOptionPane.showConfirmDialog(null, "Soll der Kontakt wirklich gelöscht werden?", "Kontakt löschen", JOptionPane.YES_NO_OPTION);
				
				if(action == 0) {
				
					try {
						EmployeeDAOImpl employeeDAO1 = new EmployeeDAOImpl();
						
						Contact contact = employeeDAO1.getEmployeeId(id);
						
						int result = employeeDAO1.delete(contact);
						
						DefaultTableModel model = (DefaultTableModel) theView.getJTable().getModel();
						model.setRowCount(0);
						theViewNewContact.dispose();
						
						theView.getEditJButton().setEnabled(false);
						theView.getEditJButton().setForeground(Color.GRAY);
						
						theView.getDeleteDataJButton().setEnabled(false);
						theView.getDeleteDataJButton().setForeground(Color.GRAY);
						
						loadData();
						
					} catch (Exception e2) {
			
						JOptionPane.showMessageDialog(null, "Sie haben keinen Kontakt ausgewählt!");
					}
				}
			}
		});
		
		
		// Insert Data
		theViewNewContact.getBtnOK().addActionListener(new ActionListener() {
							
			public void actionPerformed(ActionEvent e) {
				
				EmployeeDAO employeeDAO1 = new EmployeeDAOImpl();
				
				// Get Contact
				String textFieldName = theViewNewContact.getTextFieldName();
				String textFieldLastName = theViewNewContact.getTextFieldLastName();
				String textFieldStreet = theViewNewContact.getTextFieldStreet();
				String textFieldPostalCode = theViewNewContact.getTextFieldPostalCode();
				String textFieldEmail = theViewNewContact.getTextFieldEmail();
				String textFieldPhone = theViewNewContact.getTextFieldPhone();
				String textFieldBorn = theViewNewContact.getTextFieldBorn();
				
				// Get Bank
				String textFieldBank = theViewNewContact.getTextFieldBank();
				String textFieldBankAccountNumber = theViewNewContact.getTextFieldBankAccountNumber();
				String textSortCode = theViewNewContact.getTextFieldSortCode();
				String textOther = theViewNewContact.getTextFieldOther();
				
				// Get Custom
				String textFieldCustomOne = theViewNewContact.getTextFieldCustomOne();
				String textFieldCustomTwo = theViewNewContact.getTextFieldCustomTwo();
				String textFieldCustomThree = theViewNewContact.getTextFieldCustomThree();
				String textFieldCustomFour = theViewNewContact.getTextFieldCustomFour();
				
				// Insert Contact
				Contact contact = new Contact(textFieldName, textFieldLastName, textFieldStreet, textFieldPostalCode, textFieldEmail, textFieldPhone, textFieldBorn);
				
				// Insert BankAccount
				//contact.setBankAccount(textFieldBank, textFieldBankAccountNumber, textSortCode, textOther);
				
				// Insert Custom
				//contact.setCustom(textFieldCustomOne, textFieldCustomTwo, textFieldCustomThree, textFieldCustomFour);
				
				try {
					
					int result = employeeDAO1.insert(contact);
					
					DefaultTableModel model = (DefaultTableModel) theView.getJTable().getModel();
					model.setRowCount(0);
					theViewNewContact.dispose();
					loadData();
					
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
		});
		
		
		// Update Data
		theViewNewContactEdit.getBtnOK().addActionListener(new ActionListener() {
									
			public void actionPerformed(ActionEvent e) {
						
				EmployeeDAO employeeDAO1 = new EmployeeDAOImpl();
						
				// Get Contact
						
				String textFieldName = theViewNewContactEdit.getTextFieldName();
				String textFieldLastName = theViewNewContactEdit.getTextFieldLastName();
				String textFieldStreet = theViewNewContactEdit.getTextFieldStreet();
				String textFieldPostalCode = theViewNewContactEdit.getTextFieldPostalCode();
				String textFieldEmail = theViewNewContactEdit.getTextFieldEmail();
				String textFieldPhone = theViewNewContactEdit.getTextFieldPhone();
				String textFieldBorn = theViewNewContactEdit.getTextFieldBorn();
						
				// Get Bank
				String textFieldBank = theViewNewContactEdit.getTextFieldBank();
				String textFieldBankAccountNumber = theViewNewContactEdit.getTextFieldBankAccountNumber();
				String textSortCode = theViewNewContactEdit.getTextFieldSortCode();
				String textOther = theViewNewContactEdit.getTextFieldOther();
						
				// Get Custom
				String textFieldCustomOne = theViewNewContactEdit.getTextFieldCustomOne();
				String textFieldCustomTwo = theViewNewContactEdit.getTextFieldCustomTwo();
				String textFieldCustomThree = theViewNewContactEdit.getTextFieldCustomThree();
				String textFieldCustomFour = theViewNewContactEdit.getTextFieldCustomFour();
						
				// Insert Contact
				Contact contact = new Contact(id, textFieldName, textFieldLastName, textFieldStreet, textFieldPostalCode, textFieldEmail, textFieldPhone, textFieldBorn);
						
				// Insert BankAccount
				//contact.setBankAccount(textFieldBank, textFieldBankAccountNumber, textSortCode, textOther);
						
				// Insert Custom
				//contact.setCustom(textFieldCustomOne, textFieldCustomTwo, textFieldCustomThree, textFieldCustomFour);
						
					try {
							
						int result = employeeDAO1.update(contact);
						System.out.println("Test");
						DefaultTableModel model = (DefaultTableModel) theView.getJTable().getModel();
						model.setRowCount(0);
						theViewNewContactEdit.dispose();
						loadData();
							
					} catch (Exception e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
					}
						
					}
			});
		
		// Edit Contact Data
		theView.getEditJButton().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					theViewNewContactEdit.setVisible(true);
					
					EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
					
					theViewNewContactEdit.editContactData(employeeDAOImpl.getEmployeeId(id));
					
					
					
				
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Neuer Kontakt konnte nicht erstellt werden!");
				}
			}
		});
		
		
		// Open New Contact Frame
		theView.getNewContactJButton().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					theViewNewContact.setVisible(true);
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Neuer Kontakt konnte nicht erstellt werden!");
				}
			}
		});
		
		// Close New Contact Form
		theViewNewContact.getBtnAbort().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theViewNewContact.dispose();
				
			}
		});
		
		// Change Style NewContactButton
		/*
		 * theView.getNewContactJButton().addMouseListener(new MouseAdapter() {
		 * 
		 * public void mouseEntered(MouseEvent evt) {
		 * theView.getNewContactJButton().setBackground(Color.ORANGE);
		 * theView.getNewContactJButton().setBorderPainted(true); } public void
		 * mouseExited(MouseEvent evt) {
		 * theView.getNewContactJButton().setBackground(null);
		 * theView.getNewContactJButton().setOpaque(true);
		 * theView.getNewContactJButton().setContentAreaFilled(false);
		 * theView.getNewContactJButton().setFocusPainted(false);
		 * theView.getNewContactJButton().setBorderPainted(false); } });
		 */

		
		// Select Row with Mouseclick 
		theView.getJTable().addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					
					int row = theView.getJTable().getSelectedRow();
					id = Integer.parseInt((theView.getJTable().getValueAt(row, 0)).toString());
					
					theView.getEditJButton().setEnabled(true);
					theView.getEditJButton().setForeground(Color.BLACK);
					
					theView.getDeleteDataJButton().setEnabled(true);
					theView.getDeleteDataJButton().setForeground(Color.BLACK);
					
					System.out.println(id);
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Daten konnten nicht selektiert werden!");
				}
			}
		});
		
	}
}

