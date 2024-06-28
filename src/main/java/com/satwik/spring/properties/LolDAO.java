package com.satwik.spring.properties;

public class LolDAO {

    private String dburl;

    public LolDAO(String dburl) {
        this.dburl = dburl;
    }

    @Override
    public String toString() {
        return "LolDAO{" +
                "dburl='" + dburl + '\'' +
                '}';
    }
}
