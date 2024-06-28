package com.satwik.spring.constructorinjection;

public class Test {

    private int rbcCount;
    private int wbcCount;
    private int plateletsCount;

    public int getRbcCount() {
        return rbcCount;
    }

    public void setRbcCount(int rbcCount) {
        this.rbcCount = rbcCount;
    }

    public int getWbcCount() {
        return wbcCount;
    }

    public void setWbcCount(int wbcCount) {
        this.wbcCount = wbcCount;
    }

    public int getPlateletsCount() {
        return plateletsCount;
    }

    public void setPlateletsCount(int plateletsCount) {
        this.plateletsCount = plateletsCount;
    }

    @Override
    public String toString() {
        return "Test{" +
                "rbcCount=" + rbcCount +
                ", wbcCount=" + wbcCount +
                ", plateletsCount=" + plateletsCount +
                '}';
    }
}
