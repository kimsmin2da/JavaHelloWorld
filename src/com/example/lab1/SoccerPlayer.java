package com.example.lab1;

import java.util.ArrayList;
import java.util.Collections;

public class SoccerPlayer implements Comparable<SoccerPlayer>{
	private int num;
	private int age;	
	private String name;
		
	public SoccerPlayer() {}
	public SoccerPlayer(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	

	public int getnum() {
		return num;
	}

	public void setnum(int num) {
		this.num = num;
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
		return "SoccerPlayer [num=" + num +", name="+ name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(SoccerPlayer o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name); 
	}
	
public static void main(String arg[]) {
	//Create arraylist of user-defined class objects
	ArrayList<SoccerPlayer> sp =new ArrayList<SoccerPlayer>();
	
	System.out.println("SoccerPlayer List (ordered by name)");
	SoccerPlayer s1 = new SoccerPlayer(1,"기안84",38);
	sp.add(s1);
	SoccerPlayer s2 = new SoccerPlayer(2,"전현무",43);
	sp.add(s2);
	SoccerPlayer s3 = new SoccerPlayer(3,"박나래",36);
	sp.add(s3);
	SoccerPlayer s4 = new SoccerPlayer(4,"키범이",35);
	sp.add(s4);
	SoccerPlayer s5 = new SoccerPlayer(5,"장도연",34);
	sp.add(s5);
	SoccerPlayer s6 = new SoccerPlayer(6,"김광규",56);
	sp.add(s6);
	SoccerPlayer s7 = new SoccerPlayer(7,"곽도원",54);
	sp.add(s7);
	SoccerPlayer s8 = new SoccerPlayer(8,"한혜진",39);
	sp.add(s8);
	SoccerPlayer s9 = new SoccerPlayer(9,"화사",25);
	sp.add(s9);
	SoccerPlayer s10 = new SoccerPlayer(10,"이시언",41);
	sp.add(s10);
	
	
	Collections.sort(sp);
	
	for(SoccerPlayer s : sp) {
		System.out.println(s.toString());
	}
	System.out.println("SoccerPlayer List (reverse ordered by name)");

	Collections.sort(sp, Collections.reverseOrder());
	
	for(int i=0; i<sp.size(); i++) {
		System.out.println(sp.get(i).toString());
	}
	
}
}



