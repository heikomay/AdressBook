package de.digitalmedia.DAO;

public class BankAccount {
	
	private int bankAccountId;
	private String bank;
	private String bankAccountNumber;
	private String sortCode;
	private String other;
	private int customId;
	
	
	//public BankAccount(int bankAccountId, String bank, String bankAccountNumber, String sortCode, String other, int customId) {
		//this.bankAccountId = bankAccountId;
		
	public BankAccount(String bank, String bankAccountNumber, String sortCode, String other) {
		
		this.bank = bank;
		this.bankAccountNumber = bankAccountNumber;
		this.sortCode = sortCode;
		this.other = other;
	}
	
	public BankAccount(int bankAccountId, String bank, String bankAccountNumber, String sortCode, String other) {
		this.bankAccountId = bankAccountId;
		this.bank = bank;
		this.bankAccountNumber = bankAccountNumber;
		this.sortCode = sortCode;
		this.other = other;
	}


	public int getCustomId() {
		return customId;
	}

	public void setCustomId(int customId) {
		this.customId = customId;
	}

	public int getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	
	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}
	
}
