package com.springboot.jpa.repositories;

import com.springboot.jpa.entity.ContactsMasterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> {

}
