package com.sh.collections.list.customer;

public class Customer implements Comparable<Customer> {
	private String name;
	private int age;
	private char gender;
	private double point;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int age, char gender, double point) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", gender=" + gender + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Customer other) {
		return this.name.compareTo(other.name);
	}
}
