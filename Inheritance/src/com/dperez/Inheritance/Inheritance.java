package com.dperez.Inheritance;
import com.dperez.Departments.AcademicDepartment;
import com.dperez.Departments.NonAcademicDepartment;
import com.dperez.UniversityMembers.Faculty;
import com.dperez.UniversityMembers.Student;
import com.dperez.UniversityMembers.SupportPersonnel;

public class Inheritance {
	public static void main(String[] args) {
		// create two departments
	    AcademicDepartment d1 = new AcademicDepartment("Computer Science");
	    NonAcademicDepartment d2 = new NonAcademicDepartment("Parking Office");
	    
	    // create four students
	    Student s1 = new Student("Joe Candy","111-11-1111","Boca Raton",d1);
	    Student s2 = new Student("Ken Bowen","222-22-2222","Boca Raton",d1);
	    Student s3 = new Student("Cindy Clark","333-33-3333","Boca Raton",d1);
	    Student s4 = new Student("Tom Hanks","444-44-4444","West Palm Beach",d1);
	    
	    // create two faculty members
	    Faculty f1 = new Faculty("Jon Doe","555-55-5555","Boca Raton",d1,"Associate Professor");
	    Faculty f2 = new Faculty("Ron Murray","666-66-6666","Miami",d1,"Assistant Professor");
	    
	    // create two support-personnel
	    SupportPersonnel p1 = new SupportPersonnel("John Black","777-77-7777","Boca Raton",d1);
	    SupportPersonnel p2 = new SupportPersonnel("Jill White","888-88-8888","Jupiter",d2);
	    
	    // add employees into the departments
	    d1.addEmployee(f1);		d1.addEmployee(f2);
	    d1.addEmployee(p1);		d2.addEmployee(p2);
	    
	    // add students into academic departments
	    d1.addStudent(s1);		d1.addStudent(s2);
	    d1.addStudent(s3);		d1.addStudent(s4);
	    
	    // set the advisors of the students
	    s1.setAdvisor(f1);		s2.setAdvisor(f1);
	    s3.setAdvisor(f1);		s4.setAdvisor(f2);
	    
	    // print out the departments (using toString methods)
	    System.out.println(d1);
	    System.out.println(d2);
	}
}