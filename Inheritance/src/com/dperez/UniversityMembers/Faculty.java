package com.dperez.UniversityMembers;
import com.dperez.Departments.AcademicDepartment;

public class Faculty extends Employee {
	protected String academicTitle;
	
	protected Student [] studentList;
	static int countStudent = 0;

	public Faculty (String n, String ssn, String universityMemberAddress, AcademicDepartment i, String title) {
		super(n, ssn, universityMemberAddress);
		studentList = new Student[100];
		academicTitle = title;
		department = "Faculty";
	}
	
	public String toString() {
		String s = "Faculty\n";
		s += super.toString();
		s += "Academic Title: " + academicTitle + "\n";
		return s;
	}
}