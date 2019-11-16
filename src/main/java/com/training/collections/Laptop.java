package com.training.collections;

/**
 * @author vk50
 *
 */

public class Laptop {

	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	
	/**
	 * @param company
	 * @param model
	 * @param operatingSystem
	 * @param processor
	 */
	public Laptop(String company, String model, String operatingSystem, String processor) {
		
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
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


	/**
	 * @return
	 */
	public String getProcessor() {
		return processor;
	}


	/**
	 * @param processor
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
//		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
//		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
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
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
//		if (operatingSystem == null) {
//			if (other.operatingSystem != null)
//				return false;
//		} else if (!operatingSystem.equals(other.operatingSystem))
//			return false;
//		if (processor == null) {
//			if (other.processor != null)
//				return false;
//		} else if (!processor.equals(other.processor))
//			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}
	
	
	
	
}
