package com.knot.bank;

import java.util.ArrayList;
import java.util.List;

class Details {
	private String Name;
	private String Type;
	private Integer AccNo;
	
	public Details(String name,String type, Integer accNo) {
		super();
		Name = name;
		Type=type;
		AccNo = accNo;
	}
	@Override
	public String toString() {
		return "Details " + Name +" Type= "+Type+ " No=" + AccNo;
	}
	
}

public class Users{
	public static void main(String[] args) {
		List<Details> ll= new ArrayList<>();
		ll.add(new Details("Raghava","Credit",25));
		ll.add(new Details("Naresh","Debit",25));
		ll.add(new Details("Suresh","Debit",25));
		ll.add(new Details("Somesh","Credit",25));
		ll.add(new Details("Pritam","Debit",25));
		ll.add(new Details("Kiran","Credit",25));

		for (Details details : ll) {
			System.out.println(details);
		}
		System.out.println();
	}
}


