import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	@Test
	void ContactServiceChildTest() {
		//tests that ContactService is child of Contact
		ContactService testContactService = new ContactService(ContactService.createID(), "Sherlock","Holmes","221B Baker St","1234567890");

		//Should be able to create Contact from ContactService if ContactService is Contact's child class
		Contact testContact = testContactService;
		
		assertEquals(testContact, testContactService);
	}
	@Test
	void IDTest() {
		//creates id
		String testID = ContactService.createID();
		
		//if createID() is working correctly, the ID should be 10 chars long
		assertEquals(10, testID.length(),"Length should be 10");
	}
	@Test
	void IDPrefixTest() {
		//create id
		String testID = ContactService.createID();
		
		//if createID() is working correctly, the prefix should be CON
		assertEquals("CON", testID.substring(0,3),"Prefix should be CON");
	}
	@Test
	void addContactTest() {
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Holmes","221B Baker St","1234567890");

		
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		
		//test that the Contact is in list
		assertEquals(testContact,ContactService.contacts.get(testContact.contactID));
	}
	@Test
	void delContactTest() {
		
		ContactService.contacts.clear(); //clears contacts map from previous tests
		
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Holmes","221B Baker St","1234567890");
		
		//add Contact to Contact list
		ContactService.addContact(testContact);
		
		//delete Contact
		ContactService.deleteContact(testContact);
		
		//verify that list is empty
		assertEquals(0,ContactService.contacts.size());
	}
	
	@Test
	void updateFirstNameTest() {
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Watson","221B Baker St","1234567890");
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		ContactService.setFirstName(testContact.getContactID(), "John");
		//test that the Contact is in list
		assertEquals("John",ContactService.contacts.get(testContact.contactID).getFirstName());
	}
	@Test
	void updateTooLongFirstNameTest() {
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Watson","221B Baker St","1234567890");
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		ContactService.setFirstName(testContact.getContactID(), "Johnxxxsdfsdfsdfa");
		//test that the Contact is in list
		assertEquals("Sherlock",ContactService.contacts.get(testContact.contactID).getFirstName());
	}
	@Test
	void updateLastNameTest() {
		Contact testContact = new Contact(ContactService.createID(), "John","Holmes","221B Baker St","1234567890");
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		ContactService.setLastName(testContact.getContactID(), "Watson");
		//test that the Contact is in list
		assertEquals("Watson",ContactService.contacts.get(testContact.contactID).getLastName());
	}
	@Test
	void updateTooLongLastNameTest() {
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Watson","221B Baker St","1234567890");
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		ContactService.setLastName(testContact.getContactID(), "Watsons;lfjsaldfjas");
		//test that the Contact is in list
		assertEquals("Watson",ContactService.contacts.get(testContact.contactID).getLastName());
	}
	
	@Test
	void updatePhoneTest() {
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Watson","221B Baker St","1234567890");
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		ContactService.setPhone(testContact.getContactID(), "0123456789");
		//test that the Contact is in list
		assertEquals("0123456789",ContactService.contacts.get(testContact.contactID).getPhone());
	}
	
	@Test
	void updateTooShortPhoneTest() {
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Watson","221B Baker St","1234567890");
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		ContactService.setPhone(testContact.getContactID(), "3");
		//test that the Contact is in list
		assertEquals("1234567890",ContactService.contacts.get(testContact.contactID).getPhone());
	}
	
	@Test
	void updateAddressTest() {
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Watson","221B Baker St","1234567890");
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		ContactService.setAddress(testContact.getContactID(), "221C Baker St");
		//test that the Contact is in list
		assertEquals("221C Baker St",ContactService.contacts.get(testContact.contactID).getAddress());
	}	@Test
	void updateTooLongAddressTest() {
		Contact testContact = new Contact(ContactService.createID(), "Sherlock","Watson","221B Baker St","1234567890");
		//add Contact to list of contacts
		ContactService.addContact(testContact);
		ContactService.setAddress(testContact.getContactID(), "221B Baker Stjsaldjf;lasdj;flajsdlkjfalsdjflkajsd;flkjasd");
		//test that the Contact is in list
		assertEquals("221B Baker St",ContactService.contacts.get(testContact.contactID).getAddress());
	}
}

