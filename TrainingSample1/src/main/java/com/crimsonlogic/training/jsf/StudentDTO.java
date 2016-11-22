package com.crimsonlogic.training.jsf;

import java.io.Serializable;

public class StudentDTO implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private int total;
	private String status;
	private boolean displaySummary=false;
	private long feePaid;
	
	public StudentDTO(String id,String name,int total,long feePaid) {
		this.id=id;
		this.name = name;
		this.total = total;
		this.feePaid = feePaid;
	}
	
	public StudentDTO() {	
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		System.out.println("In ID Setting value::"+id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("In Name Setting value::"+name);
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		System.out.println("In Total Setting value::"+total);
		this.total = total;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setDisplaySummary(boolean displaySummary) {
		this.displaySummary = displaySummary;
	}


	public long getFeePaid() {
		return feePaid;
	}


	public void setFeePaid(long feePaid) {
		this.feePaid = feePaid;
	}
	
}
