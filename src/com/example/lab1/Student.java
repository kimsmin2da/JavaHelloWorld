package com.example.lab1;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	private int no;
	private int age;	
	private String name;
		
	public Student() {}
	public Student(int no, String name, int age) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [no=" + no +", name="+ name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name); 
	}
	
public static void main(String arg[]) {
	//Create arraylist of user-defined class objects
	ArrayList<Student> al =new ArrayList<Student>();
	
	System.out.println("Student List (ordered by name)");
	Student s1 = new Student(1,"기안84",38);
	al.add(s1);
	Student s2 = new Student(2,"전현무",43);
	al.add(s2);
	Student s3 = new Student(3,"박나래",36);
	al.add(s3);
	Student s4 = new Student(4,"키범이",35);
	al.add(s4);
	Student s5 = new Student(5,"장도연",34);
	al.add(s5);
	Student s6 = new Student(6,"김광규",56);
	al.add(s6);
	Student s7 = new Student(7,"곽도원",54);
	al.add(s7);
	Student s8 = new Student(8,"한혜진",39);
	al.add(s8);
	Student s9 = new Student(9,"화사",25);
	al.add(s9);
	Student s10 = new Student(10,"이시언",41);
	al.add(s10);
	
	
	Collections.sort(al);
	
	for(Student s : al) {
		System.out.println(s.toString());
	}
	System.out.println("Student List (reverse ordered by name)");

	Collections.sort(al, Collections.reverseOrder());
	
	for(int i=0; i<al.size(); i++) {
		System.out.println(al.get(i).toString());
	}
	
}
}



