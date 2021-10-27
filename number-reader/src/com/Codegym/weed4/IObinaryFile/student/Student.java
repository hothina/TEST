package com.Codegym.weed4.IObinaryFile.student;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String addrees;

    public Student(){}

    public Student(int id, String name, String addrees) {
        this.id = id;
        this.name = name;
        this.addrees = addrees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddrees() {
        return addrees;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addrees='" + addrees + '\'' +
                '}';
    }
}
