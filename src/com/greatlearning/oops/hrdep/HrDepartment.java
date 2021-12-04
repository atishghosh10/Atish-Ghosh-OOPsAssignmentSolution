package com.greatlearning.oops.hrdep;

import com.greatlearning.oops.superdep.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to Hr Department";
	}

	public String doActivity() {
		return "team Lunch";
	}

	public String getTodaysWork() {
		return "Fill today�s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
