package Three;


public class Teacher extends Account {
	private String specialty;

	public Teacher() 
        {

	}

	public Teacher(String specialty) {

		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public void showMore() {
		System.out.println("speciality: " + specialty);
	}
}
