package com.training.collections;

public class Television {

	private String company;
	private String type;
	private String threeDEnabled;
	private double price;
	
	
	/**
	 * @param company
	 * @param type
	 * @param threeDEnabled
	 * @param price
	 */
	public Television(String company, String type, String threeDEnabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getThreeDEnabled() {
		return threeDEnabled;
	}


	public void setThreeDEnabled(String threeDEnabled) {
		this.threeDEnabled = threeDEnabled;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + ((threeDEnabled == null) ? 0 : threeDEnabled.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
//		if (threeDEnabled == null) {
//			if (other.threeDEnabled != null)
//				return false;
//		} else if (!threeDEnabled.equals(other.threeDEnabled))
//			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", threeDEnabled=" + threeDEnabled + ", price="
				+ price + "]";
	}
	
	
	
}
