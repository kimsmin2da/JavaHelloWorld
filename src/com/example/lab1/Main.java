package com.example.lab1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<exercise1> list = new ArrayList<exercise1>();

	
		exercise1 s = new exercise1();
		s.setNo(1);
		s.setName("ȫ�浿 ");
		s.setAge(20);
		list.add(s);
		list.add((new exercise1(2, "ö�� ",22)));
		
		// List ������ ���
		
		//System.out.print(exercise1);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		list.remove(1);
		
		// List ������ ���
		for (exercise1 ss : list) {
			System.out.println(ss.toString());
		}
		
		
	}

}
