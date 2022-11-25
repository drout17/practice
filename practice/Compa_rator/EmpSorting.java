package com.practice.Compa_rator;

import java.util.Comparator;

public class EmpSorting {

    public static void main(String[] args) {
        Comparator<Emp> c = Comparator.comparing(Emp::getId);
    }
}

class Emp{

    private Long id;
    private Float Exp;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getExp() {
        return Exp;
    }

    public void setExp(Float exp) {
        Exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emp(Long id, Float exp, String name) {
        this.id = id;
        Exp = exp;
        this.name = name;
    }

    public Emp() {
    }
}
