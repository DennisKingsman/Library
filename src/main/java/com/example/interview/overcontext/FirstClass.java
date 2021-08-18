package com.example.interview.overcontext;

import com.example.interview.extention.Flyable;

public class FirstClass extends AbstractFirstClass implements FirstInterface, Flyable {

    private int firstClassField;

    public FirstClass() {
    }

    public FirstClass(int length, int weight) {
        super(length, weight);
    }

    public FirstClass(int firstClassField) {
        this.firstClassField = firstClassField;
    }

    public FirstClass(int length, int weight, int firstClassField) {
        super(length, weight);
        this.firstClassField = firstClassField;
    }

    public int getFirstClassField() {
        return firstClassField;
    }

    public void setFirstClassField(int firstClassField) {
        this.firstClassField = firstClassField;
    }

    @Override
    public int calcSumPublicAbstract() {
        return 0;
    }

    @Override
    public int calcSumProtectedAbstract() {
        return 0;
    }

    @Override
    public int calcSumPackagePrivateAbstract() {
        Integer num = 12;
        return num;
    }

    @Override
    public int getDif() {
        return 0;
    }

    public int getDif(double a) {
        return 0;
    }

    @Override
    public int getDif(int mult) {
        return 0;
    }


    @Override
    public int getDif(int first, int second) {
        return 0;
    }

}
