package com.codegnan.customException;


public class InSufficientMachineBalanceException extends Exception{
	public InSufficientMachineBalanceException(String errorMsg) {
		super(errorMsg);
	}

}
