package com.Dao1;



import com.entity1.Employee;


public class EmployeeDao { 
	
	Employee e1 = new Employee(3, "Shahid kapoor", "Developer", 50000);
	Employee e2 = new Employee(2, "Salman Khan", "Manager", 55000);
	Employee e3 = new Employee(5, "Ranvir Singh", "CEO", 60000);
	Employee e4 = new Employee(7, "Vicky Kaushal", "Developer", 65000);
	Employee e5 = new Employee(4, "Shah Khan", "Admin", 70000);
	Employee e6 = new Employee(1, "Amir Khan", "HR", 75000);
	Employee e7 = new Employee(9, "Varun Dhavan", "Administrator", 80000);
	Employee e8 = new Employee(6, "Vicky Sharma", "Tester", 85000);
	Employee e9 = new Employee(10, "Tiger Shroff", "Analyst", 90000);
	Employee e10 = new Employee(8, "Dev Gill", "Corporator", 95000);

	Employee[] Emp = new Employee[10];
	// private com.entity.Employee Employee;

	public Employee EmployeeshowID(int id) {

		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;
		int index = id - 1;
		return Emp[index];
	}

	public Employee[] EmployeeShowAll() {
		
		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;
		
		return Emp;

	}

	public void EmployeeShowroll(String roll) {
		
		Emp[0]=e1;
		Emp[1]=e2;
		Emp[2]=e3;
		Emp[3]=e4;
		Emp[4]=e5;
		Emp[5]=e6;
		Emp[6]=e7;
		Emp[7]=e8;
		Emp[8]=e9;
		Emp[9]=e10;
		
		for (Employee employee : Emp) {
			if(employee.getRoll().equalsIgnoreCase(roll)) {
				System.out.println(employee);
			}
			
		}
		System.out.println("-------------------------------------------------");
	}

	public void Employeeshowmaxsal() {
		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;
		
		Employee Max = Emp[0];
		for (Employee e : Emp) {
			if (e.getSalary() > Max.getId()) {
				Max = e;

			}

		}
		System.out.println("Max salary of" + Max.getSalary());

	}
	public void EmployeeShowMinsal() {
		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;

		Employee Min = Emp[0];
		for (Employee t : Emp) {
			if (t.getSalary() < Min.getSalary()) {
				Min = t;
			}
		}
		
		System.out.println("Min salary of:" + Min.getSalary());
	}
	
	public Employee Ascending() {
		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;
		Employee temp = Emp[0];
		
		for(int i= 0; i < Emp.length;++i) {
			for (int j = i + 1; j < Emp.length;j++) {
				if (Emp[i].getId() > Emp[j].getId()) {
					
					temp = Emp[i];
					Emp[i] = Emp[j];
					Emp[j] = temp;
					
					}
				}
			}
		for(Employee employee : Emp) {
			System.out.println(employee);
			
			}
		return temp;
		}
	public Employee Descending() {
		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[8] = e8;
		Emp[9] = e9;
		Employee temp= Emp[0];
		
		for(int i= 0; i < Emp.length;++i) {
			for (int j = i + 1; j < Emp.length; j++) {
				if (Emp[i].getId() < Emp[j].getId()) {
					
					temp = Emp[i];
					Emp[i] = Emp[j];
					Emp[j] = temp;
					
					}
				}
			}
		for(Employee employee : Emp) {
			System.out.println(employee);
			
		}
		return temp;
	}
}
