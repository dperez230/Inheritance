package com.dperez.Departments;
class Department {
	protected String name;
	
	public Department (String n) {
		name = n;
	}
	public String toString() {
		String s;
		s = "====================================\n";
		s += "Department Name: " + name + "\n";
		return s;
	}
}