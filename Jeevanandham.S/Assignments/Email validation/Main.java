package edu.prodapt.email_validation;

import java.util.Scanner;

public class Main {
	
	static boolean validateEmail(String email) {
		//String[] arr = email.split("@");
		String userName = email.substring(0,email.indexOf('@'));
		String domain = email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));
		String tld = email.substring(email.lastIndexOf('.')+1);
		boolean isValid = true;
		int count = 0;
		String[] symbol = {"!","@","#","$","%","^","&","*","(",")","-","+","=","\\","|","]","[","}","{",";",":","<",">",",","?","/"};
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				count++;
			}
		}
		if(count == 1) {
			if(Character.isAlphabetic(userName.charAt(0))) {
				if(Character.isLowerCase(userName.charAt(0))) {
					for(int i=0;i<symbol.length;i++) {
						if(userName.contains(symbol[i])) {
							isValid = false;
							System.out.println("No special characters except _ and . are allowed");
							break;
						}
					}
					if(isValid) {
						for(int i=0;i<domain.length();i++) {
							if(!Character.isAlphabetic(domain.charAt(i))) {
								isValid = false;
								System.out.println("Domain should contain only alphabets");
								break;
							}
						}
						if(isValid) {
							if(domain.equals(domain.toLowerCase())) {
								if(tld.length()>=2 && tld.length()<=6) {
									for(int i = 0;i<tld.length();i++) {
										if(!Character.isAlphabetic(tld.charAt(i))) {
											isValid = false;
											System.out.println("TLD should contain only alphabets");
											break;
										}
									}
									if(isValid) {
										if(tld.equals(tld.toLowerCase())) {
											isValid = true;
										}
										else {
											isValid = false;
											System.out.println("TLD should be lower case");
										}
									}
									
								}
								else {
									isValid = false;
									System.out.println("TLD should contain 2 to 6 characters only");
								}
								
							}
							else {
								isValid = false;
								System.out.println("Domain should be in lowercase");
							}
						}
					}
					
				}
				else {
					isValid = false;
					System.out.println("Email should not start with uppercase");
				}
					
			}
			else {
				System.out.println("Email should not start with numbers or symbols");
				isValid = false;
			}
		}
		else {
			isValid = false;
			System.out.println("Only one @ is allowed ");
		}
		
		
		
		
		
		return isValid;
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter email");
		String email = sc.next();
		sc.close();
		if(validateEmail(email)) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Email is invalid");
		}
	}

}
