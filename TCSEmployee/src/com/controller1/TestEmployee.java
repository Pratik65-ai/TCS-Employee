package com.controller1;

import com.entity1.Employee;
import com.Dao1.EmployeeDao;
public class TestEmployee {
	public static void main(String[] args) {
		EmployeeDao e1=new EmployeeDao();
		//EmployeeeDao e1 = new EmployeeeDao();
		
	
		System.out.println("*************Employee of Id****************");
		System.out.println(e1.EmployeeshowID(4));
		//System.out.println(e1.EmployeeShowAll()); 
		System.out.println("-------------*************Show All Employee**************-------------");
		Employee[] Employee = e1.EmployeeShowAll();
		
		for(Employee e : Employee) {
			System.out.println(e);
		}
		System.out.println("----------  Roll of Employee---------");
		
		e1.EmployeeShowroll("Tester");
		System.out.println("**********Max and Min Salary***********");
		e1.Employeeshowmaxsal();
		e1.EmployeeShowMinsal();
		System.out.println("**********Ascending Order****************");
		e1.Ascending();
		System.out.println("**********Descending Order****************");
		e1.Descending();
	}

}
