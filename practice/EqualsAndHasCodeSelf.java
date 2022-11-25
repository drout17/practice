package com.practice;

import java.util.Objects;

public class EqualsAndHasCodeSelf {
}

class stud{

    private Integer id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        stud stud = (stud) o;
        return stud.name.equals(name) && stud.id.equals(id);
    }

    @Override
    public int hashCode() {
        return (id*235);
    }
}
