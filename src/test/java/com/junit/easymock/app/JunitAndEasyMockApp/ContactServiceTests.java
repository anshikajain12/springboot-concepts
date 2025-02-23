package com.junit.easymock.app.JunitAndEasyMockApp;

import com.junit.easymock.app.JunitAndEasyMockApp.customException.NoDataFoundException;
import com.junit.easymock.app.JunitAndEasyMockApp.dao.ContactDao;
import com.junit.easymock.app.JunitAndEasyMockApp.model.Contact;
import com.junit.easymock.app.JunitAndEasyMockApp.service.ContactServiceImpl;
import org.easymock.EasyMock;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ContactServiceTests {
    private static ContactServiceImpl service = null;

    @DisplayName("initialize the easy mock proxy to contactDao")
    @BeforeAll
    public static void init() {
        //creating proxy
        ContactDao daoProxy = EasyMock.createMock(ContactDao.class);

        //setting behaviour for proxy 1st testcase
        EasyMock.expect(daoProxy.findNameById(101)).andReturn("Anshika");
        EasyMock.expect(daoProxy.findNameById(102)).andReturn("AJ");

        //setting behaviour for proxy for 2nd testcase
        List<String> names = Arrays.asList("John", "Smith", "Peter");
        EasyMock.expect(daoProxy.findNames()).andReturn(names);

        //setting behaviour for proxy for 3rd testcase
        Contact c = new Contact();
        c.setContactId(101);
        c.setContactNumber(1234567891l);
        c.setContactName("ABC");
        EasyMock.expect(daoProxy.findById(101)).andReturn(c);
        EasyMock.expect(daoProxy.findById(201)).andReturn(null);

        //saving proxy behaviour
        EasyMock.replay(daoProxy);

        //injecting proxy object to target object
        service = new ContactServiceImpl();
        service.setContactDao(daoProxy);

    }

    @DisplayName("find name by 101 id")
    @Test
    public void testGetNameById_1() {
        String name = service.getNameById(101);
        System.out.println(name);
        assertNotNull(name);
    }

    @DisplayName("get all the names from db using easymock")
    @Test
    @Ignore
    public void testGetAllNamesList() {
        List<String> allContactNames = service.getAllContactNames();
        System.out.println(allContactNames);
        assertNotNull(allContactNames);
    }

    @DisplayName("get contact service using easymock")
    @Test
    public void testContactService() {
        Contact contactById = service.getContactById(101);
        assertNotNull(contactById);
    }

    @DisplayName("get contact service using easymock")
    @Test
    public void testContactService_0Id() {
        assertThrows(NoDataFoundException.class, () -> {
            service.getContactById(201);
        });
    }
}
