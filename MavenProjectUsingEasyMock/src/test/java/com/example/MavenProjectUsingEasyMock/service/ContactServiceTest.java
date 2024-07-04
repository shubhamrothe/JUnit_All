package com.example.MavenProjectUsingEasyMock.service;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Ignore;
import org.junit.Test;

import com.example.MavenProjectUsingEasyMock.dao.ContactDao;
import com.example.MavenProjectUsingEasyMock.entity.Contact;
import com.example.MavenProjectUsingEasyMock.exception.NoDataFoundException;

public class ContactServiceTest {
	@Test
	@Ignore
	public void getNameByIdTest() {	
		//Create a proxy
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);
		//setting behavior for proxy object
		EasyMock.expect(daoProxy.findNameById(102)).andReturn("Ashish");
		EasyMock.replay(daoProxy);
		
		ContactServiceImpl service = new ContactServiceImpl();
		service.setContactDao(daoProxy);
		
		String name = service.getNameById(102);
		assertNotNull(name);
	}

	@Test
	public void getAllNamesTest() {
		List<String> list = Arrays.asList("Shubham","Ratan","Rishabh");
		//create Mock Object
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);
		//set behavior for mock object
		EasyMock.expect(daoProxy.findAllNames()).andReturn(list);
		EasyMock.replay(daoProxy);
		//creating target object
		ContactServiceImpl service = new ContactServiceImpl();
		//Injecting proxy object into target(SI)
		service.setContactDao(daoProxy);
		
		List<String> allNames = service.getAllNames();
		
		assertNotNull(allNames);
		}
	
	@Test
	public void getContactByIdTest_01() {
		Contact contact = new Contact();
		contact.setContactName("Mahesh");
		contact.setContactNumber((long) 12345.00);
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);
		//setting behavior for proxy object
		EasyMock.expect(daoProxy.findById(10)).andReturn(contact);
		EasyMock.replay(daoProxy);
		
		ContactServiceImpl service = new ContactServiceImpl();
		service.setContactDao(daoProxy);
		
		Contact contactById = service.getContactById(10);
		assertNotNull(contactById);
	}
	
	@Test(expected= NoDataFoundException.class)
	public void getContactByIdTest_02() {
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);
		EasyMock.expect(daoProxy.findById(12)).andReturn(null);
		EasyMock.replay(daoProxy);
		ContactServiceImpl service = new ContactServiceImpl();
		service.setContactDao(daoProxy);
		
		service.getContactById(12);
	}
}
