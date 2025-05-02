package com.example;

public abstract class ATM {

    private ATM nextATM;

    public ATM(ATM nextAtm){
        this.nextATM = nextAtm;
    }

    public ATM getNextATM(){
        return nextATM;
    }

    public abstract void dispense(WithdrawalRequest request);

}
