package com.glearning.dept.client;

import com.glearning.dept.model.AdminDepartment;
import com.glearning.dept.model.HRDepartment;
import com.glearning.dept.model.SuperDepartment;
import com.glearning.dept.model.TechDepartment;
import com.glearning.dept.service.DepartmentImpl;

public class Main {

	public static void main(String[] args) {

		SuperDepartment superDepartment = new SuperDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
		DepartmentImpl departmentImpl = new DepartmentImpl();
		HRDepartment hrDepartment = new HRDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		superDepartment.setDepartmentName("Super Department");
		superDepartment.setGetTodaysWork("Complete your documents Submission");
		superDepartment.setGetWorkDeadline("Nil");
	//	departmentImpl.displaySuperDepartment(superDepartment);
	//	System.out.println();

		adminDepartment.setDepartmentName("Welcome to Admin Department");
		adminDepartment.setGetTodaysWork("Complete your documents Submission");
		adminDepartment.setGetWorkDeadline("Complete by EOD");
		departmentImpl.displayAdminDepartment(adminDepartment);
		System.out.println();

		hrDepartment.setDepartmentName("Welcome to HR Department");
		hrDepartment.setDoActivity("team Lunch");
		hrDepartment.setGetTodaysWork("Fill today\'s timesheet and mark your attendance");
		hrDepartment.setGetWorkDeadline("Complete by EOD");
		departmentImpl.displayHRDepartment(hrDepartment);
		System.out.println();

		techDepartment.setDepartmentName("Welcome to Tech Department");
		techDepartment.setGetTodaysWork("Complete coding of Module 1");
		techDepartment.setGetWorkDeadline("Complete by EOD ");
		techDepartment.setGetTechStackInformation("Core Java");
		departmentImpl.displayTechDepartment(techDepartment);

	}

}
