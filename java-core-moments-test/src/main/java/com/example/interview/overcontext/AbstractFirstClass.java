package com.example.interview.overcontext;

public abstract class AbstractFirstClass {

    private int length;
    private int weight;

    public AbstractFirstClass() {
    }

    public AbstractFirstClass(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract public int calcSumPublicAbstract();

    abstract protected int calcSumProtectedAbstract();

    abstract int calcSumPackagePrivateAbstract();

    private int calcSumPrivateAbstract(){
        return length + weight;
    }

    public int calcSumPrivateAbstract(int add) {
        return length + weight + add;
    }

}
