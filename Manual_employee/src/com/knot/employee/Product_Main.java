package com.knot.employee;

import java.util.ArrayList;
import java.util.List;

import com.knot.model.Product;


public class Product_Main {
	public static void main(String[] args) {
		List<Product> ll=new ArrayList<>();
		ll.add(new Product(25, "Chips", 202522));
		for (Product product : ll) {
			System.out.println(product);

		}
	}
}
