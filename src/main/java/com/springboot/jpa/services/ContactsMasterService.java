package com.springboot.jpa.services;

import com.springboot.jpa.entity.ContactsMasterEntity;
import com.springboot.jpa.repositories.ContactsMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactsMasterService {
    @Autowired
    private ContactsMasterRepo contactsMasterRepo;

    //create a new entity
    public ContactsMasterEntity createContactsMasterEntity(ContactsMasterEntity contactsMasterEntity) {
        return contactsMasterRepo.save(contactsMasterEntity);
    }

    //get all the Entity
    public List<ContactsMasterEntity> getAllContactsMasterEntity() {
        return (List<ContactsMasterEntity>) contactsMasterRepo.findAll();
    }

    //get entity by id (id is pk
    public Optional<ContactsMasterEntity> getContactById(Integer contacts_id) {
        return contactsMasterRepo.findById(contacts_id);
    }

    //update the entity by id
    public ContactsMasterEntity updateContactsMasterEntity(Integer contacts_id, ContactsMasterEntity masterEntity) {
        return contactsMasterRepo.findById(contacts_id).map(contactsMasterEntity -> {
            contactsMasterEntity.setContactName(masterEntity.getContactName());
            contactsMasterEntity.setContactNumber(masterEntity.getContactNumber());
            return contactsMasterRepo.save(contactsMasterEntity);
        }).orElseThrow(() -> new RuntimeException("Contact master entity not found"));
    }

    //delete entity by id
    public void deleteContactMasterEntity(Integer id) {
        contactsMasterRepo.deleteById(id);
    }
}
