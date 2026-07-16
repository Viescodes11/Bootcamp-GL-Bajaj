package com.MethodOverloadingExample;

public class BankTransfer {

	  public void transfer(double amount) {
	        System.out.println("Transferred Amount: " + amount);
	    }

	    public void transfer(double amount, String accountNumber) {
	        System.out.println("Transferred " + amount + " to Account: " + accountNumber);
	    }

	    public void transfer(double amount, String accountNumber, String remarks) {
	        System.out.println("Transferred " + amount + " to Account: " + accountNumber);
	        System.out.println("Remarks: " + remarks);
	    }

	    public static void main(String[] args) {

	        BankTransfer bt = new BankTransfer();

	        bt.transfer(5000);
	        bt.transfer(10000, "1234567890");
	        bt.transfer(15000, "9876543210", "Salary");

	    }
	}

