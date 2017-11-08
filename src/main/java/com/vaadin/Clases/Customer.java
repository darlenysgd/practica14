package com.vaadin.Clases;

/**
 * Created by darle on 11/7/2017.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * A entity object, like in any other Java application. In a typical real world
 * application this could for example be a JPA entity.
 */

@Entity
public class Customer  {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName = "";

    private String lastName = "";

    private String email = "";


    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email
     *            new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the value of status
     *
     * @return the value of status
     */



    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName
     *            new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName
     *            new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isPersisted() {
        return id != null;
    }


    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s', email='%s']", id,
                firstName, lastName, email);
    }

}