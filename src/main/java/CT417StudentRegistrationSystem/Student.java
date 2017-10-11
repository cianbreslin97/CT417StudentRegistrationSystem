package CT417StudentRegistrationSystem;

import java.util.ArrayList;

public class Student {
	
	private static int id = 1000001;
	private String name;
	private int age;
	private String dob;
	private String username;
	private ArrayList<Module> modules;
	private Course course;
	
	public Student(String name, int age, String dob){
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.username = name+age;
		modules = new ArrayList<Module>();
		
		id++;
	}
	
	public String toString() {
        return "Name: " + this.name + " ID: " + id + " Username: " + this.getUsername();
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDOB() {
		return dob;
	}
	public void setDOB(String dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    public Course getCourse(){
    	return course;
    }
    
	public void setCourse(Course course) {
		this.course = course;
		
	}

}
