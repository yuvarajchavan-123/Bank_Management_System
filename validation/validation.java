package com.validation;
import java.util.Scanner;
import java.util.regex.Pattern;
public class validation {

	private static String aadhaarNumber;


	public static String validateAccountHolderName() {	
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR NAME ");
	String name=sc.next();
	char[]ch=name.toCharArray();
	boolean flag=true;
	
	for(int i=0; i< ch.length;i++) {
	
	if(!(name.charAt(i)>='a'&&name.charAt(i)<='Z')&&!(name.charAt(i)>'A'&& name.charAt(i)<='Z')) {
	
		flag = false;
		}
	}
	
	if(!flag)
	{
		System.out.println("Invalid Input");
		return validateAccountHolderName();
	}
	
	else
	{
		return name;

	}
	}	


	
	
public static String validateAdharNumber() {
	Scanner sc =new Scanner(System.in);
	System.out.println("ENTER YOUR ADHAR NUMNER");
	String Adhar=sc.next();
	
	boolean flag=true;
	if(Adhar.length()!=16) {
		
  		flag = false;
  	}
  	if(!flag)
	{
		System.out.println("Invalid Input");
		return validateAdharNumber();
	}
	
	else
	{
		
		return aadhaarNumber;
	}
  	
}


public static String validatePanCardNumber()
{
	Scanner sc = new Scanner(System.in);
  	System.out.println("Enter pancard number");
  	String panCardNo = sc.next();
  	boolean flag = true;
  if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panCardNo))
  {
	  flag = false;
  }
  
  if(!flag)
	{
	  return panCardNo;
	}
	
	else
	{
		System.out.println("Invalid Input");
		return validatePanCardNumber();
	}
	



		
		
		

}		
}

	
	

