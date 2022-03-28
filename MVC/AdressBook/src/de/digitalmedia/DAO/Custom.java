package de.digitalmedia.DAO;

public class Custom {
	
	private int customId;
	private String customFieldOne;
	private String customFieldTwo;
	private String customFieldThree;
	private String customFieldFour;
	
	public Custom(String customFieldOne, String customFieldTwo, String customFieldThree,
			String customFieldFour) {
	
		this.customFieldOne = customFieldOne;
		this.customFieldTwo = customFieldTwo;
		this.customFieldThree = customFieldThree;
		this.customFieldFour = customFieldFour;
	}
	
	public Custom(int customId, String customFieldOne, String customFieldTwo, String customFieldThree,
			String customFieldFour) {
		this.customId = customId;
		this.customFieldOne = customFieldOne;
		this.customFieldTwo = customFieldTwo;
		this.customFieldThree = customFieldThree;
		this.customFieldFour = customFieldFour;
	}

	public int getCustomId() {
		return customId;
	}

	public void setCustomId(int customId) {
		this.customId = customId;
	}

	public String getCustomFieldOne() {
		return customFieldOne;
	}

	public void setCustomFieldOne(String customFieldOne) {
		this.customFieldOne = customFieldOne;
	}

	public String getCustomFieldTwo() {
		return customFieldTwo;
	}

	public void setCustomFieldTwo(String customFieldTwo) {
		this.customFieldTwo = customFieldTwo;
	}

	public String getCustomFieldThree() {
		return customFieldThree;
	}

	public void setCustomFieldThree(String customFieldThree) {
		this.customFieldThree = customFieldThree;
	}

	public String getCustomFieldFour() {
		return customFieldFour;
	}

	public void setCustomFieldFour(String customFieldFour) {
		this.customFieldFour = customFieldFour;
	}
}
