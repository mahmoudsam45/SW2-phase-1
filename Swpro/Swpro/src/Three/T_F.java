package Three;


public class T_F extends Question{
	
	private String choices[];
	
	T_F(){
		choices = new String[2];
		choices[0] = "True";
		choices[1] = "False";
	}
	public String[] getChoices() {
		return choices;
	}
}
