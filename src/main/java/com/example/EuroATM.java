package com.example;

import com.example.WithdrawalRequest.Currency;

public class EuroATM extends ATM {

    public EuroATM(ATM nextAtm){
        super(nextAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == Currency.EUR){
            System.out.println("Dispensing €" + request.getAmount());
        }
        else if (super.getNextATM() != null){
            super.getNextATM().dispense(request);
        }
    }
}
