package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import com.example.demo.dao.ContactDao;
import com.example.demo.entity.Contact;

class ContactServiceImplTest {


	
	@Test
	public void getAllContactNameTest() {
		//create proxy of ContactDao
	ContactDao proxyDao = EasyMock.createMock(ContactDao.class);
	//create a list because ContactDao's method returns a list
	List<String> names= Arrays.asList("Shubham","Ram");
	//Instead of calling actual method of ContactDao , call this proxyDao
	EasyMock.expect( proxyDao.findAllContactNames()).andReturn(names);
	//it will help to switch from ContactDao to proxyDao
	EasyMock.replay(proxyDao);
	
	ContactServiceImpl impl =new ContactServiceImpl();
	impl.setContactDao(proxyDao);
	List<String> list = impl.getAllContactName();
	int expectedNamesSize=2;
	assertEquals(expectedNamesSize, list.size());
	}
	
	@Test
	public void getContactByIdTest() {
		ContactDao proxyDao = EasyMock.createMock(ContactDao.class);
		Contact contact = new Contact();
		contact.setContactId(5);
		contact.setContactName("Rishabh");
		contact.setContactNumber(77458);
		EasyMock.expect(proxyDao.findById(5)).andReturn(Optional.of(contact));  // ----------->
		EasyMock.replay(proxyDao);
		
		//dependency injection by setter
		ContactServiceImpl impl =new ContactServiceImpl();
		impl.setContactDao(proxyDao);
		
		Contact actualcontactById = impl.getContactById(5);
		assertEquals(contact, actualcontactById);
				
	}
	
	@Test
	public void getNameById() {
	    ContactDao proxyDao = EasyMock.createMock(ContactDao.class);
	    Contact contact = new Contact();
	    
	    contact.setContactId(10);
	    contact.setContactName("Ratan");
	    
	    EasyMock.expect(proxyDao.findNameById(10)).andReturn("Ratan");
	    EasyMock.replay(proxyDao);
	    
	    ContactServiceImpl impl = new ContactServiceImpl();
	    impl.setContactDao(proxyDao);
	    

	    String actualName = impl.getNameById(10);
	    assertEquals("RATAN", actualName);
	}
}
