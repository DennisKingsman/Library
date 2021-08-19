package com.example.interview.overcontext;

public class Entity extends AbstractEntity  {

    private Long id;

    public Entity() {
    }

    @Override
    public String getProfile() {
        return null;
    }

    @Override
    FirstClass prepareAbstractClassObject(int len, int weight) {
        return null;
    }

    @Override
    FirstClass prepareFirstClass(int a, int b, int c) {
        return null;
    }

    @Override
    FirstClassExtender prepareFirstClassExtender(int a, int b, int c, int z) {
        return null;
    }

    public Entity(Long id) {
        this.id = id;
    }

    public Entity(String name, String age, Long id) {
        super(name, age);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
