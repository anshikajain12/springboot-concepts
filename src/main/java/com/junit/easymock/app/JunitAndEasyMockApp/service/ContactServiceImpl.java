package com.junit.easymock.app.JunitAndEasyMockApp.service;

import com.junit.easymock.app.JunitAndEasyMockApp.customException.NoDataFoundException;
import com.junit.easymock.app.JunitAndEasyMockApp.dao.ContactDao;
import com.junit.easymock.app.JunitAndEasyMockApp.model.Contact;

import java.util.List;


public class ContactServiceImpl implements ContactService {
    private ContactDao contactDao;

    public ContactDao getContactDao() {
        return contactDao;
    }

    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    @Override
    public String getNameById(Integer id) {
        String name = contactDao.findNameById(id);
        //logic
        return name.toUpperCase();
    }

    @Override
    public List<String> getAllContactNames() {
        List<String> names = contactDao.findNames();
        if (!names.isEmpty()) {
            return names;
        }
        return null;
    }

    @Override
    public Contact getContactById(Integer id) {
        Contact contact = contactDao.findById(id);
        if (contact == null) {
            throw new NoDataFoundException();
        }
        return contact;
    }
}
