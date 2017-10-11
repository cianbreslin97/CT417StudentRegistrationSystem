package CT417StudentRegistrationSystem;
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Course {

	private String name;
	private ArrayList<Module> modules;
	private ArrayList<Student> students;
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String Name, ArrayList<Module> modules, DateTime startDate, DateTime endDate){
		this.name = Name;
		this.modules = modules;
		this.startDate = startDate;
		this.endDate = endDate;
		modules = new ArrayList<Module>();
        students = new ArrayList<Student>();
	}
	
	public String toString(){
		return "Course Name: " + name + ", " + 
				"Start Date: " + startDate.toString(DateTimeFormat.shortDate()) + ", " + 
				"End Date: " + endDate.toString(DateTimeFormat.shortDate());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	public void register(Student student) {
        students.add(student);
        student.setCourse(this);
        //s.setModules(modules);

//        for(Module m : s.getModules()) {
//            m.addStudent(s);
//        }
    }
	
}
