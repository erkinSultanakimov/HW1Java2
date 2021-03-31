package com.company;

public class Transport {
    private String type;
    private String madeIn;
    private int count;
    private  Logist company;


    public Transport(String type, String madeIn, int count, Logist company) {
        this.type = type;
        this.madeIn = madeIn;
        this.count = count;
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public int getCount() {
        return count;
    }

    public Logist getCompany() {
        return company;
    }
}
