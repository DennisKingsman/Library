package com.example.interview.overcontext;

public interface FirstInterface {

    int getDif();

    int getDif(int mult);

    int getDif(int first, int second);

    default int getDif(double a) {
        return 0;
    }

    static void printHello() {
        System.out.println("Hello, it's FirstInterface");
    }

}
