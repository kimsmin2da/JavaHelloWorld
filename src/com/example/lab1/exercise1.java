package com.example.lab1;

public class exercise1 {
	private int no;
	private String name;
	private int age;
	
	public exercise1() {}
	public exercise1(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return no + "-" + name + "(" + age + ")";
	
	
	
	}
}
