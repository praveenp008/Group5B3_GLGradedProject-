package com.glearning.dept.service;

import com.glearning.dept.model.AdminDepartment;
import com.glearning.dept.model.HRDepartment;
import com.glearning.dept.model.TechDepartment;

public interface DepartmentFunctions {

	public void displayAdminDepartment(AdminDepartment adminDepartment);

	public void displayHRDepartment(HRDepartment hrDepartment);

	public void displayTechDepartment(TechDepartment techDepartment);
}
