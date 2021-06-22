package com.manan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.manan.model.Customer;
import com.manan.model.Greeting;

public class Learn {
	public void greet(Greeting greet) {
		greet.hello();
	}

	public static void main(String[] args) {
		// Learn learn = new Learn();
		// Greeter greeter = new Greeter();
		// learn.greet(greeter);
		// Functional Interface
		Greeting greet = () -> System.out.println("Hello world");
		Greeting greetHi = new Greeting() {

			@Override
			public void hello() {
				System.out.println("Hi");

			}
		};
		greet.hello();
		greetHi.hello();
		List<Customer> custList = Arrays.asList(new Customer("Manan", 60), new Customer("Shah", 10));
		// Steam and filter
		List<Customer> moreThan10 = custList.stream().filter(i -> i.getNo() > 10).collect(Collectors.toList());
		System.out.println(moreThan10);
		// Steam, filter and Map
	}
}
