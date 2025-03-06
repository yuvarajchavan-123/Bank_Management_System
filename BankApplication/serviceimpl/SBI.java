package com.BankApplication.serviceimpl;

import java.util.Scanner;

import com.exponent.bankAppliction.model.Account;
import com.BankApplication.service.RBI;
public class SBI implements RBI {

	
Scanner sc=new Scanner(System.in);	
	Account ac=new Account();
	
	
	@Override
	public void creteAccount() {
		System.out.println("ENTER YOUR ACCOUNT NUMBER*******    ");
		int accNo=sc.nextInt();
		ac.setAccountNo(accNo);
		System.out.println("-------ENTER YOUR YOUR NAME.......    "); 
		ac.setAccountname(sc.next());
		System.out.println("**********ENTER YOUR ADDHAR NO------   ");
		ac.setAdharno(sc.next());
		System.out.println("    ##### ENTER YOUR PANCARD NO***    ");
		ac.setPanCardNo(sc.next());
		System.out.println("********* ENTER YOUR  EMAIL" );
		ac.setMail(sc.next());
		System.out.println("ENTER YOUR CONTACT ");
		ac.setContact(sc.nextLong());
		System.out.println("ACCOUNT SUCCECEFULL ");
	}

	@Override
	public void showAccountDetails() {
System.out.println("ENTER YOUR ACCOUNT");
int accNo=sc.nextInt();
	if(ac.getAccountNo()==accNo) {	
	System.out.println(ac);
	}else {	
	System.out.println("Account does't exit");	
	}
	}
	@Override
	public void showAccountBalance() {
		System.out.println("enter your account");
	int accNo=sc.nextInt();	
	if(ac.getAccountNo()==accNo	) {
		System.out.println("current account balance:"+ ac.getAccountBalance());
	}else {
	System.out.println("ACCOUNT DOES'T EXIT");	
		
	}	
	}

	@Override
	public void DepositeMoeny() {
		System.out.println("Enter account no");
		int accNo = sc.nextInt();
		
		if(accNo == ac.getAccountNo()) {
			
			System.out.println("enter amount");
			double depositAmount = sc.nextDouble();
			
			double updateAccountBalance = ac.getAccountBalance() + depositAmount;
			ac.setAccountBalance(updateAccountBalance);
			
			System.out.println("Deposit successfully");
		}
		
		else {
			System.out.println("Account not found");
		}
		
	}

	@Override
	public void WithdralMoney() {
		System.out.println("Enter account no");
		int accNo = sc.nextInt();
		
		if(accNo == ac.getAccountNo()) {
			
			System.out.println("enter amount");
			double withdralMoney = sc.nextDouble();
			
			double updateAccountBalance = ac.getAccountBalance() -withdralMoney ;
			ac.setAccountBalance(updateAccountBalance);
			
			System.out.println("widrawal successfully");
		}
		
		else {
			System.out.println("Account not found");
		}
		
	}
		
	

	@Override
	public void UpadateaccountDetails() {
	boolean flag= true;	
	System.out.println("enter your number");	
	int accNo=sc.nextInt();
	
	if(accNo==ac.getAccountNo());
	{
while(flag) {
	System.out.println("------------------");
	System.out.println("ENTER YOUR NAME ");
	System.out.println("ENTER YOUR MOBILE NUMBER");
	System.out.println("ENTER YOUR EMAIL");
	System.out.println("EXIT");
	System.out.println("**************");

	System.out.println("ENTER YOUR CHOICE 1 TO 4");
	int ch=sc.nextInt();
	
	switch(ch)
	{
	case 1:
		System.out.println("Enter new name");
		String newName = sc.next();
		ac.setAccountname(newName);
		System.out.println("Name change successfully");
		break;
		
	case 2:
	System.out.println("Enter new Mobile NO");
	String newMobileNo = sc.next();
	ac.setAccountname(newMobileNo);
	System.out.println("MobileNo  change successfully");
	break;
	
	case 3:
	System.out.println("Enter new email");
	String newemail = sc.next();
	ac.setAccountname(newemail);
	System.out.println("email change successfully");
	break;
	
	
	
	
	}
	
	
			
			
		
		
		
	


	
	
	
	
	
	
}

	}
}
}