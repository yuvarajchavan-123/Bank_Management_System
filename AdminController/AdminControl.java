package com.AdminController;
import java.util.Scanner;

import com.BankApplication.service.RBI;
import com.BankApplication.serviceimpl.SBI;


public class AdminControl {
public static void main(String[] args) {
	
System.out.println("*********** WELCOME TO SBI");

Scanner sc=new Scanner(System.in);
	boolean flag=true;
	
	RBI rbi=new SBI();
	
	System.out.println("***********");
	System.out.println( "1:CREATE BANK DETAILS ");
	System.out.println("2:SHOW ACCOUNTDETAILS ");
	System.out.println("3: SHOW ACCOUNT BALANCE ");
	System.out.println("4:WITRAWAL MONEY");
	System.out.println("5:DEPOSITE MONEY");
	System.out.println("6:UPADATE ACCOUNT DEtails");
	System.out.println("7: EXIT-------------------------");
	
	System.out.println("ENTER YOUR CHOICE BEETWEEN 1 TO 7");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
	rbi.creteAccount();
	break;
	case 2:
	rbi.showAccountDetails();
	break;
	case 3:
	rbi.DepositeMoeny();
	break;
	case 4:
	rbi.WithdralMoney();
	break;
	case 5:
	rbi.DepositeMoeny();
	break;
	case 6:
	rbi.UpadateaccountDetails();
     break;
	case 7:
		flag=false;
		break;
		default:
		System.out.println("enter involid choice pls correct choise");
		break;
}	
}
}	
