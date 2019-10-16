package com.mrkanyoze.smartcalc;

public interface SmartCalcContract {

    //Method Contracts for the app
    char getCharOperatorFromText(String strOper);
    int performCalculations();
    int getIntNumberFromText(String strNum);

}
