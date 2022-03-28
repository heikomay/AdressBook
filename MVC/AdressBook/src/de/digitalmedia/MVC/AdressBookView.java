package de.digitalmedia.MVC;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import de.digitalmedia.DAO.Contact;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;

public class AdressBookView extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JScrollPane scrollPane;
	private JMenuBar menuBar;
	private JButton btnDelete;
	private JButton btnNewContact;
	private JButton btnToEdit;

	
	/**
	 * Create the frame.
	 */
	public AdressBookView() {
		this.getContentPane().setBackground(new Color(119, 136, 153));
		this.setBounds(100, 100, 1046, 607);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Adressbuch 1.0");
		setResizable(false);
		this.setLocationRelativeTo(null);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1038, 555);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(255, 255, 255));
		table.setRowHeight(table.getRowHeight() + 10);
		
		//table.setRowSelectionAllowed(true);
		scrollPane.setViewportView(table);
		
		
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		btnNewContact = new JButton("Neuer Kontakt");
		btnNewContact.setOpaque(false);
		btnNewContact.setContentAreaFilled(false);
		btnNewContact.setFocusPainted(false);
		btnNewContact.setBorderPainted(false);
		menuBar.add(btnNewContact);
		
		btnDelete = new JButton("L\u00F6schen");
		btnDelete.setForeground(Color.GRAY);
		btnDelete.setOpaque(false);
		btnDelete.setContentAreaFilled(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setBorderPainted(false);
		btnDelete.setEnabled(false);
		
		menuBar.add(btnDelete);
		
		
		btnToEdit = new JButton("Bearbeiten");
		btnToEdit.setForeground(Color.GRAY);
		btnToEdit.setOpaque(false);
		btnToEdit.setContentAreaFilled(false);
		btnToEdit.setFocusPainted(false);
		btnToEdit.setBorderPainted(false);
		btnToEdit.setEnabled(false);
		
		menuBar.add(btnToEdit);
		
	}
		
		public void setJTableData(List<Contact> contacts) {
		
		initializeJTableHeader();
		
		try {
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		List<Contact> list = contacts;
		
		Object rowData[] = new Object[4];
		
		for(int i = 0; i < list.size(); i++) { 
			//rowData[0] = new //ImageIcon("contactIcon.png"); 
			rowData[0] = list.get(i).getContactId();
			rowData[1] = list.get(i).getName() + " " + list.get(i).getLastName();
			rowData[2] = list.get(i).getEmail(); 
			rowData[3] = list.get(i).getPhone();
			
			model.addRow(rowData); 
			
		}
			  
		} catch (Exception e2) {
			  
			JOptionPane.showMessageDialog(null, "Daten konnten nicht geladen werden!"); 
		}
	}
	
	private void initializeJTableHeader() {
		// Create Table Header 
		table.setModel(new DefaultTableModel(new Object [][] {}, new String [] {"ID", "Name", "E-Mail", "Telefon"}) {
							
			// Disable isCellEditable 
			private static final long serialVersionUID = 1L;
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});
		
		// Hide first Cell
		table.getColumnModel().getColumn(0).setWidth(0);
		table.getColumnModel().getColumn(0).setMinWidth(0);
		table.getColumnModel().getColumn(0).setMaxWidth(0);
		
		// Table Header Left Align
		((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer())
	    .setHorizontalAlignment(JLabel.LEFT);
		
		// Hide Table Grid
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		
	}
	
	
	
	public JButton getDeleteDataJButton() {
		return btnDelete;
	}
	
	public JButton getEditJButton() {
		return btnToEdit;
	}
	
	public JButton getNewContactJButton() {
		return btnNewContact;
	}
	
	public JTable getJTable() {
		return table;
	}
	
	public JScrollPane getJScrollPane() {
		return scrollPane;
	}
}
