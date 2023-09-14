package com.People;


public class Person {
    // 姓名
    private String name;

    // 父亲
    private Person father;

    // 母亲
    private Person mather;

    // 孩子
    private Person[] children;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMather() {
        return mather;
    }

    public void setMather(Person mather) {
        this.mather = mather;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }
}
