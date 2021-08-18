package com.example.interview.extention;

import com.example.interview.inner.classes.OuterClass;

import java.util.ArrayList;
import java.util.Collections;

public class Person extends OuterClass {

    private final String name;
    private String main;

    public Person(String name) {
        super(1, 2);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

}
