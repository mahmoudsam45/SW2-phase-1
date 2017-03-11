package Three;

import java.util.ArrayList;

public class StudentDBController {
	private static ArrayList<Student> studentAccounts = new ArrayList<Student>();

	public static boolean validateName(String name) { // validate new name for registration - false if exists
		for (int i = 0; i < studentAccounts.size(); i++)
                {
			if (studentAccounts.get(i).getAccountName().equals(name)) {
				return false;
			}
		}
		return true;
	}
	public static Student validateLogin(String name, String password) {
		for (int i = 0; i < studentAccounts.size(); i++) {
			if (studentAccounts.get(i).getAccountName().equals(name) && studentAccounts.get(i).getPassword().equals(password))
				return studentAccounts.get(i);
		}
		return null;
	}
	public static void addAccount(Student student) {
		studentAccounts.add(student);
	}
        //not handle error and exception A&A&M
        //no comment to descripe the function jop A&A%M
	public static void updateScore(String name, double score){
		for (int i = 0; i < studentAccounts.size(); i++)
			if (studentAccounts.get(i).getAccountName().equals(name))
				studentAccounts.get(i).updateScore(score);
	}
}