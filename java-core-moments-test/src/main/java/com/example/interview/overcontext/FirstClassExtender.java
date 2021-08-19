package com.example.interview.overcontext;

public class FirstClassExtender extends FirstClass {

    private int extenderField;

    public FirstClassExtender() {
    }

    public FirstClassExtender(int length, int weight) {
        super(length, weight);
    }

    public FirstClassExtender(int extenderField) {
        this.extenderField = extenderField;
    }

    public FirstClassExtender(int length, int weight, int firstClassField) {
        super(length, weight, firstClassField);
    }

    @Override
    public int getDif() {
        return extenderField;
    }

}
