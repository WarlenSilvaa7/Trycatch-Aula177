package entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	
	
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}
	public void withdraw(double amount) throws DomainException {
		if(amount > withDrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit"); 
		}
		else if(amount > balance) {
			throw new DomainException("Not enough balance"); 
		}
		else {
			balance -= amount;
		}
			
	}
}
