package com.example.interview.overcontext;

public abstract class AbstractEntity {

    private String name;
    private String age;

    public AbstractEntity() {
    }

    public AbstractEntity(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public abstract String getProfile();

    abstract AbstractFirstClass prepareAbstractClassObject(int len, int weight);

    abstract FirstClass prepareFirstClass(int a, int b, int c);

    abstract FirstClassExtender prepareFirstClassExtender(int a, int b, int c, int z);

    //todo add non abstract copies

}
