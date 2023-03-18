package com.glearning.dept.model;

public class SuperDepartment {

	protected String departmentName;
	protected String getTodaysWork;
	protected String getWorkDeadline;
	public static final String isTodayAHoliday = "Today is not a Holiday";

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getGetTodaysWork() {
		return getTodaysWork;
	}

	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}

	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}

	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}

}
