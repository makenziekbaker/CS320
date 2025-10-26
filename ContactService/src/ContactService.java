/*
 * Makenzie Baker
 * CS 320
 * 3-2 Milestone
 * due 9/21/25
 * 
 * */

import java.util.*;
/*
 * ContactService 
 * 
 * Carries out all the services for a Contact
 * (ie create id, update data member, add contact to contact list, etc)
 * 
 * */
public class ContactService extends Contact {
	public ContactService(String contactID, String firstName, String lastName, String address, String number) {
		super(contactID, firstName, lastName, address, number);
		
	}

	//creates random ID that will look like CONXXXXXXX (with the X's being random letters or numbers) once generated
	public static String createID() {
	//will use UUID to generate a random set of alphanumeric characters
	String longID= "CON"+UUID.randomUUID().toString();	
	
	//will return only first 10 characters of generated ID
	return longID.substring(0,10);
}
	

	//will keep list of contacts, stored with the contact ID as the contact's key 
	public static Map<String, Contact> contacts = new HashMap<>();
	
	//will add contact to contact map
	public static Map<String,Contact> addContact(Contact contactToAdd)
	{
		contacts.put(contactToAdd.contactID, contactToAdd);
		return contacts;
	}
	//will delete contact from contact map
	public static Map<String,Contact> deleteContact(Contact contactDel)
	{
		contacts.remove(contactDel.contactID);
		return contacts;
	}

	
	/*
	 * The below methods will update a contact's information. 
	 * 
	 * Since the contact ID was set as a constant, it won't be able to be updated, 
	 * per the project's requirements.
	 * */
	//update firstName
	public static void setFirstName(String contactID, String firstName) {
		Contact updatedContact = contacts.get(contactID);
		if(firstName.length()<=10) {
			updatedContact.firstName = firstName;
			contacts.replace(contactID, updatedContact);
		}
	}
	//update lastName
	public static void setLastName(String contactID, String lastName) {
		Contact updatedContact = contacts.get(contactID);
		if(lastName.length()<=10) {
			updatedContact.lastName = lastName;
			contacts.replace(contactID, updatedContact);
		}
	}
	
	//update phone
	public static void setPhone(String contactID, String phone) {
		Contact updatedContact = contacts.get(contactID);

		if(phone.length()==10) {
			updatedContact.phone = phone;
			contacts.replace(contactID, updatedContact);
		}
	}
	
	//update address
	public static void setAddress(String contactID, String address) {
		Contact updatedContact = contacts.get(contactID);

		if(address.length()<=30) {
			updatedContact.address = address;
			contacts.replace(contactID, updatedContact);
		}
	}
}

