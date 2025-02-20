package com.springboot.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "contacts_master") //java class map with table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ContactsMasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    @Column(name = "contact_id") //variables are mapped with column
    private Integer contactId;

    @Column(name = "contact_name",nullable = false)
    private String contactName;

    @Column(name = "contact_number",nullable = false)
    private Long contactNumber;
}
