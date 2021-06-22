package com.manan.model;

public class Customer {
	private String name;
	private int no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", no=" + no + "]";
	}

}
