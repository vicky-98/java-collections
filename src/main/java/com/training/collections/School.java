package com.training.collections;

public class School {
	
	private String name;
	private String city;
	private String district;
	private int ranking;
	
	
	public School(String name, String city, String district, int ranking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.ranking = ranking;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public int getRanking() {
		return ranking;
	}
	
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ranking;
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
//		if (ranking != other.ranking)
//			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", district=" + district + ", ranking=" + ranking + "]";
	}
	
	

}
