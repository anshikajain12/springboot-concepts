package com.junit.easymock.app.JunitAndEasyMockApp.service;

import com.junit.easymock.app.JunitAndEasyMockApp.model.Contact;

import java.util.List;

public interface ContactService {
    public String getNameById(Integer id);

    public List<String> getAllContactNames();

    public Contact getContactById(Integer id);
}
