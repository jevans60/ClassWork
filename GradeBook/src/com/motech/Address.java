package com.motech;

public class Address
{
	private int id;
	private AddressType addressType;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String postalCode;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public AddressType getAddressType()
	{
		return addressType;
	}
	
	public void setAddressType(AddressType addressType)
	{
		this.addressType = addressType;
	}
	
	public String getAddressLine1()
	{
		return addressLine1;
	}
	
	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1 = addressLine1;
	}
	
	public String getAddressLine2()
	{
		return addressLine2;
	}
	
	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2 = addressLine2;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getPostalCode()
	{
		return postalCode;
	}
	
	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}
}
