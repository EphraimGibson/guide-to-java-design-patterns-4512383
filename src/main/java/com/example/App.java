package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = chainATM();
        atm.dispense(request);
    }


    private static ATM chainATM(){
        var usdollarATM = new UsDollarATM(null);
        var euroATM = new EuroATM(usdollarATM);

        return euroATM;
    }

}
