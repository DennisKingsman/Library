package behavioral.state;

import structural.proxy.GetATMData;

//implements for structural.proxy(not for behavioral.state)
public class ATMMachine implements GetATMData {

    private ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);
        atmState = noCard;
        if (cashInMachine < 0) {
            atmState = atmOutOfMoney;
        }
    }

    void setATMState(ATMState newATMState) {
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine) {
        cashInMachine = newCashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered) {
        atmState.insertPin(pinEntered);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    // NEW STUFF (FOR PROXY PATTERN) nothing with behavioral.state
    @Override
    public ATMState getATMState() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }

}
