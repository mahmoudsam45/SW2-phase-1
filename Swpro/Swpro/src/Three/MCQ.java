package Three;


public class MCQ extends Question{
	
	private String choices[];
	
	MCQ(){
		choices = new String[4];
	}
	public String[] getChoices() {
		return choices;
	}
        //error return in void function 
	public void setChoices(String arr[]) {
		if (arr.length > 4)
			return;
		for (int i = 0; i < arr.length; i++) {
			choices[i] = arr[i];
		}
	}

}
