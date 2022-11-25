package com.practice;

public class User implements Comparable<User> {

    private Integer id;
    private String name;
    private Integer exp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public User(Integer id, String name, Integer exp) {
        this.id = id;
        this.name = name;
        this.exp = exp;
    }

    public User() {
    }

    @Override
    public int compareTo(User o) {
        Integer res = this.name.compareToIgnoreCase(o.name);
        if(res==0) {
            res = this.exp.compareTo(o.exp);
        }
        return res;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", exp=" + exp +
                '}';
    }
}
