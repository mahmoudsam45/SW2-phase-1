package Three;


public class Student extends Account {
	double score;

	public Student() {
		score = 0.0;
	}

	public double getScore() {
		return score;
	}
        public void  setScore(double s) {
		score=s;
	}

	public void updateScore(double s) {
		score += s;
	}

	public void showMore() {
		System.out.println("score: " + score);
	}
}
