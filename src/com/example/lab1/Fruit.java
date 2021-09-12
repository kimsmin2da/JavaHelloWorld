package com.example.lab1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Fruit {
	
	private int no;
	private int price;	
	private String name;
		
	public Fruit() {}
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPrice() {
		return price;
	}

	public void setAge(int price) {
		this.price = price;
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
		return "Fruit [no=" + no +", name="+ name + ", age=" + price + "]";
	}
	



	
public static void main(String arg[]) {
	class FruitComparator implements Comparator<Fruit>{
		
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o1.name.compareTo(o2.name); 
		}	
	}

class FruitComparatorDesc implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name); 
	}	
	
}
	
	//Create arraylist of user-defined class objects
	List<Fruit> fl =new ArrayList<Fruit>();
	
	System.out.println("Fruit List (ordered by name)");
	Fruit s1 = new Fruit(1,"사과",5000);
	fl.add(s1);
	Fruit s2 = new Fruit(2,"바나나",300);
	fl.add(s2);
	Fruit s3 = new Fruit(3,"수박",20000);
	fl.add(s3);
	Fruit s4 = new Fruit(4,"키위",8000);
	fl.add(s4);
	Fruit s5 = new Fruit(5,"딸기",9000);
	fl.add(s5);
	Fruit s6 = new Fruit(6,"배",10000);
	fl.add(s6);
	Fruit s7 = new Fruit(7,"포도",6000);
	fl.add(s7);
	Fruit s8 = new Fruit(8,"감",4000);
	fl.add(s8);
	Fruit s9 = new Fruit(9,"망고",12000);
	fl.add(s9);
	Fruit s10 = new Fruit(10,"멜론",18000);
	fl.add(s10);
	
	
	Collections.sort(fl,new FruitComparator());
	
	for(Fruit s : fl) {
		System.out.println(s.toString());
	}
	
	System.out.println("Fruit List (reverse ordered by name)");

	Collections.sort(fl, new FruitComparatorDesc());
	
	for(int i=0; i<fl.size(); i++) {
		System.out.println(fl.get(i).toString());
	}
	
}
}



//, new FruitComparator()
//
