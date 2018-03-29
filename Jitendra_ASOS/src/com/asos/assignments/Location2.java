package com.asos.assignments;

public class Location2 {

	String locationName, city, country;
	
	Location2(String locationName, String city)
	{
		this.locationName = locationName;
		this.city = city;
		this.country = "India";
	}
	
	Location2(String locationName, String city, String country)
	{
		
		this.locationName = locationName;
		this.city = city;
		this.country = country;
	}
	
	
	public void display()
	{
		System.out.println(locationName + "-" + city + "-" + country );
	}

}