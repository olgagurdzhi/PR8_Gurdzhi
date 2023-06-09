package com.example.pr4_gurdzhi.data.models;

public class BookInfo {
    private String name;

    private int data;
    private int personCount;

    public BookInfo(String name, int data, int personCount){
        this.name=name;
        this.data=data;
        this.personCount=personCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }
}

