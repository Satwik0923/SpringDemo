package com.satwik.spring.standalonecollection;

import java.util.List;

public class Products {

    private List phones;

    public List getPhones() {
        return phones;
    }

    public void setPhones(List phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Products{" +
                "phones=" + phones +
                '}';
    }
}
