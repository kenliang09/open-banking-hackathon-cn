package com.hackathon.ob.futureinvestor.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CheckPrice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -199474881453419220L;

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false, unique = true)
	private Float price;
	@Column(nullable = false, unique = true)
	private String produced;
	
	public CheckPrice() {
		super();
	}
	public CheckPrice(Long id, String name, Float price, String produced) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.produced = produced;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getProduced() {
		return produced;
	}
	public void setProduced(String produced) {
		this.produced = produced;
	}
	
}
