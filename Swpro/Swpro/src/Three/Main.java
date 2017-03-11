package Three;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner cin = new Scanner(System.in);
	public static String[] categories = { "Math", "Programming", "Science" };

	public static void main(String[] args) {
		while (true) {
			System.out.println("1) login\n2)register 3) exit");
			int choice = cin.nextInt();
			if (choice == 1) {
				while (true) {
					System.out.println("enter your 1 if student 2 if teacher 3 to back: ");
					int type = cin.nextInt();

					if (type == 3)
						break;

					System.out.println("Enter your name: ");
					String name = cin.next();
					System.out.println("Enter your password: ");
					String password = cin.next();

					Account account = new Account();
					if (type == 1) {
						account = StudentDBController.validateLogin(name, password);

						if (account == null) {
							System.out.println("error");
							break;
						}

					} else if (type == 2) {
						account = TeacherDBController.validateLogin(name, password);

						if (account == null) {
							System.out.println("error");
							break;
						}
					}
					menu(account, type);
				}

			} else if (choice == 2) {
				System.out.println("enter your 1 if student, 2 if teacher 3 to back: ");
				int type = cin.nextInt();

				if (type == 1) {
					Student student = new Student();
					student.register();

					StudentDBController.addAccount(student);
					menu(student, 1);
				} else if (type == 2) {
					Teacher teacher = new Teacher();
					teacher.register();
					System.out.print("Enter your specialty: ");
					teacher.setSpecialty(cin.next());

					TeacherDBController.addAccount(teacher);
					menu(teacher, 0);
				}
			}else if (choice == 3) {
				break;
			}
		}
		cin.close();
	}

	public static void menu(Account account, int type) {
		while (true) {
			System.out.println("1) show profile\n2)choose categorie");
			int lastOption = 3;
			if (type != 1) { // Teacher
				System.out.println("3) create a game");
				lastOption = 4;
			}
			System.out.println(lastOption + ") exit");

			int choice = cin.nextInt();
			if (choice == 1) { // show profile
				account.showProfile();
				account.showMore();
			}
			if (choice == 2) { // choose domain
				for (int i = 0; i < categories.length; i++)
					System.out.println(i + 1 + ") " + categories[i]);

				int categorieNumber = cin.nextInt();
				ArrayList<Game> games = GameDBController.getGames(categories[categorieNumber - 1]);

				for (int i = 0; i < games.size(); i++)
					System.out.println(i + 1 + ") " + games.get(i).getName());

				System.out.println(games.size() + 1 + ") exit");

				int gameNum = cin.nextInt();
				if (gameNum <= games.size()) {
					double score = games.get(gameNum - 1).PlayGame();

					if (type == 1) { // if student
						StudentDBController.updateScore(account.getAccountName(), score);
					}
				} else {
					continue;
				}
			}
			if ((type == 1 && choice == 3) || (choice == 4)) {
				break;
			}
			if (choice == 3) { // create game
				Game game = new Game();
				game.setOwner(account.getAccountName());
				game.createGame();

				System.out.println("Done");
				GameDBController.addGame(game);
			}
		}

	}

}
