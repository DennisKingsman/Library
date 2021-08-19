package com.example.interview.inner.classes;

import com.example.interview.extention.Extender;

public class OuterClass  {

    public int a;
    public int b;

    protected OuterClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void sameMethod(int a) {
        System.out.println(a);
    }

    static void sameMethod() {
        System.out.println("NO");
    }

}
