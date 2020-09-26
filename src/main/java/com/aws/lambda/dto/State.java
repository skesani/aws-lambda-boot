package com.aws.lambda.dto;

/**
 * @author SasiKesani on 9/26/20
 */
public class State {
    public String name;
    public String abbreviation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public State(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public State() {
    }

    @Override
    public String toString() {
        return "State{" +
               "name='" + name + '\'' +
               ", abbreviation='" + abbreviation + '\'' +
               '}';
    }
}
