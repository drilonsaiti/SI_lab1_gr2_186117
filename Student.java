class Student {
	String index;
	String firstName;
	String lastName;
	int [] grades = new int [100];
	//TODO constructor
	public Student(String index, String firstName, String lastName, int[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}
	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double getAverage() {
		//TODO
		double suma = 0;
		for(int i = 0; i < this.grades.length;i++){
			suma += grades[i];
		}
		double average = suma/grades.length;

		return average;
	}

	public int ECTSCredits() {
		int count = 0;
		for(int i = 0; i < grades.length;i++){
			if(grades[i] > 5 && grades[i] <= 10){
				count++;
			}
		}
		return count*6;
	}
}

class Faculty{
	List<Student> studentList = new ArrayList<>();
	String nameFaculty;
	Student student;

	public Faculty(List<Student> studentList, String nameFaculty) {
		this.studentList = studentList;
		this.nameFaculty = nameFaculty;
		this.student = student;
	}

	public double getAverage(){
		double sum = 0;
		for (int i = 0; i < studentList.size();i++){
			sum += studentList.get(i).getAverage();
		}
		return sum;
	}

	public int credits(){
		int sum = 0;
		for (int i = 0; i < studentList.size();i++){
			sum += studentList.get(i).ECTSCredits();
		}
		return sum/studentList.size();
	}

}
