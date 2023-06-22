package com.enigma.opo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Table(name = "mst_person")
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name ="system-uuid" ,strategy = "uuid")
    @Column(name = "customer_id")
    private String id;
    private String firstName;
    private String lastName;
    private Float Address;
    private String Birthday;
    private String Email;
    private String City;
    private String Country;

}