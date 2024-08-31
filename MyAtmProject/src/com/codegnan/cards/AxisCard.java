package com.codegnan.cards;

import java.util.ArrayList;
import java.util.Collections;

import com.codegnan.customException.InSufficientBalanceException;
import com.codegnan.customException.InSufficientMachineBalanceException;
import com.codegnan.customException.InvalidAmountException;
import com.codegnan.customException.NotAOperatorException;
import com.codegnan.interfaces.IATMService;

public class AxisCard implements IATMService {

	String name;
	long debitCardNumber;
	double accountBalance;
	int pinNumber;
	ArrayList<String> statement;
	final String type = "user";
	int chances;

	public AxisCard(String name, long debitCardNumber, double accountBalance, int pinNumber) {
		chances = 3;
		this.name = name;
		this.debitCardNumber = debitCardNumber;
		this.accountBalance = accountBalance;
		this.pinNumber = pinNumber;
		statement = new ArrayList<>();

	}

	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InSufficientBalanceException, InSufficientMachineBalanceException {
		// TODO Auto-generated method stub
		if (wthAmount <= 0) {
			throw new InvalidAmountException("You cannot enter zero amount to withDraw.  Please enter valid Amount");
		} else if (wthAmount % 10 != 0) {
			throw new InSufficientBalanceException("Please withDraw multiples of Hundred(100)");
		} else if (wthAmount > accountBalance) {
			throw new InSufficientMachineBalanceException("You dont have sufficient amount to draw in your Account");
		} else {
			accountBalance = accountBalance - wthAmount;
			statement.add("Debited : " + wthAmount);
		}
		return wthAmount;
	}

	@Override
	public double depositeAmount(double dptAmount) throws InvalidAmountException {
		if (dptAmount <= 0 || dptAmount % 10 != 0) {
			throw new InvalidAmountException("please deposit multiple of 100");
		} else {
			accountBalance = accountBalance + dptAmount;
			statement.add("Credited : " + dptAmount);
		}
		return dptAmount;

	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		// TODO Auto-generated method stub
		this.pinNumber = pinNumber;

	}

	@Override
	public int getPin() {
		// TODO Auto-generated method stub
		return pinNumber;

	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return name;

	}

	@Override
	public void decreaseChances() {
		// TODO Auto-generated method stub
		--chances;

	}

	@Override
	public int getChances() {
		return chances = 3;

	}

	@Override
	public void resetPin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generateMiniStatement() {
		// TODO Auto-generated method stub
		int count = 5;
		if (statement.size() == 0) {
			System.out.println("There are no tranactions");
			return;
		}
		System.out.println("========last 5 transactions==============");
		Collections.reverse(statement);
		for (String tans : statement) {
			if (count == 0) {
				break;
			}
			System.out.println(tans);
			count--;
		}
		Collections.reverse(statement);

	}

}
