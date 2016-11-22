package com.crimsonlogic.training.jsf;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="student")
@ViewScoped
public class StudentBean implements Cloneable,Serializable{
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
	
	public StudentBean(String id,String name,int total,long feePaid) {
		this.id=id;
		this.name = name;
		this.total = total;
		this.feePaid = feePaid;
	}
	
	public StudentBean() {	
	}
	
	
	@PostConstruct
	public void welcome() {
		feePaid=100000L;
		Object obj = FacesContext.getCurrentInstance().getExternalContext().getFlash().get(StudentBean.class.getName());
		System.out.println("is obj Null"+(obj==null));
		if(obj!=null) {
			StudentBean dto = (StudentBean)obj;
			this.setId(dto.getId());
			this.setName(dto.getName());
			this.setTotal(dto.getTotal());
			this.setStatus(dto.getStatus());
			System.out.println("ID of copy bean::"+this.id);			
		}
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
	
	public String displayResults() {
		if(total>500) {
			status = "PAAS";
		}else {
			status = "FAIL";
		}
		try {
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put(StudentBean.class.getName(), this);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "StudentStatus";
	}
	public String displayResultsInSamePage() {
		displaySummary=true;
		return "";
	}
	public String editBack() {
		displaySummary=false;
		return "";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String switchLocale() {
		Locale locale = FacesContext.getCurrentInstance().getApplication().getDefaultLocale();
		Locale hindi = new Locale("hi", "IN");
		if(locale.equals(hindi))
		FacesContext.getCurrentInstance().getApplication().setDefaultLocale(Locale.US);
		else 
			FacesContext.getCurrentInstance().getApplication().setDefaultLocale(hindi);
		return FacesContext.getCurrentInstance().getViewRoot().getViewId() +"?faces-redirect=true";
	}
	public boolean isDisplaySummary() {
		return displaySummary;
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
