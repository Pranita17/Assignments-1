package com.cognizant.moviecruiser.model;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Movies {
	
	
	private long id;
	private String title;
	private BigInteger boxOffice;
	private boolean active;
	private Date dateOfLaunch;
	private String genre;
	private boolean teaser;
	
	public Movies(long id, String title, BigInteger boxOffice, boolean active, Date dateOfLaunch, String genre,
			boolean teaser) {
		this.id = id;
		this.title = title;
		this.boxOffice = boxOffice;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.genre = genre;
		this.teaser = teaser;
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigInteger getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(BigInteger boxOffice) {
		this.boxOffice = boxOffice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean hasTeaser() {
		return teaser;
	}

	public void setTeaser(boolean teaser) {
		this.teaser = teaser;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s",id,title,active, new SimpleDateFormat("dd/MM/yyyy").format(dateOfLaunch), genre,teaser);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Movies other = (Movies) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
