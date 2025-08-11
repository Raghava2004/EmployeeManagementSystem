package com.knot.bank;

//import java.util.ArrayList;
//import java.util.List;

class Info {
	private String name;
	private String num;
	private String email;
	public Info(String name, String num, String email) {
		super();
		this.name = name;
		this.num = num;
		this.email = email;
	}
	
	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Info [name=" + name + ", num=" + num + ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}

/*
 * public class UserService{ public static void main(String[] args) { List<Info>
 * ll= new ArrayList<>(); ll.add(new Info("Ragha"," 9533922555","fgh"));
 * ll.add(new Info("Ragha"," ffg","fgh")); ll.add(new
 * Info("Ragha"," ffg","fgh")); ll.add(new Info("Ragha"," ffg","fgh")); for(Info
 * info: ll) { System.out.println(info); } // System.out.println(ll(0));
 * System.out.println("Success");
 * 
 * 
 * 
 * } }
 */













