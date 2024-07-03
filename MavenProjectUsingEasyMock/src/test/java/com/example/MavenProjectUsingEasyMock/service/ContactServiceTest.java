package com.example.MavenProjectUsingEasyMock.service;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.example.MavenProjectUsingEasyMock.dao.ContactDao;

public class ContactServiceTest {

	@Test
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

}
