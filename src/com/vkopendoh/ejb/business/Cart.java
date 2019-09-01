package com.vkopendoh.ejb.business;


import com.vkopendoh.ejb.exceptions.BookException;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface Cart {
    public void initialize(String person) throws BookException;

    public void initialize(String person, String id)
            throws BookException;

    public void addBook(String title);

    public void removeBook(String title) throws BookException;

    public List<String> getContents();

    public void remove();

    public String getCustomerName();

    public String getCustomerId();

}