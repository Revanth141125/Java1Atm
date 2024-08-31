package com.codegnan.interfaces;

import com.codegnan.customException.InSufficientBalanceException;
import com.codegnan.customException.InSufficientMachineBalanceException;
import com.codegnan.customException.InvalidAmountException;
import com.codegnan.customException.NotAOperatorException;

public interface IATMService {
	// to get the user type whether the user is operator or normal user
	public abstract String getUserType() throws NotAOperatorException;

	// to with draw amount
	// 1.will throw InvalidAmountException if the amount is not valid denomination
	// 2.will throw InSufficientBalanceException if the customer has Insufficient
	// 3.will throw InSufficientMachineBalanceException if the mission has
	// InSufficient Cash
	public abstract double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InSufficientBalanceException, InSufficientMachineBalanceException;

	// to depositeAmount
	public abstract double depositeAmount(double dptAmount) throws InvalidAmountException;

	// to checkBalance
	public abstract double checkBalance();
	
	// to changePin number
	public abstract void changePinNumber(int pinNumber);

	// to get pinNumber
	public abstract int getPin();
	
	// to get userName
	public abstract String getUserName();
	
	// to decrease Number of chances After Entering the wrong password
	public abstract void decreaseChances();
	
	// to get the chances of pin number
	public abstract int getChances();
	
	//to reset the PIN Number chances by the Bank Operator.
	public abstract void resetPin();
	
	//to get MINIStatement of an Account
	public abstract void generateMiniStatement();

	

}
