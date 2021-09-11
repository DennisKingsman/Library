package strategy;

public interface Flyable {

    String fly();

}

class CanFly implements Flyable {

    @Override
    public String fly() {
        return "can fly";
    }

}

class CannotFly implements Flyable {

    @Override
    public String fly() {
        return "can't fly";
    }

}