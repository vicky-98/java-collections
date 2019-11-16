package com.training.collections;

/**
 * @author vk50
 *
 */
public class CellPhone {

	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private int price;
	
	
	


	/**
	 * @param company
	 * @param model
	 * @param description
	 * @param operatingSystem
	 * @param price
	 */
	public CellPhone(String company, String model, String description, String operatingSystem, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	/**
	 * @return
	 */
	public String getCompany() {
		return company;
	}


	/**
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
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
	public String getOperatingSystem() {
		return operatingSystem;
	}


	/**
	 * @param operatingSystem
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
//		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
//		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
//		if (description == null) {
//			if (other.description != null)
//				return false;
//		}
	else if (!description.equals(other.description))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
//		if (price == null) {
//			if (other.price != null)
//				return false;
//		} else if (!price.equals(other.price))
//			return false;
		return true;
	}



	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}


	
}
