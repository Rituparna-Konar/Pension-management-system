package com.pms.process.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
public class BankLog {
	private long id;
	private String name;
	private Date dateOfBirth;
	private String panNumber;
	private double salary;
	private double allowances;
	private String typeOfPension;
	private long aadhaarNumber;
	private String bankName;
	private long accountNumber;
	private double bankServiceCharge;
	private double pensionAmount;
	private Date dateOfTransaction;

	public BankLog(String name, Date dateOfBirth, String panNumber, double salary, double allowances,
                   String typeOfPension, long aadhaarNumber, String bankName, long accountNumber, double bankServiceCharge,
                   double pensionAmount, Date dateOfTransaction) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.panNumber = panNumber;
		this.salary = salary;
		this.allowances = allowances;
		this.typeOfPension = typeOfPension;
		this.aadhaarNumber = aadhaarNumber;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankServiceCharge = bankServiceCharge;
		this.pensionAmount = pensionAmount;
		this.dateOfTransaction = dateOfTransaction;
	}
}
