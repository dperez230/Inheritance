package com.dperez.UniversityMembers;

public class Employee extends UniversityMember {
	public Employee (String n, String ssn, String universityMemberAddress) {
		super(n, ssn, universityMemberAddress);
	}
	public String toString() {
		String s = super.toString();
		return s;
	}
}