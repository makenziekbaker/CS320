/*
 * Makenzie Baker
 * CS 320
 * 3-2 Milestone
 * due 9/21/25
 * 
 * */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ContactTest {

	@Test
	void testContractID() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlock","Holmes","221B Baker St","1234567890");

		assertEquals("CONXXXXXXX",testContact.getContactID(), "The Contact ID should be 10 chars or less.");
	}
	@Test
	void testTooLongContractID() {
		Contact testContact = new Contact("CONXXXXXXXXXXXXXXXXXXXX", "Sherlock","Holmes","221B Baker St","1234567890");
		assertEquals("N/a",testContact.getContactID(), "Contact ID too long.");
	}

	@Test
	void testFirstName() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlock","Holmes","221B Baker St","1234567890");
		assertEquals("Sherlock",testContact.getFirstName(), "The first name should be 10 chars or less.");
	}
	@Test
	void testTooLongFirstName() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlockasdafs","Holmes","221B Baker St","1234567890");
		assertEquals("N/a",testContact.getFirstName(), "The first name should be 10 chars or less.");
	}

	@Test
	void testLastName() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlock","Holmes","221B Baker St","1234567890");
		assertEquals("Holmes",testContact.getLastName(), "The last name should be 10 chars or less.");
	}
	@Test
	void testTooLongLastName() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlock","Holmesasdjaklf","221B Baker St","1234567890");
		assertEquals("N/a",testContact.getLastName(), "The last name should be 10 chars or less.");
	}
	@Test
	void testNumber() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlock","Holmes","221B Baker St","1234567890");
		assertEquals("1234567890",testContact.getPhone(), "The phone number should be 10 chars long.");
	}
	@Test
	void testTooShortNumber() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlock","Holmes","221B Baker St","3");
		assertEquals("N/a",testContact.getPhone(), "The phone number should be 10 chars long.");
	}
	@Test
	void testAddress() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlock","Holmes","221B Baker St","1234567890");
		assertEquals("221B Baker St",testContact.getAddress(), "The address should be 30 chars or less.");
	}
	@Test
	void testAddressTooLong() {
		Contact testContact = new Contact("CONXXXXXXX", "Sherlock","Holmes","221B Baker Stas;dlfjasldkfjalskdjflkasjd;fljkas","1234567890");
		assertEquals("N/a",testContact.getAddress(), "The address should be 30 chars or less.");
	}
}
