package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Student
{
    private int id;
    private String name;
    private List<Phone> ph;
    @Autowired
    private Address add;

    public Student(){}
    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Phone> getPh() {
        return ph;
    }
    public Address getAdd() {
        return add;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }
    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return id + " " + name + "\n" + ph + "\n" + add;
    }
}
