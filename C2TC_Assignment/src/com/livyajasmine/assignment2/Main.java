package com.livyajasmine.assignment2;

public class Main {
	 public static void main(String[] args) {
	        Commission c = new Commission();
	        c.acceptDetails();
	        double commission = c.calculateCommission();
	        System.out.println("Commission: " + commission);
	        
	    }
	}
