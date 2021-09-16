package structural.proxy;

// In this situation the structural.proxy both creates and destroys
// an ATMMachine Object

import behavioral.state.ATMMachine;
import behavioral.state.ATMState;

//some classes taken from the behavioral.state pattern example
public class ATMProxy implements GetATMData {

    // Allows the user to access getATMState in the
    // Object ATMMachine
    @Override
    public ATMState getATMState() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getATMState();
    }

    // Allows the user to access getCashInMachine
    // in the Object ATMMachine
    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }

}
