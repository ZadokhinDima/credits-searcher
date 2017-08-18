package main.java.model.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Credit {
    private int id;
    private CreditType type;
    private float interestRate;
    private Bank bank;
    private boolean prepayment;
    private boolean expansion;

    public static Credit parseResultSet(ResultSet resultSet) throws SQLException {
	CreditType type = new CreditType(resultSet.getInt(7), resultSet.getString(8));
	Bank bank = new Bank(resultSet.getInt(5), resultSet.getString(6));
	return new Credit(resultSet.getInt(1), type, resultSet.getFloat(2), bank, resultSet.getBoolean(3),
		resultSet.getBoolean(4));
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public CreditType getType() {
	return type;
    }

    public void setType(CreditType type) {
	this.type = type;
    }

    public boolean hasPrepayment() {
	return prepayment;
    }

    public void setPrepayment(boolean prepayment) {
	this.prepayment = prepayment;
    }

    public boolean hasExpansion() {
	return expansion;
    }

    public void setExpansion(boolean expansion) {
	this.expansion = expansion;
    }

    public float getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(float interestRate) {
	this.interestRate = interestRate;
    }

    public Bank getBank() {
	return bank;
    }

    public void setBank(Bank bank) {
	this.bank = bank;
    }

    public Credit(int id, CreditType type, float interestRate, Bank bank, boolean prepaiment, boolean expansion) {
	super();
	this.id = id;
	this.type = type;
	this.interestRate = interestRate;
	this.bank = bank;
	this.prepayment = prepaiment;
	this.expansion = expansion;
    }

}
