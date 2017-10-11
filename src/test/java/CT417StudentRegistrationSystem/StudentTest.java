package CT417StudentRegistrationSystem;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTest {
	
	@Test
	public void testUserName() {
		
		//generate student object
		Student student = new Student("Charles McHugh", 21, "21/02/1996");
//		student.setName();
//		student.setAge(21);
//		student.setDOB("21/02/1996");
//		student.setID(01);
//		student.setUsername("Charles McHugh21");
		
		String expected = student.getUsername();
		assertEquals(expected, "Charles McHugh21");		
		
	}

}
