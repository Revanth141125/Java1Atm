package com.codegnan.customException;

public class InSufficientBalanceException extends Exception {
     public InSufficientBalanceException(String errorMsg) {
    	 super(errorMsg);
     }
}
