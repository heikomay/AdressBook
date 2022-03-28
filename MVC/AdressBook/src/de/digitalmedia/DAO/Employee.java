package de.digitalmedia.DAO;

public class Employee {
	
	private int EID;
	private String Name;
	private String Surname;
	private int Age;
	
	public Employee(int eID, String name, String surname, int age) {
		
		this.EID = eID;
		this.Name = name;
		this.Surname = surname;
		this.Age = age;
	}

	public int getEID() {
		return EID;
	}

	public void setEID(int eID) {
		EID = eID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [EID=" + EID + ", Name=" + Name + ", Surname=" + Surname + ", Age=" + Age + "]";
	}
	
	
}	
	
	/*public Employee(int id, int employeeId, String firstName, String lastName, int deptId) {
		this.id = id;
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptId = deptId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", deptId=" + deptId + "]";
	}

}*/
