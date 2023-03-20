package com.glearning.dept.service;

import com.glearning.dept.model.AdminDepartment;
import com.glearning.dept.model.HRDepartment;
import com.glearning.dept.model.SuperDepartment;
import com.glearning.dept.model.TechDepartment;

public class DepartmentImpl implements DepartmentFunctions {

	public void displayAdminDepartment(AdminDepartment adminDepartment) {
		System.out.println(adminDepartment.getDepartmentName());
		System.out.println(adminDepartment.getGetTodaysWork());
		System.out.println(adminDepartment.getGetWorkDeadline());
		System.out.println(adminDepartment.getIsTodayAHoliday());
	}

	@Override
	public void displayHRDepartment(HRDepartment hrDepartment) {
		System.out.println(hrDepartment.getDepartmentName());
		System.out.println(hrDepartment.getDoActivity());
		System.out.println(hrDepartment.getGetTodaysWork());
		System.out.println(hrDepartment.getGetWorkDeadline());
		System.out.println(hrDepartment.getIsTodayAHoliday());
	}

	@Override
	public void displayTechDepartment(TechDepartment techDepartment) {
		System.out.println(techDepartment.getDepartmentName());
		System.out.println(techDepartment.getGetTodaysWork());
		System.out.println(techDepartment.getGetWorkDeadline());
		System.out.println(techDepartment.getGetTechStackInformation());
		System.out.println(techDepartment.getIsTodayAHoliday());

	}

	public void displaySuperDepartment(SuperDepartment superDepartment) {
		System.out.println(superDepartment.getDepartmentName());
		System.out.println(superDepartment.getGetTodaysWork());
		System.out.println(superDepartment.getGetWorkDeadline());
		System.out.println(superDepartment.getIsTodayAHoliday());

	}
}
