package com.MethodOverloadingExample;

public class ProductSearch {
	

	    public void search(String productName) {
	        System.out.println("Searching Product: " + productName);
	    }

	    public void search(String productName, String category) {
	        System.out.println("Searching Product: " + productName + " Category: " + category);
	    }

	    public void search(int price) {
	        System.out.println("Searching Products under Price: " + price);
	    }

	    public void search(String brand, int price) {
	        System.out.println("Searching Brand: " + brand + " under Price: " + price);
	    }

	    public static void main(String[] args) {

	        ProductSearch ps = new ProductSearch();

	        ps.search("Laptop");
	        ps.search("Laptop", "Electronics");
	        ps.search(50000);
	        ps.search("HP", 70000);

	    }
	}


