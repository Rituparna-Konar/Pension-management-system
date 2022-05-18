package com.pms.detail.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@NoArgsConstructor
@Component
@Entity
@Table(name = "banklog")
public class BankLog {
	// Pensioner Id
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	// Pensioner name
	@NotNull
	@Column(name = "name")
	private String name;

	// Pensioner Date Of Birth
	@NotNull
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	// Pensioner PAN Number
	@NotNull
	@Column(name = "panNumber")
	private String panNumber;

	// Pensioner Salary
	@NotNull
	@Column(name = "salary")
	private double salary;

	// Pensioner allowances
	@NotNull
	@Column(name = "allowances")
	private double allowances;

	// Pensioner pension type
	@NotNull
	@Column(name = "typeOfPension")
	private String typeOfPension;

	// Pensioner aadhaar number
	@NotNull
	@Column(name = "aadhaarNumber")
	private long aadhaarNumber;

	// Pensioner bank name
	@NotNull
	@Column(name = "bankName")
	private String bankName;

	// Pensioner account number
	@NotNull
	@Column(name = "accountNumber")
	private long accountNumber;

	// Pensioner bank service charge
	@NotNull
	@Column(name = "bankServiceCharge")
	private double bankServiceCharge;

	// Pensioner pension amount
	@NotNull
	@Column(name = "pensionAmount")
	private double pensionAmount;

	// Pensioner transaction date
	@NotNull
	@Column(name = "dateOfTransaction")
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
