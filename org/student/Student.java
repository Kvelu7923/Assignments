package org.student;

import org.department.Department;

public class Student extends Department {
 public void studentName() {
	 System.out.println("Kathir");
 }
 public void studentDpt() {
	 System.out.println("Computer Science");	 
 }
 public void studentId() {
	 System.out.println("86");
 }
 public static void main(String[] args) {
	
	 Student details=new Student();
	 details.collegeName();
	 details.collegeCode();
	 details.collegeRank();
	 details.deptName();
	 details.studentName();
	 details.studentDpt();
	 details.studentId();
	 
	 
}
}
