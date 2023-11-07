package com.xworkz.app.dto;

public class TheaterDTO implements Comparable<TheaterDTO> {
	private String name;
	private String location;
	private float rating;
	private String movieName;

	public TheaterDTO() {
		super();
	}

	public TheaterDTO(String name, String location, float rating, String movieName) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.movieName = movieName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", location=" + location + ", rating=" + rating + ", movieName=" + movieName
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TheaterDTO other = (TheaterDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		return true;
	}

	@Override
	public int compareTo(TheaterDTO argument) {
		TheaterDTO current = this;
		return current.name.compareTo(argument.name);

	}

}
