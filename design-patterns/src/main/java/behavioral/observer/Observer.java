package behavioral.observer;

// The Observers update method is called when the Subject changes

public interface Observer {

    void update(double ibmPrice, double aplPrice, double googPrice);

}