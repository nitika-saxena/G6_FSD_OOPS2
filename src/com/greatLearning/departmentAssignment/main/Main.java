package com.greatLearning.departmentAssignment.main;

import com.greatLearning.departmentAssignment.service.AdminDepartment;
import com.greatLearning.departmentAssignment.service.HrDepartment;
import com.greatLearning.departmentAssignment.service.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment ad= new AdminDepartment();
		System.out.println("Welcome to "+ ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		System.out.println();
		
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to "+ hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println();
		
		TechDepartment td= new TechDepartment();
		System.out.println("Welcome to "+ td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getStackInformation());
		System.out.println(hr.isTodayAHoliday());

	}

}
