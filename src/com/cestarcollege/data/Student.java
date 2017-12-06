package com.cestarcollege.data;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student>{

	private int studentId;
	private String firstName;
	private String lastName;
	private Address studentAddress;
	
	private Set<Course> studentCourses;
	public Student(int studentId, String firstName, String lastName, Address studentAddress) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentAddress = studentAddress;
	}
	
	public boolean addCourses(Course c){
		if(studentCourses==null)
			studentCourses = new HashSet<>();
		return studentCourses.add(c);
	}
	
	public boolean removeCourses(Course c){
		if(studentCourses==null)
			return false;
		return studentCourses.remove(c);
	}
	
	
	public int getStudentId() {
		return studentId;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public Address getStudentAddress() {
		return studentAddress;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((studentAddress == null) ? 0 : studentAddress.hashCode());
		result = prime * result + studentId;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (studentAddress == null) {
			if (other.studentAddress != null)
				return false;
		} else if (!studentAddress.equals(other.studentAddress))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", studentAddress=" + studentAddress + "]";
	}



	@Override
	public int compareTo(Student o) {
		return this.getStudentId()<o.getStudentId()?-1:1;
	}
	
	
	
	public int getNumberOfCourses(){
		if(studentCourses==null)
			return 0;
		return studentCourses.size();
	}
	
	
}
