package com.exponent.bankAppliction.model;

public class Account {

private int AccountNo;
private String Accountname;	
private String Adharno;	
private String PanCardNo;	
private long contact;	
private String mail;
private double accountBalance;
public int getAccountNo() {
	return AccountNo;
}
public void setAccountNo(int accountNo) {
	AccountNo = accountNo;
}
public String getAccountname() {
	return Accountname;
}
public void setAccountname(String accountname) {
	Accountname = accountname;
}
public String getAdharno() {
	return Adharno;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public void setAdharno(String adharno) {
	Adharno = adharno;
}
public String getPanCardNo() {
	return PanCardNo;
}
public void setPanCardNo(String panCardNo) {
	PanCardNo = panCardNo;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
@Override
public String toString() {
	return "Account [AccountNo=" + AccountNo + ", Accountname=" + Accountname + ", Adharno=" + Adharno + ", PanCardNo="
			+ PanCardNo + ", contact=" + contact + ", mail=" + mail + ", accountBalance=" + accountBalance + "]";
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
