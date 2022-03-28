package de.digitalmedia.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	// CRUD - Retrieve (Abrufen)
	@Override
	public Contact getEmployeeId(int id) throws SQLException {
		
		Connection con = Database.getConnection();
		Contact contact = null;
		
		String sql = "SELECT * FROM Contact WHERE ContactID = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		System.out.println("Ausgabe ID");
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			int contactID = rs.getInt("ContactID");
			String name = rs.getString("Name");
			String lastName = rs.getString("LastName");
			String street = rs.getString("Street");
			String postalCode = rs.getString("PostalCode");
			String email = rs.getString("Email");
			String phone = rs.getString("Phone");
			String born = rs.getString("Born");
			
			contact = new Contact(contactID, name, lastName, street, postalCode, email, phone ,born);
		}
		
		ps.close();
		rs.close();
		con.close();
		
		return contact;
	}
	
	
	// CRUD - Retrieve All
	@Override
	public List<Contact> getAllEmployee()  {
		
		List<Contact> contacts = new ArrayList<>();
		
		try {
			
			Connection con = Database.getConnection();
			
			String sql = "SELECT * FROM Contact";
			
			Statement stat = con.createStatement();
			
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				
				// Contact
				int contactID = rs.getInt("ContactID");
				String name = rs.getString("Name");
				String lastName = rs.getString("LastName");
				String street = rs.getString("Street");
				String postalCode = rs.getString("PostalCode");
				String email = rs.getString("Email");
				String phone = rs.getString("Phone");
				String born = rs.getString("Born");
				
				// BankAccount
				//int bankAccountID = rs.getInt("BankAccountID");
				//String bank = rs.getString("Bank");
				//String bankAccountNumber = rs.getString("BankAccountNumber");
				//String sortCode = rs.getString("SortCode");
				//String other = rs.getString("Other");
				
				// Custom
				//int customID = rs.getInt("CustomID"); String customFieldOne =
				//rs.getString("CustomFieldOne"); String customFieldTwo =
				//rs.getString("CustomFieldTwo"); String customFieldThree =
				//rs.getString("CustomFieldThree"); String customFieldFour =
				//rs.getString("CustomFieldFour");
				 
			
				// Create Object From SQL Statement
				Contact contact = new Contact(contactID, name, lastName, street, postalCode, email, phone ,born);
				
				//contact.setBankAccount(bankAccountID, bank, bankAccountNumber, sortCode, other);
				//contact.setCustom(customID, customFieldOne, customFieldTwo, customFieldThree, customFieldFour);
				
				contacts.add(contact);
			}
			
			rs.close();
			con.close();
			
			
		}
		catch (SQLException e) {
		    System.out.println("Exception happened! Abort! Abort!");
		   
		}
		
		return contacts;
		
	}
	
	// CRUD - Create or Update
	@Override
	public int save(Contact contact) throws SQLException {
		return 0;
	}
	
	// Insert into Database
	@Override
	public int insert(Contact contact) {
		
		int result = 0;
		PreparedStatement ps;
		
		try {
		
		
		Connection con = Database.getConnection();
		
		String insertIntoContact = "INSERT INTO Contact (Name, LastName, Street, PostalCode, Email, Phone, Born) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		
		ps = con.prepareStatement(insertIntoContact);
		
		// Contact
		ps.setString(1, contact.getName());
		ps.setString(2, contact.getLastName());
		ps.setString(3, contact.getStreet());
		ps.setString(4, contact.getPostalCode());
		ps.setString(5, contact.getEmail());
		ps.setString(6, contact.getPhone());
		ps.setString(7, contact.getBorn());
		//ps.setInt(8, contact.getBankAccount().getBankAccountId());
		
		result = ps.executeUpdate();
		
		//String insertIntoBankAccount = "INSERT INTO BankAccount (Bank, BankAccountNumber, SortCode, Other) VALUES (?, ?, ?, ?)";
		
		//ps = con.prepareStatement(insertIntoBankAccount);
		
		//ps.setString(1, contact.getBankAccount().getBank());
		//ps.setString(2, contact.getBankAccount().getBankAccountNumber());
		//ps.setString(3, contact.getBankAccount().getSortCode());
		//ps.setString(4, contact.getBankAccount().getOther());
		
		//result = ps.executeUpdate();
		
		//String insertIntoCustom = "INSERT INTO Custom (CustomFieldOne, CustomFieldTwo, CustomFieldThree, CustomFieldFour) VALUES (?, ?, ?, ?)";
		
		//ps = con.prepareStatement(insertIntoCustom);
		
		//ps.setString(1, contact.getCustom().getCustomFieldOne());
		//ps.setString(2, contact.getCustom().getCustomFieldTwo());
		//ps.setString(3, contact.getCustom().getCustomFieldThree());
		//ps.setString(4, contact.getCustom().getCustomFieldFour());
		
		//result = ps.executeUpdate();
		
		ps.close();
		con.close();
		
		} catch (SQLException e) {
		    System.out.println("Daten konnten nicht eingefügt werden!");
		}
		
		return result;
	}

	@Override
	public int update(Contact contact) throws SQLException {
		System.out.println("Update!");
		Connection con = Database.getConnection();
		
		String sql = "UPDATE Contact set Name = ?, LastName = ?, Street = ?, PostalCode = ?, Email = ?, Phone = ?, Born = ? where ContactID = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ps.setString(1, contact.getName());
		ps.setString(2, contact.getLastName());
		ps.setString(3, contact.getStreet());
		ps.setString(4, contact.getPostalCode());
		ps.setString(5, contact.getEmail());
		ps.setString(6, contact.getPhone());
		ps.setString(7, contact.getBorn());
		ps.setInt(8, contact.getContactId());
		
		int result = ps.executeUpdate();
		
		ps.close();
		con.close();
		
		return result;
	}

	@Override
	public int delete(Contact contact) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "DELETE FROM Contact WHERE ContactID = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, contact.getContactId());
		
		int result = ps.executeUpdate();
		
		
		ps.close();
		con.close();
		
		return result;
	}

}
