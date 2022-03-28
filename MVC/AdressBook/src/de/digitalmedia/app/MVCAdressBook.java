package de.digitalmedia.app;

import de.digitalmedia.MVC.*;

public class MVCAdressBook {

	public static void main(String[] args) {
		
		AdressBookView theView = new AdressBookView();
		
		// New Contact Controller + View
		AdressBookViewNC theViewNC = new AdressBookViewNC();
		
		AdressBookViewEdit theViewNCEdit = new AdressBookViewEdit();
		
		AdressBookController theController = new AdressBookController(theView, theViewNC, theViewNCEdit);
		
		theView.setVisible(true);
		
		//AdressBookControllerNC theControllerNC = new AdressBookControllerNC(theViewNC);
		
		
		
	
	}

}
