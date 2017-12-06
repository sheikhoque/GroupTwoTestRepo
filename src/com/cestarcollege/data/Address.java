package com.cestarcollege.data;

public class Address implements Comparable<Address>{

	private int streetNo;
	private String streetName;
	private String postalCode;

	public Address(int streetNo, String streetName, String postalCode) {
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
		this.postalCode = postalCode;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + ", postalCode=" + postalCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + streetNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (streetNo != other.streetNo)
			return false;
		return true;
	}

	@Override
	public int compareTo(Address that) {
		return (this.getStreetNo() <that.getStreetNo())?1:-1;
	}
	
	

}
