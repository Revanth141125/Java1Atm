package com.codegnan.cards;

import com.codegnan.customException.InSufficientBalanceException;
import com.codegnan.customException.InSufficientMachineBalanceException;
import com.codegnan.customException.InvalidAmountException;
import com.codegnan.customException.NotAOperatorException;
import com.codegnan.interfaces.IATMService;
 
public  class OperatorCard implements IATMService {
 
 	private int pinNumber;
 	private long id;
 	private String name;
 	private final String type = "operator";
 
 	public OperatorCard(long idn, int pin, String name) {
      	id = idn;
      	pinNumber = pin;
      	this.name = name;
 
 	}
 
 	@Override
 	public String getUserType() throws NotAOperatorException {
      	// TODO Auto-generated method stub
      	return type;
 	}
 
 	@Override
 	public double withdrawAmount(double wthAmount)
          	throws InvalidAmountException, InSufficientBalanceException, InSufficientMachineBalanceException {
      	return 0;
 	}
 
 	@Override
	public double depositeAmount(double dptAmount) throws InvalidAmountException{
		return dptAmount;
 		
 	}

 
 	@Override
 	public double checkBalance() {
      	return 0;
 	}
 
 	@Override
 	public void changePinNumber(int pinNumber) {
 
 	}
 
 	@Override
 	public int getPin() {
 
      	return pinNumber;
 	}
 
 	@Override
 	public String getUserName() {
 
      	return name;
 	}
 
 	@Override
 	public void decreaseChances() {
      	// TODO Auto-generated method stub
 
 	}
 
 	@Override
 	public int getChances() {
      	// TODO Auto-generated method stub
      	return 0;
 	}
 
 	@Override
 	public void resetPin() {
 
 	}
 
 	@Override
 	public void generateMiniStatement() {
      	// TODO Auto-generated method stub
 
 	}
 
}

