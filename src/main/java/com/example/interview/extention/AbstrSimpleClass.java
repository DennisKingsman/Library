package com.example.interview.extention;

public abstract class AbstrSimpleClass {

    public int a;
    public int b;

    public AbstrSimpleClass() {
    }

    public AbstrSimpleClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void method() {
        System.out.println("method");
    }

}
