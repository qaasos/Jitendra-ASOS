package com.asos.assignments;

import java.util.Scanner;


public class Location
{
	public static void main(String[] args) {
		
		String locationName, city, country, ch;
		
		System.out.println("Enter Branch location and city:");
		Scanner sc = new Scanner(System.in);
		locationName = sc.next();
		city = sc.next();
		
		System.out.println("Is the branch from same country? [Y/N]");
		
		ch = sc.next();
		
		if(ch.equals("Y"))
		{
			Location2 lc = new Location2(locationName, city);
			lc.display();
			
		}
		
		else
		{
			System.out.println("Enter country name:");
			country = sc.next();
			
			Location2 lc = new Location2(locationName, city, country);
			lc.display();
		}
		
		
	}
}
