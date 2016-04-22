package com.dperez.UniversityMembers;

class UniversityMember {
	protected String name;
	
	protected String socialSecurityNumber;
	
	protected String address;
	
	protected String department;
	
	protected int numOfStudents = 0;
	
	public UniversityMember (String n, String ssn, String universityMemberAddress) {
		name = n;
		socialSecurityNumber = ssn;
		address = universityMemberAddress;
	}
	public String toString() {
		String s;
		s = "Name: " + name + "\n";
		s += "SSN: " + socialSecurityNumber + "\n";
		s += "Address: " + address + "\n";
		return s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public String getDepartMent() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getNumOfStudents() {
		return this.numOfStudents;
	}
}