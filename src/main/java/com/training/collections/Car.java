package com.training.collections;

/**
 * @author vk50
 *
 */
public class Car implements Comparable<Car> {

	private String make;
	private String model;
	private int year;
	private double price;
	
	/**
	 * @param make
	 * @param model
	 * @param year
	 * @param price
	 */
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	/**
	 * @return
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}


	/**
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(price);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + year;
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
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
//		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
//			return false;
//		if (year != other.year)
//			return false;
		return true;
	}

	@Override
    public int compareTo(Car o) {
		
		int a=this.make.compareTo(o.make);
		if(a<0) return-1;
		if(a>0 ) return 1 ;
		return 0;
	
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
}
