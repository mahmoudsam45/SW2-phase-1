package Three;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	private String accountName, password;
	private String birthdate;

	public String getAccountName() {
		return accountName;
	}

	public  void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	
	
	public void register() { //
		
		boolean valid = false;
		while(!valid) {
			System.out.print("Enter your name: ");
			accountName = Main.cin.next();
			valid = StudentDBController.validateName(accountName) && TeacherDBController.validateName(accountName);
		}
		System.out.print("Enter your password: ");
		password = Main.cin.next();
		
		System.out.print("Enter your date: ");
		birthdate = Main.cin.next();
	}
	public void showProfile(){
		System.out.println("name: " + accountName);
		System.out.println("birthdate: " + birthdate);
	}
	public void showMore(){
		
	}
}
