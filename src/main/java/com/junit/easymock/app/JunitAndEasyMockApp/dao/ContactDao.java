package com.junit.easymock.app.JunitAndEasyMockApp.dao;

import com.junit.easymock.app.JunitAndEasyMockApp.model.Contact;

import java.util.List;

public interface ContactDao {

    public String findNameById(Integer id);

    public List<String> findNames();

    public Contact findById(Integer id);
}
