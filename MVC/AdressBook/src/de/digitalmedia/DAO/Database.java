package de.digitalmedia.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Database {
	
	public static Connection getConnection()  {
		
		try {
			
			// Klassendatei des Treibers zur Laufzeit in den Speicher laden
			// Während des Ladens registriert sich der Treiber automatisch bei JDBC
			Class.forName("org.sqlite.JDBC");
			
			// Verbindung zur Datenbank herstellen
			// getConnection ist überladende Methode
			// getConnection (URL, Benutzername, Passwort)
			// getConnection (URL);
			// Rückgabe an Login
			// Connection ist Referenzvariable, Drivermanager gibt Objekt zurück!
			Connection conn = DriverManager.getConnection("jdbc:sqlite:AdressBook.db");
			
			
			// Ausgabe Verbindung erfolgreich
			//JOptionPane.showMessageDialog(null, "Verbindung zur Datenbank wurde hergestellt");
			
			// Rückgabe Verbindung Datenbank
			return conn;
		
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e);
			
			return null;
		}
	}
}
