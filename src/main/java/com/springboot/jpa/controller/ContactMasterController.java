package com.springboot.jpa.controller;

import com.springboot.jpa.entity.ContactsMasterEntity;
import com.springboot.jpa.services.ContactsMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contactsMaster")
public class ContactMasterController {

    @Autowired
    private ContactsMasterService contactsMasterService;

    //create a new contact
    @PostMapping("/add")
    public ContactsMasterEntity createEntity(@RequestBody ContactsMasterEntity entity) {
        return contactsMasterService.createContactsMasterEntity(entity);
    }

    //get all entity
    @GetMapping("/all")
    public List<ContactsMasterEntity> getAllEntity() {
        return contactsMasterService.getAllContactsMasterEntity();
    }

    //get entity by id
    @GetMapping("/{id}")
    public Optional<ContactsMasterEntity> getContactMasterEntityById(@PathVariable Integer id) {
        return contactsMasterService.getContactById(id);
    }

    //update entity by id
    @PutMapping("/update/{id}")
    public ContactsMasterEntity updateEntityById(@PathVariable Integer id, @RequestBody ContactsMasterEntity entity) {
        return contactsMasterService.updateContactsMasterEntity(id, entity);
    }

    //delete entity by id
    @DeleteMapping("/delete/{id}")
    public String deleteEntityById(@PathVariable Integer id) {
        contactsMasterService.deleteContactMasterEntity(id);
        return "Contacts Master Entity deleted successfully!!";
    }
}
