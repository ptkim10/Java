public class print {

	public static void main(String[] args) {
		Student student = new Student(17);
		Teacher teacher = new Teacher();
		
		System.out.print("Teacher : What is your number?");
		System.out.println();
		System.out.print("Student : "number "+ student.getNumber()+".");
		System.out.println();
		System.out.print("Teacher : "+ teacher.getText());
		
	}

}

class Student {
	private int m_number;
	
    public Student(int _num) {
    	super();
    	m_number =_num;
    }
	public int getNumber() {
		return m_number;
	}
}

class Teacher {
	
	public String getText() {
		return "Thank you.";
	}
}
