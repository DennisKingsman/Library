package structural.proxy;

// This interface will contain just those methods
// that you want the structural.proxy to provide access to

import behavioral.state.ATMState;

public interface GetATMData {

    ATMState getATMState();

    int getCashInMachine();

}