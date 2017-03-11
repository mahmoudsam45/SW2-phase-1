package Three;

import java.util.ArrayList;

public class TeacherDBController {
	private static ArrayList<Teacher> teacherAccounts = new ArrayList<Teacher>();

	public static boolean validateName(String name) {
		for (int i = 0; i < teacherAccounts.size(); i++) {
			if (teacherAccounts.get(i).getAccountName().equals(name))
                        {
				return false;
			}
		}
		return true;
	}
	
	public static Teacher validateLogin(String name, String password) {
		for (int i = 0; i < teacherAccounts.size(); i++) {
			if (teacherAccounts.get(i).getAccountName().equals(name) && teacherAccounts.get(i).getPassword().equals(password))
				return teacherAccounts.get(i);
		}
		return null;
	}
	
	public static void addAccount(Teacher teacher) {
		teacherAccounts.add(teacher);
	}
}
