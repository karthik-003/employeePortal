package com.karvis.client;

import com.karvis.model.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee e = new Employee(1, "Karthik", 9004578369L, "karthikdy@gmail.com","22/05/1992");
		System.out.println(e.toString());
	}
}
