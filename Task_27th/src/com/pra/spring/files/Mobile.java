package com.pra.spring.files;

public class Mobile {

	private String Brand;
	private double price;
	private boolean Item_supported;

	public Mobile() {

		System.out.println("Created \t".getClass().getSimpleName());
	}

	public Mobile(String brand, double price) {
		super();
		this.Brand = brand;
		this.price = price;
	}

	public void show_values() {
		System.out.println("Brand\t" + Brand);
		System.out.println("Price\t" + price);
	}

	public boolean isItem_supported() {
		return Item_supported;
	}

	public void setItem_supported(boolean item_supported) {
		Item_supported = item_supported;
	}

}
