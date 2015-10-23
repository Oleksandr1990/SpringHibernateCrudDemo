package com.oleksiienko.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="managers")
public class Manager {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int managerId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int monthSalary;
	
	public Manager(){}
	public Manager(int studentId, String firstName, String lastName,
			int monthSalary) {
		super();
		this.managerId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthSalary = monthSalary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	
	
}
