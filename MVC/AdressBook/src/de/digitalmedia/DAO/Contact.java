package de.digitalmedia.DAO;

public class Contact {
	
	private int contactId;
	private String name;
	private String lastName;
	private String street;
	private String postalCode;
	private String email;
	private String phone;
	private String born;
	private int bankAccountId;
	
	private BankAccount bankAccount;
	private Custom custom;
	
	public Contact(int contactId, String name, String lastName, String street, String postalCode, String email, String phone,
			String born) {
		
		this.contactId = contactId;
		this.name = name;
		this.lastName = lastName;
		this.street = street;
		this.postalCode = postalCode;
		this.email = email;
		this.phone = phone;
		this.born = born;
		//this.bankAccountId = bankAccountId;
		
		//this.bankAccount = new BankAccount();
		
		//this.custom = new Custom(customID, customFieldOne, customFieldTwo, customFieldThree, customFieldFour);
		
	}
	
	public Contact(String name, String lastName, String street, String postalCode, String email, String phone,
			String born) {
		
		this.name = name;
		this.lastName = lastName;
		this.street = street;
		this.postalCode = postalCode;
		this.email = email;
		this.phone = phone;
		this.born = born;
		//this.bankAccountId = bankAccountId;
		
		//this.bankAccount = new BankAccount();
		
		//this.custom = new Custom(customID, customFieldOne, customFieldTwo, customFieldThree, customFieldFour);
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bank, String bankAccountNumber, String sortCode, String other) {
	
		this.bankAccount = new BankAccount(bank, bankAccountNumber, sortCode, other);
	}
	
	public void setBankAccount(int bankAccountId, String bank, String bankAccountNumber, String sortCode, String other) {
		
		this.bankAccount = new BankAccount(bankAccountId, bank, bankAccountNumber, sortCode, other);
	}
	
//public void setBankAccount(int bankAccountID, String bank,  String bankAccountNumber, String sortCode, String other, int customId) {
		
		//this.bankAccount = new BankAccount(bankAccountID, bank, bankAccountNumber, sortCode, other, customId);
	//}

	public Custom getCustom() {
		return custom;
	}

	public void setCustom(String customFieldOne, String customFieldTwo, String customFieldThree, String customFieldFour) {
		
		this.custom = new Custom(customFieldOne, customFieldTwo, customFieldThree, customFieldFour);
	}
	
	public void setCustom(int customId, String customFieldOne, String customFieldTwo, String customFieldThree, String customFieldFour) {
		
		this.custom = new Custom(customId, customFieldOne, customFieldTwo, customFieldThree, customFieldFour);
	}
	
}
