package CT417StudentRegistrationSystem;

import java.util.ArrayList;

public class Module {

	private String Name;
	private String ID;
	private ArrayList<Student> students;
	
	public Module(String Name, String ID, ArrayList<Student> students){
		this.Name = Name;
		this.ID = ID;
		this.students = students;
	}
	
	public String toString(){
		return ID+ "-" + Name;
	}
	
	public void addStudent(Student s){
		students.add(s);
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		ID = id;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public boolean containsStudent(Student student) {
		for(Student s: students){
			if(s.getUsername() == student.getUsername()){
				return true;
			}
		}
		return false;
	}
	
}
