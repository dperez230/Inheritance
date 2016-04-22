package com.dperez.UniversityMembers;
import com.dperez.Departments.AcademicDepartment;
import com.dperez.Departments.NonAcademicDepartment;

public class SupportPersonnel extends Employee {
	public SupportPersonnel (String n, String ssn, String universityMemberAddress, NonAcademicDepartment i) {
		super(n, ssn, universityMemberAddress);
		department = "SupportPersonnel";
	}
	
	public SupportPersonnel (String n, String ssn, String universityMemberAddress, AcademicDepartment i) {
		super(n, ssn, universityMemberAddress);
		department = "SupportPersonnel";
	}

	public String toString() {
		String s = "SupportPersonnel\n";
		s += super.toString();
		return s;
	}
}