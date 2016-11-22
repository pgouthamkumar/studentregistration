package com.crimsonlogic.training.jsf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class DataTableBean {
	private List<StudentDTO> students;
	private List<String> states;
	private Map<String,List<String>> districts;
	private String currentDistrict;
	private String curentState;

	@PostConstruct
	public void init() {
		this.students = new ArrayList<StudentDTO>();
		StudentDTO st1 = new StudentDTO("dh","dsjagf",463,57484);
		this.students.add(st1);
		st1 = new StudentDTO("dh1","dsjagf1",463,3457484);
		this.students.add(st1);
		st1 = new StudentDTO("dh2","jsdfgsd",463,432574);
		this.students.add(st1);
		setStates(new ArrayList<String>());
		setDistricts(new HashMap<String, List<String>>());
		getStates().add("Karnataka");
		getStates().add("Andhra Pradesh");
		getStates().add("Telangana");
		getStates().add("Kerala");
		getStates().add("Tamil Nadu");
		
		List<String> district = new ArrayList<String>();
		district.add("Belguam");
		district.add("Bangalore");
		district.add("Mysore");
		district.add("Darwad");
		district.add("Chibalapur");
		district.add("Kolar");
		this.getDistricts().put("Karnataka", district);
		district = new ArrayList<String>();
		district.add("Chittoor");
		district.add("Kurnool");
		district.add("Cuddapah");
		district.add("Nellore");
		district.add("Godavari");
		district.add("Vijayavada");
		this.getDistricts().put("Andhra Pradesh", district);
	}
	
	public List<StudentDTO> getStudents() {
		return students;
	}

	public void setStudents(List<StudentDTO> students) {
		this.students = students;
	}

	public List<String> getStates() {
		return states;
	}

	public void setStates(List<String> states) {
		this.states = states;
	}

	public Map<String,List<String>> getDistricts() {
		return districts;
	}

	public void setDistricts(Map<String,List<String>> districts) {
		this.districts = districts;
	}

	public String getCurentState() {
		return curentState;
	}

	public void setCurentState(String curentState) {
		this.curentState = curentState;
	}

	public String getCurrentDistrict() {
		return currentDistrict;
	}

	public void setCurrentDistrict(String currentDistrict) {
		this.currentDistrict = currentDistrict;
	}
}
