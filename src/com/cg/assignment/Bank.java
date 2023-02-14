package com.cg.assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter your kyc: ");
		int kyc = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter your address: ");
		String address = scanner.nextLine();
		
		System.out.println("Enter your account type (S for saving account, C for current account): ");
		char accountType = scanner.nextLine().toUpperCase().charAt(0);
		
		if(accountType =='S') {
			System.out.println("You have selected saving account");
		} else if (accountType == 'C') {
			System.out.println("You have selected current account");
		}else {
			System.out.println("Invalid account type");
		}
		
		try {
			FileWriter writer = new FileWriter("file.txt");
			writer.write("Name: " + name +"\n");
			writer.write("Age: " + age +"\n");
			writer.write("Address: " + address +"\n");
			writer.write("Kyc: " + kyc +"\n");
			writer.write("Account Type: " + accountType +"\n");
			writer.close();
			System.out.println("Account information has been saved to file.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
