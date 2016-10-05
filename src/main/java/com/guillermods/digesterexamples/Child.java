package com.guillermods.digesterexamples;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by gdiazs on 06/09/2016.
 */
public class Child {

    private String name;

    private BigDecimal indicator;

    private Collection friends;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getIndicator() {
        return indicator;
    }

    public void setIndicator(BigDecimal indicator) {
        this.indicator = indicator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child child = (Child) o;

        if (name != null ? !name.equals(child.name) : child.name != null) return false;
        return indicator != null ? indicator.equals(child.indicator) : child.indicator == null;

    }

    public Collection getFriends() {
        return friends;
    }

    public void setFriends(Collection friends) {
        this.friends = friends;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (indicator != null ? indicator.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", indicator=" + indicator +
                ", friends=" + friends +
                '}';
    }
}
