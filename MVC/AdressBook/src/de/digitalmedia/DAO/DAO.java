package de.digitalmedia.DAO;

import java.sql.SQLException;
import java.util.List;

// Generic Interface
public interface DAO<T> {
	
	// Return Emloyee Object, id of Employee Objekt
	T getEmployeeId(int id) throws SQLException;
	
	// Alle Employee
	List<T> getAllEmployee();
	
	int save(T t) throws SQLException;
	
	int insert(T t);
	
	int update(T t)  throws SQLException;
	
	int delete(T t)  throws SQLException;
}
