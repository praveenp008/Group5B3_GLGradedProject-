package com.glearning.dept.client;

import com.glearning.dept.model.AdminDepartment;
import com.glearning.dept.model.HRDepartment;
import com.glearning.dept.model.SuperDepartment;
import com.glearning.dept.model.TechDepartment;
import com.glearning.dept.service.DepartmentImpl;

public class DeptMain {

	public static void main(String[] args) {

		AdminDepartment adminDepartment = new AdminDepartment();
		DepartmentImpl departmentImpl = new DepartmentImpl();
		HRDepartment hrDepartment = new HRDepartment();
		TechDepartment techDepartment = new TechDepartment();

		System.out.println("Welcome to Admin Department");
		adminDepartment.setDepartmentName(" Admin Department");
		adminDepartment.setGetTodaysWork("Complete your documents Submission");
		adminDepartment.setGetWorkDeadline(" Complete by EOD");
		departmentImpl.displayAdminDepartment(adminDepartment);
		System.out.println();
		
		System.out.println("Welcome to HR Department");
		hrDepartment.setDepartmentName(" Hr Department ");
		hrDepartment.setGetTodaysWork(" Fill today’s timesheet and mark your attendance");
		hrDepartment.setGetWorkDeadline(" Complete by EOD");
		hrDepartment.setDoActivity("team Lunch");
		departmentImpl.displayHRDepartment(hrDepartment);
		System.out.println();
		
		System.out.println("Welcome to Tech Department");
		techDepartment.setDepartmentName(" Tech Department ");
		techDepartment.setGetTodaysWork(" Complete coding of module 1");
		techDepartment.setGetWorkDeadline(" Complete by EOD ");
		techDepartment.setGetTechStackInformation("core Java");
		departmentImpl.displayTechDepartment(techDepartment);

	}

}
