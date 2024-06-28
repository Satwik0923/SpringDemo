package com.satwik.spring.autowire.annotations;

public class Dig {

    private String condition;
    private String medicine1;
    private String medicine2;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMedicine1() {
        return medicine1;
    }

    public void setMedicine1(String medicine1) {
        this.medicine1 = medicine1;
    }

    public String getMedicine2() {
        return medicine2;
    }

    public void setMedicine2(String medicine2) {
        this.medicine2 = medicine2;
    }

    @Override
    public String toString() {
        return "Dig{" +
                "condition='" + condition + '\'' +
                ", medicine1='" + medicine1 + '\'' +
                ", medicine2='" + medicine2 + '\'' +
                '}';
    }
}
