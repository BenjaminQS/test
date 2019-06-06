package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int level;
	private int salary;
	private int years;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "Employee [level=" + level + ", salary=" + salary + ", years=" + years + "]";
	}

}

public class Test {

	// 按级别工资入职年数递减排序
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		Employee e = new Employee();
		e.setLevel(1);
		e.setSalary(300);
		e.setYears(4);
		list.add(e);

		e = new Employee();
		e.setLevel(1);
		e.setSalary(500);
		e.setYears(4);
		list.add(e);

		e = new Employee();
		e.setLevel(2);
		e.setSalary(500);
		e.setYears(4);
		list.add(e);

		e = new Employee();
		e.setLevel(2);
		e.setSalary(300);
		e.setYears(5);
		list.add(e);
		
		e = new Employee();
		e.setLevel(2);
		e.setSalary(300);
		e.setYears(4);
		list.add(e);
		Collections.sort(list, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				int a = e1.getLevel() - e2.getLevel();
				if (a != 0) {
					return a > 0 ? -1 : 1;
				}
				a = e1.getSalary() - e2.getSalary();
				if (a != 0) {
					return a > 0 ? -1 : 1;
				}
				a = e1.getYears() - e2.getYears();
				return a > 0 ? -1 : 1;
			}
		});

		for (Employee em : list) {
			System.out.println(em);
		}
	}

}