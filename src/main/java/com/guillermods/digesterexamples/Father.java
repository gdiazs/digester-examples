package com.guillermods.digesterexamples;

import java.util.Collection;

/**
 * Created by gdiazs on 06/09/2016.
 */
public class Father {

    private String name;

    private Integer age;

    private Collection<Child> childs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Collection<Child> getChilds() {
        return childs;
    }

    public void setChilds(Collection<Child> childs) {
        this.childs = childs;
    }
}
