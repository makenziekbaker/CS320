/*
 * Makenzie Baker
 * CS 320
 * 3-2 Milestone
 * due 9/21/25
 * 
 * */
/*
 * Contact
 * 
 * Stores all the important information for a contact like a unique id, 
 * the contact's first name, last name, phone number, and address.
 * 
 * */
public class Contact {
	//creates all the variables for a contact
	final String contactID;
	String firstName, lastName, phone, address = "";

	//Initializes data members for Contact
	public Contact(String contactID, String firstName, String lastName, String address, String phone) {
		
		//contactID
		if(contactID.length()<=10) {
			this.contactID = contactID;
		} else {
			this.contactID = "N/a";
		}
		
		//firstName
		if(firstName.length()<=10) {
			this.firstName = firstName;
		} else {
			this.firstName = "N/a";
		}
		
		//lastName
		if(lastName.length()<=10) {
			this.lastName = lastName;
		} else {
			this.lastName = "N/a";
		}
		
		//address
		if(address.length()<=30) {
			this.address = address;
		} else {
			this.address="N/a";
		}
		
		//phone number
		if(phone.length()==10) {
			this.phone = phone;
		} else {
			this.phone = "N/a";
		}

	}
	
	
	//Retrieves information for Contact variable
	String getContactID() {
		return this.contactID;
	}
	String getFirstName() {
		return this.firstName;
	}
	String getLastName() {
		return this.lastName;
	}
	String getAddress() {
		return this.address;
	}
	String getPhone() {
		return this.phone;
	}
	
}
