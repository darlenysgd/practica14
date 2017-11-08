package com.vaadin.Clases;

/**
 * Created by darle on 11/7/2017.
 */
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}