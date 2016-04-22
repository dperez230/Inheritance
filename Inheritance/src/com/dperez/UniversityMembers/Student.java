package com.dperez.UniversityMembers;
import com.dperez.Departments.AcademicDepartment;

public class Student extends UniversityMember {
	protected String advisor;
	public Student (String n, String ssn, String universityMemberAddress, AcademicDepartment i) {
		super(n, ssn, universityMemberAddress);
		advisor = "";
	}
	public void setAdvisor (Faculty i) {
		if (numOfStudents >= 100 ) {
			return;
		}
		advisor = i.name;
		i.studentList[i.numOfStudents] = this;
		i.numOfStudents++;
	}
	public String toString() {
		String s = super.toString();
		s += "Advisor: " + advisor + "\n";
		return s;	
	}
}