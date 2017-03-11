package Three;

import java.io.InputStream;
import java.util.ArrayList;

public class Game {
	private String name, categorie, owner;
	private int gameID;
	private ArrayList<Question> questions;
	private static int numberOfGames = 0;
	// private int numberOfQuestions = 0;

	public Game() {
		numberOfGames++;
		gameID = numberOfGames;
		questions = new ArrayList<Question>();
		name = categorie = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setOwner(String name) {
		this.owner = name;
	}

	public String getCategorie() {
		return categorie;
	}
	public String getOwner() {
		return owner;
	}

	public void setCategorie(String categorie) {
		categorie = categorie;
	}

	public int getGameID() {
		return gameID;
	}

	public void createGame() {
		System.out.print("Enter the Game name: ");
		name = Main.cin.next();

		for (int i = 0; i < Main.categories.length; i++)
			System.out.println(i + 1 + ") " + Main.categories[i]);

		System.out.print("Enter the Game catorg: ");
		int choice = Main.cin.nextInt();
		categorie = Main.categories[choice - 1];

		System.out.print("Enter the type of the game(1 for true/false, 2 for MCQ): ");
		int type = Main.cin.nextInt();

		System.out.print("Enter the number of questions: ");

		int numberOfQuestions = Main.cin.nextInt();
		for (int i = 0; i < numberOfQuestions; i++) {
			Question question = new Question();
			System.out.print("Enter the question: ");
			String q = Main.cin.next();
			if (type == 1) {
				question = new T_F();
				System.out.print("Enter the right answer 'T' or 'F': ");
			} else {
				question = new MCQ();
				String choices[] = new String[4];
				for (int j = 0; j < 4; j++)
					choices[j] = Main.cin.next();

				question.setChoices(choices);
				System.out.print("Enter the right answer 'A', 'B', 'C', 'D': ");
			}
			question.setQuestion(q);
			question.setRightAnswer(Main.cin.next().charAt(0));
			questions.add(question);
		}

	}
 
	public Double PlayGame() { // returns the score
		int rightAnswers = 0;
		int numOfQuestions = questions.size();
		for (int i = 0; i < numOfQuestions; i++) {
			System.out.println(questions.get(i).getQuestion());

			String[] choices = questions.get(i).getChoices();
			char index = 'A';
			for (int j = 0; j < choices.length; j++) {
				if (choices.length == 4) {
					System.out.println(index + ") " + choices[j]);
					++index;
				} else {
					System.out.println(choices[j]);
				}
			}
			System.out.print("Enter your answer: ");
			char answer = Main.cin.next().charAt(0);
			
			if (answer == questions.get(i).getRightAnswer())
				++rightAnswers;
		}
		System.out.println("You got " + rightAnswers + " out of " + numOfQuestions);
		return (1.0 * rightAnswers) / (1.0 * numOfQuestions);
	}
}
