package com.example.interview.extention;

public abstract class AbstrEx {

    private int anInt;
    private int bnInt;

    public AbstrEx(int anInt, int bnInt) {
        this.anInt = anInt;
        this.bnInt = bnInt;
    }

    static class InnerStaticAbstr {
        int a;
    }

    class InnerAbstr {
        int b;

        public InnerAbstr(int b) {

            this.b = b;
        }
    }

}
